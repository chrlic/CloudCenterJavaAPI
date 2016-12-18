package cz.gargoyle.c3.api.appl

import com.google.gson.Gson
import cz.gargoyle.c3.api.session.C3Session
import groovy.json.JsonSlurper
import java.util.zip.ZipEntry
import java.util.zip.ZipInputStream
import java.util.zip.ZipOutputStream
import org.apache.http.HttpEntity
import org.apache.http.HttpResponse
import org.apache.http.client.HttpClient
import org.apache.http.client.methods.CloseableHttpResponse
import org.apache.http.client.methods.HttpPost
import org.apache.http.entity.mime.MultipartEntityBuilder
import org.apache.http.entity.mime.HttpMultipartMode
import org.apache.http.entity.mime.content.ByteArrayBody
import org.apache.http.entity.mime.content.InputStreamBody
import org.apache.http.entity.ContentType


class C3Application {

	String url = "/v1/apps"

	Applications listApplications(C3Session session) {
		HttpResponse response = session.get(url)
		Applications apps

		String responseAppText = session.streamToString( response.getEntity().getContent() )

		Gson gson = new Gson()
		apps = gson.fromJson(responseAppText, Applications.class)

		return apps
	}

	ApplicationDetails getApplicationDetails(C3Session session, String appId) {
		HttpResponse response = session.get(url + "/" + appId)
		ApplicationDetails appDetails

		String responseAppText = session.streamToString( response.getEntity().getContent() )

		Gson gson = new Gson()
		appDetails = gson.fromJson(responseAppText, ApplicationDetails.class)

		return appDetails

	}

	ApplicationBundle appExport(C3Session session, String appId) {

		String url = "/v1/apps/portation?appId=${appId}"

		HttpResponse response = session.get(url)

		ApplicationBundle model = new ApplicationBundle()
		ZipInputStream zis = new ZipInputStream(response.getEntity().getContent())
		ZipEntry entry
		while((entry = zis.getNextEntry()) != null) {
			String entryName = entry.getName()
			println entryName

			int count
			final int BUFFER_LENGTH = 1024
			byte[] data = new byte[BUFFER_LENGTH]
			while ((count = zis.read(data, 0, BUFFER_LENGTH)) != -1) {
				byte[] cleanData = new byte[count]
				for (int i = 0; i < count; i++) cleanData[i] = data[i]
				if (entryName.contains(".json")) {
					model.jsonModel += new String(cleanData)
					model.jsonModelFilename = entryName
				} else if (entryName.contains("logo.png")) {
					model.logoStream.write(cleanData)
					model.logoFilename = entryName
				} else if (entryName.contains(".xml")) {
					model.xmlDescriptor += new String(cleanData)
					model.xmlDescriptorFilename = entryName
				}
			}
		}

		println model.xmlDescriptor
		println model.jsonModel
		return model
	}
	
	String appImport(C3Session session, ApplicationBundle model) {

		String url = "/v1/apps/portation"
		
//		FileOutputStream dest = new FileOutputStream("/Users/mdivis/Downloads/test.zip");
		
		ByteArrayOutputStream outStream = new ByteArrayOutputStream()
		ZipOutputStream zos = new ZipOutputStream(outStream)
		
		zos.putNextEntry(new ZipEntry(model.jsonModelFilename))
		zos.write(model.jsonModel.getBytes())
		
		zos.putNextEntry(new ZipEntry(model.logoFilename))
		model.logoStream.writeTo(zos)
		
		zos.putNextEntry(new ZipEntry(model.xmlDescriptorFilename))
		zos.write(model.xmlDescriptor.getBytes())
		zos.close()

		byte[] toBeSent = outStream.toByteArray()
		println toBeSent.length
		
		HttpClient httpClient = session.httpClient
		HttpPost httpPost = new HttpPost("${session.protocol}://${session.host}${url}")

		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
		builder.addPart("file", new ByteArrayBody(toBeSent,ContentType.create("application/zip"),"file"));
		HttpEntity entity = builder.build();
		httpPost.setEntity(entity);

		CloseableHttpResponse response
		try {
			response = httpClient.execute(httpPost);
		} catch (Exception e) {
			e.printStackTrace()
		}

		int httpStatus = response.getStatusLine().getStatusCode();
		println httpStatus

		String responseSubmitText = session.streamToString( response.getEntity().getContent() )
		println responseSubmitText

		return httpStatus
	}
}
