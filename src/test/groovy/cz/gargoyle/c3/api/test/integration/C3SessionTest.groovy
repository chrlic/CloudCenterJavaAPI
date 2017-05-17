package cz.gargoyle.c3.api.test.integration;

import static org.junit.Assert.*;

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import cz.gargoyle.c3.api.appl.Application
import cz.gargoyle.c3.api.appl.ApplicationDetails
import cz.gargoyle.c3.api.appl.Applications
import cz.gargoyle.c3.api.appl.C3Application
import cz.gargoyle.c3.api.depenv.C3DeploymentEnvironment
import cz.gargoyle.c3.api.depenv.EnvironmentInstance
import cz.gargoyle.c3.api.depenv.TargetDeploymentEnvironment
import cz.gargoyle.c3.api.job.C3Job
import cz.gargoyle.c3.api.job.JobSubmittedResults
import cz.gargoyle.c3.api.session.C3Session
import org.junit.Test;

class C3SessionTest {

	static void main(String[] args) {
		C3SessionTest test = new C3SessionTest()
		test.test()
	}
	
	public void test() {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create()
		
		String username = "cliqradmin"
		String key = "A740EDF0734894E9"
	
		C3Session session = new C3Session().setHost("10.62.8.156").setKey(key).setUsername(username).build()
		
		C3Application app = new C3Application()
		Applications apps = app.listApplications(session)
		//println gson.toJson(apps)
		
		String cloudTag = "Development"
		
		C3DeploymentEnvironment devEnv = new C3DeploymentEnvironment()
		TargetDeploymentEnvironment envs = devEnv.getTargetDeploymentEnvironment(session, cloudTag)
		//println gson.toJson(envs)
				
		C3Job job = new C3Job()
		Application a = apps.apps.find { it.name == "Pivni obchod" }

		ApplicationDetails appDetails = app.getApplicationDetails(session, a.id)
		//println gson.toJson(appDetails)
		
		//return
		
		String deploymentName = "po_${new Date().time}"
		//String cloudTarget = envs.deploymentEnvironments[0].associatedClouds[0].regionName
		//String appServiceId = appDetails.serviceTiers[0].id
		
		//Collection<EnvironmentInstance> envInstances = devEnv.getInstancesForApplication(session, appServiceId, envs.deploymentEnvironments[0])
		
		//String cloudInstance = envInstances[0].instanceType
		
		JobSubmittedResults jobSubmissionResults = job.submitSimple(session, a, deploymentName, "1", "1", "1")
		//println gson.toJson(jobSubmissionResults)
		
		//job submission results - check status
		job.waitForJob(session, jobSubmissionResults.id, 30)
		
		println "Job done"
	}

	@Test
	public void testv45dCloud() {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create()
		
		String username = "admin_3"
		String key = "464B3C3CB5324A5A"
	
		C3Session session = new C3Session().setHost("ccm.dcloud.cisco.com").setKey(key).setUsername(username).build()
		
		C3Application app = new C3Application()
		Applications apps = app.listApplications(session)
		println gson.toJson(apps)
		
		String cloudTag = "Development"
		
		C3DeploymentEnvironment devEnv = new C3DeploymentEnvironment()
		TargetDeploymentEnvironment envs = devEnv.getTargetDeploymentEnvironment(session, cloudTag)
		println gson.toJson(envs)
				
		C3Job job = new C3Job()
		Application a = apps.apps.find { it.name == "Pivni obchod" }

		ApplicationDetails appDetails = app.getApplicationDetails(session, a.id)
		println gson.toJson(appDetails)
		
		String deploymentName = "po_${new Date().time}"
		String cloudTarget = envs.deploymentEnvironments[0].associatedClouds[0].regionName
		String appServiceId = appDetails.serviceTiers[0].id
		
		Collection<EnvironmentInstance> envInstances = devEnv.getInstancesForApplication(session, appServiceId, envs.deploymentEnvironments[0])
		
		String cloudInstance = envInstances[0].instanceType
		
		JobSubmittedResults jobSubmissionResults = job.submitWithGovernance(session, a, deploymentName, cloudTag, cloudTarget, cloudInstance)
		println gson.toJson(jobSubmissionResults)
		
		//job submission results - check status
		job.waitForJob(session, jobSubmissionResults.id, 600)
		
		println "Job done"
	}

}
