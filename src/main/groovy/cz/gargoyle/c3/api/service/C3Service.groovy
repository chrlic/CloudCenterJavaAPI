package cz.gargoyle.c3.api.service

import com.google.gson.Gson
import cz.gargoyle.c3.api.session.C3Session
import org.apache.http.HttpEntity
import org.apache.http.HttpResponse
import org.apache.http.NameValuePair
import org.apache.http.client.HttpClient
import org.apache.http.client.methods.CloseableHttpResponse
import org.apache.http.client.methods.HttpPost
import org.apache.http.entity.mime.MultipartEntityBuilder
import org.apache.http.entity.mime.content.FileBody
import org.apache.http.entity.mime.content.StringBody
import org.apache.http.message.BasicNameValuePair
import org.apache.http.entity.mime.HttpMultipartMode
import org.apache.http.entity.ContentType

class C3Service {

	Services getServices(C3Session session, String tenantId) {
		int pageCounter = 0
		String url = "/v1/tenants/${tenantId}/services?page=${pageCounter}"
		
		HttpResponse response = session.get(url)
		int httpStatus = response.getStatusLine().getStatusCode();
		
		String responseText = session.streamToString( response.getEntity().getContent() )

		Gson gson = new Gson()
		Services services = gson.fromJson(responseText, Services.class)
		if (services.totalPages > 1) {
			pageCounter++
			url = "/v1/tenants/${tenantId}/services?page=${pageCounter}"
			response = session.get(url)
			httpStatus = response.getStatusLine().getStatusCode();
			
			responseText = session.streamToString( response.getEntity().getContent() )
			Services nextServices = gson.fromJson(responseText, Services.class)
			nextServices.services.each {
				services.services.add(it)
				services.size++
			}
		}
		
		return services
	}
	
	int createService(C3Session session, String tenantId, Service service) {
		String url = "/v1/tenants/${tenantId}/services"
		
		Gson gson = new Gson()
		String serviceJson = gson.toJson(service)
		HttpResponse response = session.post(url, serviceJson)
		
		int httpStatus = response.getStatusLine().getStatusCode();
		
		String responseText = session.streamToString( response.getEntity().getContent() )
		
		return httpStatus
	}
	
	String uploadLogo(C3Session session, String logoPath) {
		String url = "/appstore/upload"

		HttpClient httpClient = session.httpClient
		HttpPost httpPost = new HttpPost("${session.protocol}://${session.host}${url}")
		File file = new File(logoPath);
		FileBody fileBody = new FileBody(file, ContentType.DEFAULT_BINARY);
		//StringBody stringBody1 = new StringBody("Message 1", ContentType.MULTIPART_FORM_DATA);

		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
		builder.addPart("logoImageFile", fileBody);
		HttpEntity entity = builder.build();
		httpPost.setEntity(entity);
		
		CloseableHttpResponse response
		try {
			response = httpClient.execute(httpPost);
		} catch (Exception e) {
			e.printStackTrace()
		}

		String responseText = session.streamToString( response.getEntity().getContent() )
		Gson gson = new Gson()
		String uploadedLogoPath = gson.fromJson(responseText, LogoPath.class).logoPath
		
		return uploadedLogoPath
		
	}
}
