package cz.gargoyle.c3.api.appl

import com.google.gson.Gson
import java.nio.ByteBuffer

class ApplicationBundle {
	String jsonModel = ""
	String jsonModelFilename
	ByteArrayOutputStream logoStream = new ByteArrayOutputStream()
	String logoFilename
	String xmlDescriptor  = ""
	String xmlDescriptorFilename
	
	private ApplicationForExportImport parsedApp;
	
	String getName() {
		return getApplicationForExportImport().name
	}
	void changeName(String newName) {
		//fix Json
		getApplicationForExportImport().name = newName
		Gson gson = new Gson()
		jsonModel = gson.toJson(parsedApp)
		
		//fix filenames
		def (jsonDirectory, jsonFile) = jsonModelFilename.tokenize("/")
		def (logoDirectory, logoFile) = logoFilename.tokenize("/")
		jsonDirectory = newName.replace(" ", "_")
		logoDirectory = newName.replace(" ", "_")
		jsonModelFilename = jsonDirectory + "/" + jsonFile
		logoFilename = logoDirectory + "/" + logoFile
		
		//fix XML
		def rootNode = new XmlParser().parseText(xmlDescriptor)
//		def appProfileInfo = rootNode.AppProfileExportImportJaxb.AppProfileList.appProfileInfo
		rootNode.AppProfileList.appProfileInfo[0].@topLevelAppName = newName
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream()
		PrintWriter writer = new PrintWriter(bos)
		def xmlWriter = new XmlNodePrinter(writer)
		xmlWriter.setPreserveWhitespace(true)
		xmlWriter.print(rootNode)
		
		def str = bos.toString()
		xmlDescriptor = str
		println str
	}	
	
	ApplicationForExportImport getApplicationForExportImport() {
		if (parsedApp == null) {
			Gson gson = new Gson()
			parsedApp = gson.fromJson(jsonModel, ApplicationForExportImport.class)
		}
		return parsedApp
	}
}
