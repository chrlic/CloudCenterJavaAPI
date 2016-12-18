package cz.gargoyle.c3.api.session

import org.apache.http.client.HttpClient;
import groovy.json.JsonSlurper
import javax.net.ssl.HostnameVerifier
import org.apache.http.HttpEntity
import org.apache.http.HttpResponse
import org.apache.http.auth.AuthScope
import org.apache.http.auth.UsernamePasswordCredentials
import org.apache.http.client.CredentialsProvider
import org.apache.http.client.HttpClient
import org.apache.http.client.methods.CloseableHttpResponse
import org.apache.http.client.methods.HttpGet
import org.apache.http.client.methods.HttpPost
import org.apache.http.impl.client.HttpClients
import org.apache.http.conn.ssl.SSLConnectionSocketFactory
import org.apache.http.conn.ssl.TrustSelfSignedStrategy
import org.apache.http.entity.InputStreamEntity
import org.apache.http.entity.StringEntity
import org.apache.http.impl.client.BasicCredentialsProvider
import org.apache.http.ssl.SSLContextBuilder
import org.apache.commons.codec.binary.Base64
import java.io.InputStream;
import java.nio.charset.Charset

class C3Session {
	String host = ""
	int port = 443
	String protocol = "https"
	
	String username = ""
	String key = ""
	
	HttpClient httpClient = null;
	
	C3Session setHost(String host) {
		this.host = host
		return this
	}
	
	C3Session setPort(int port) {
		this.port = port
		return this
	}
	
	C3Session setUsername(String username) {
		this.username = username
		return this
	}
	
	C3Session setKey(String key) {
		this.key = key
		return this
	}
	
	C3Session build() {
		SSLContextBuilder sslContextBuilder = new SSLContextBuilder();
		sslContextBuilder.loadTrustMaterial(null, new TrustSelfSignedStrategy());

		HostnameVerifier hostnameVerifierAllowAll = [ verify: { hostname, session -> return true } ] as HostnameVerifier

		SSLConnectionSocketFactory sslSocketFactory = new SSLConnectionSocketFactory(sslContextBuilder.build(), hostnameVerifierAllowAll);

		CredentialsProvider provider = new BasicCredentialsProvider();
		UsernamePasswordCredentials credentials = new UsernamePasswordCredentials(username, key);
		provider.setCredentials(AuthScope.ANY, credentials);
		
		httpClient = HttpClients.custom()
			.setSSLSocketFactory(sslSocketFactory)
//			.setDefaultCredentialsProvider(provider)
			.build();
		return this
	}
	
	HttpResponse get(String uriPath) {
		HttpGet httpGet = new HttpGet("${protocol}://${host}${uriPath}")
		httpGet.addHeader("Content-Type", "application/json")
		httpGet.addHeader("x-cliqr-api-key-auth", "true")
		httpGet.addHeader("accept", "application/json")
		httpGet.addHeader("cache-control", "no-cache")

		String auth = username + ":" + key;
		byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("ISO-8859-1")));
		String authHeader = "Basic " + new String(encodedAuth);
		httpGet.setHeader("Authorization", authHeader)
		
		CloseableHttpResponse response
		try {
			response = httpClient.execute(httpGet);
		} catch (Exception e) {
			e.printStackTrace()
		}
		return response
	}
	
	HttpResponse post(String uriPath, String jsonDocument) {
		return post(uriPath, new StringEntity(jsonDocument))
	}
	
	HttpResponse post(String uriPath, InputStream stream) {
		return post(uriPath, new InputStreamEntity(stream))
	}
	
	HttpResponse post(String uriPath, HttpEntity httpEntity) {
		HttpPost httpPost = new HttpPost("${protocol}://${host}${uriPath}")
		httpPost.addHeader("Content-Type", "application/json")
		httpPost.addHeader("x-cliqr-api-key-auth", "true")
		httpPost.addHeader("accept", "application/json")
		httpPost.addHeader("cache-control", "no-cache")
		httpPost.setEntity(httpEntity)
		
		CloseableHttpResponse response
		try {
			response = httpClient.execute(httpPost);
		} catch (Exception e) {
			e.printStackTrace()
		}

		return response
	}
		
	String streamToString(InputStream inStream) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));
		StringBuilder out = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			out.append(line);
		}
		reader.close();
		return out;
	}

}
