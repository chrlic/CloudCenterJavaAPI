package cz.gargoyle.c3.api.test.integration;

import static org.junit.Assert.*;
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import cz.gargoyle.c3.api.appl.Application
import cz.gargoyle.c3.api.appl.ApplicationDetails
import cz.gargoyle.c3.api.appl.ApplicationBundle
import cz.gargoyle.c3.api.appl.Applications
import cz.gargoyle.c3.api.appl.C3Application
import cz.gargoyle.c3.api.depenv.C3DeploymentEnvironment
import cz.gargoyle.c3.api.depenv.EnvironmentInstance
import cz.gargoyle.c3.api.depenv.TargetDeploymentEnvironment
import cz.gargoyle.c3.api.job.C3Job
import cz.gargoyle.c3.api.job.JobSubmittedResults
import cz.gargoyle.c3.api.service.C3Service
import cz.gargoyle.c3.api.service.Image
import cz.gargoyle.c3.api.service.Repository
import cz.gargoyle.c3.api.service.Service
import cz.gargoyle.c3.api.service.Services
import cz.gargoyle.c3.api.session.C3Session
import org.junit.Test;

class C3AppTest {

	static void main(String[] args) {
		C3AppTest test = new C3AppTest()
		test.test()
	}
	
	@Test
	public void test() {
		
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

		ApplicationBundle model = app.appExport(session, a.id)
		
		model.changeName("Pivni sklep 2")
		
		/*
		model.jsonModel = model.jsonModel.replaceAll("obchod", "sklep")
		model.jsonModelFilename = model.jsonModelFilename.replaceAll("obchod", "sklep")
		model.logoFilename = model.logoFilename.replaceAll("obchod", "sklep")
		model.xmlDescriptor = model.xmlDescriptor.replaceAll("obchod", "sklep")
		*/
		
		app.appImport(session, model)
	}

}
