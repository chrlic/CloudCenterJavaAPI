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
import cz.gargoyle.c3.api.service.C3Service
import cz.gargoyle.c3.api.service.Image
import cz.gargoyle.c3.api.service.Repository
import cz.gargoyle.c3.api.service.Service
import cz.gargoyle.c3.api.service.Services
import cz.gargoyle.c3.api.session.C3Session
import org.junit.Test;

class C3ServiceTest {

	static void main(String[] args) {
		C3ServiceTest test = new C3ServiceTest()
		test.test()
	}
	
	@Test
	public void test() {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create()
		
		String username = "admin_3"
		String key = "464B3C3CB5324A5A"
	
		C3Session session = new C3Session().setHost("ccm.dcloud.cisco.com").setKey(key).setUsername(username).build()
		
		C3Service service = new C3Service()
		Services services = service.getServices(session, "1")
		
		Service myService = services.services.find { Service s -> s.displayName == "Beer Store" }
		
		println "--------------------------------------------------------------------------------"
		println gson.toJson(myService)
		
		String logoPath = service.uploadLogo(session, "src/test/groovy/cz/gargoyle/c3/api/test/integration/beer-keg-logo-transparent-500.png")
		
		Service ns = new Service()
		ns.displayName = "Test Service"
		ns.name = "test_service"
		ns.description = "This is a test service"
		ns.bundleLocation = myService.bundleLocation
		ns.parentServiceId = myService.parentServiceId
		ns.logoPath = logoPath
		ns.defaultImageId = myService.defaultImageId
		ns.serviceActions = myService.serviceActions
		ns.images.add( new Image(
			id : myService.images[0].id, //4
			perms : null,
			tags : null
			) 
		)
		ns.repositories.add( new Repository(
			id : myService.repositories[0].id) //2
		)
		
		ns.perms = null
		ns.externalActions = null
		ns.servicePorts = null
		ns.serviceParamSpecs = null
		ns.egressRestrictions = null
		ns.childServices = null
		
		println gson.toJson(ns)
		
		service.createService(session, "1", ns)
		
	}

}
