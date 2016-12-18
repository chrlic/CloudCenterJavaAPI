package cz.gargoyle.c3.api.depenv

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type
import cz.gargoyle.c3.api.session.C3Session
import org.apache.http.HttpResponse

class C3DeploymentEnvironment {
	
	TargetDeploymentEnvironment getTargetDeploymentEnvironment(C3Session session, String tag) {
		String url = "/environment/service/get_move_in_deployment_env_based_on_tags?tag=${tag}"

		HttpResponse response = session.get(url)
		
		String responseText = session.streamToString( response.getEntity().getContent() )

		Gson gson = new Gson()
		TargetDeploymentEnvironment targetEnv = gson.fromJson(responseText, TargetDeploymentEnvironment.class)
		
		return targetEnv
	}
	
	Collection<EnvironmentInstance> getInstancesForApplication(C3Session session, String serviceTierId, DeploymentEnvironment depEnv) {
		
		String cloudType = depEnv.associatedClouds[0].regionName
		String depEnvId = depEnv.id
		String url = "/cloud/service/get_cloudinstances?cloudType=${cloudType}&templateId=${serviceTierId}&depEnvId=${depEnvId}"
		println url
		HttpResponse response = session.get(url)
		
		String responseText = session.streamToString( response.getEntity().getContent() )

		Gson gson = new Gson()
		Type collectionType = new TypeToken<Collection<EnvironmentInstance>>(){}.getType();
		Collection<EnvironmentInstance> envInstances = gson.fromJson(responseText, collectionType)
		
		return envInstances
	}
}
