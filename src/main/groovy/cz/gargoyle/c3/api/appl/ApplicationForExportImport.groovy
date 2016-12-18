package cz.gargoyle.c3.api.appl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ApplicationForExportImport {

	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("resource")
	@Expose
	public Object resource;
	@SerializedName("perms")
	@Expose
	public List<Object> perms = new ArrayList<Object>();
	@SerializedName("name")
	@Expose
	public String name;
	@SerializedName("description")
	@Expose
	public String description;
	@SerializedName("version")
	@Expose
	public String version;
	@SerializedName("revisionId")
	@Expose
	public Integer revisionId;
	@SerializedName("sourceTemplateId")
	@Expose
	public Integer sourceTemplateId;
	@SerializedName("sourceTemplateName")
	@Expose
	public Object sourceTemplateName;
	@SerializedName("sourceAppId")
	@Expose
	public Integer sourceAppId;
	@SerializedName("parentVersion")
	@Expose
	public String parentVersion;
	@SerializedName("executorBeanName")
	@Expose
	public String executorBeanName;
	@SerializedName("owner")
	@Expose
	public Object owner;
	@SerializedName("hwProfile")
	@Expose
	public Object hwProfile;
	@SerializedName("swProfile")
	@Expose
	public Object swProfile;
	@SerializedName("nodeInitSpec")
	@Expose
	public Object nodeInitSpec;
	@SerializedName("firewall")
	@Expose
	public Object firewall;
	@SerializedName("migrationSpec")
	@Expose
	public Object migrationSpec;
	@SerializedName("upgradeSpec")
	@Expose
	public Object upgradeSpec;
	@SerializedName("nodeReusable")
	@Expose
	public Boolean nodeReusable;
	@SerializedName("leafLevel")
	@Expose
	public Boolean leafLevel;
	@SerializedName("interactiveApp")
	@Expose
	public Boolean interactiveApp;
	@SerializedName("defaultApp")
	@Expose
	public Boolean defaultApp;
	@SerializedName("applicationType")
	@Expose
	public String applicationType;
	@SerializedName("templateType")
	@Expose
	public String templateType;
	@SerializedName("policyId")
	@Expose
	public Integer policyId;
	@SerializedName("statusDefId")
	@Expose
	public Integer statusDefId;
	@SerializedName("tags")
	@Expose
	public String tags;
	@SerializedName("nodeCombination")
	@Expose
	public Object nodeCombination;
	@SerializedName("internalImageName")
	@Expose
	public Object internalImageName;
	@SerializedName("helpLink")
	@Expose
	public Object helpLink;
	@SerializedName("numNodes")
	@Expose
	public Integer numNodes;
	@SerializedName("dynamicScalable")
	@Expose
	public Boolean dynamicScalable;
	@SerializedName("serviceName")
	@Expose
	public Object serviceName;
	@SerializedName("topologyParamText")
	@Expose
	public Object topologyParamText;
	@SerializedName("templateDependencies")
	@Expose
	public List<Object> templateDependencies = new ArrayList<Object>();
	@SerializedName("appParamSpecs")
	@Expose
	public List<AppParamSpec> appParamSpecs = new ArrayList<AppParamSpec>();
	@SerializedName("envvarSpecs")
	@Expose
	public List<Object> envvarSpecs = new ArrayList<Object>();
	@SerializedName("agentTasks")
	@Expose
	public List<Object> agentTasks = new ArrayList<Object>();
	@SerializedName("childAppTemplates")
	@Expose
	public List<ChildAppTemplate> childAppTemplates = new ArrayList<ChildAppTemplate>();
	@SerializedName("categories")
	@Expose
	public List<Object> categories = new ArrayList<Object>();
	@SerializedName("metadataTags")
	@Expose
	public List<MetadataTag> metadataTags = new ArrayList<MetadataTag>();
	@SerializedName("systemTags")
	@Expose
	public List<SystemTag> systemTags = new ArrayList<SystemTag>();

}