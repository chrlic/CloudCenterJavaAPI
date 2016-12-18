package cz.gargoyle.c3.api.job;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class JobSubmittedResults {

	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("resource")
	@Expose
	public String resource;
	@SerializedName("perms")
	@Expose
	public List<String> perms = new ArrayList<String>();
	@SerializedName("name")
	@Expose
	public String name;
	@SerializedName("desc")
	@Expose
	public Object desc;
	@SerializedName("status")
	@Expose
	public Object status;
	@SerializedName("statusMsg")
	@Expose
	public Object statusMsg;
	@SerializedName("serviceTierId")
	@Expose
	public String serviceTierId;
	@SerializedName("appId")
	@Expose
	public String appId;
	@SerializedName("appName")
	@Expose
	public String appName;
	@SerializedName("appVersion")
	@Expose
	public String appVersion;
	@SerializedName("depInitiatingUserId")
	@Expose
	public String depInitiatingUserId;
	@SerializedName("environmentId")
	@Expose
	public String environmentId;
	@SerializedName("environment")
	@Expose
	public String environment;
	@SerializedName("environmentApprovalStatus")
	@Expose
	public String environmentApprovalStatus;
	@SerializedName("keepExistingDeployment")
	@Expose
	public Boolean keepExistingDeployment;
	@SerializedName("provisionBareMetal")
	@Expose
	public Boolean provisionBareMetal;
	@SerializedName("bareMetalMachines")
	@Expose
	public List<Object> bareMetalMachines = new ArrayList<Object>();
	@SerializedName("startTime")
	@Expose
	public Object startTime;
	@SerializedName("endTime")
	@Expose
	public Object endTime;
	@SerializedName("multiCloudSupport")
	@Expose
	public Boolean multiCloudSupport;
	@SerializedName("preventTermination")
	@Expose
	public Boolean preventTermination;
	@SerializedName("accessLink")
	@Expose
	public String accessLink;
	@SerializedName("parameters")
	@Expose
	public Parameters parameters;
	@SerializedName("virtualMachines")
	@Expose
	public List<Object> virtualMachines = new ArrayList<Object>();
	@SerializedName("nics")
	@Expose
	public List<Object> nics = new ArrayList<Object>();
	@SerializedName("metadatas")
	@Expose
	public List<Metadata> metadatas = new ArrayList<Metadata>();
	@SerializedName("deploymentInfo")
	@Expose
	public DeploymentInfo deploymentInfo;
	@SerializedName("tags")
	@Expose
	public List<String> tags = new ArrayList<String>();
	@SerializedName("policies")
	@Expose
	public List<String> policies = new ArrayList<String>();
	@SerializedName("volumeInfos")
	@Expose
	public List<Object> volumeInfos = new ArrayList<Object>();
	@SerializedName("costDetails")
	@Expose
	public Object costDetails;
	@SerializedName("actions")
	@Expose
	public List<String> actions = new ArrayList<String>();
	@SerializedName("terminateProtection")
	@Expose
	public Boolean terminateProtection;
	@SerializedName("jobs")
	@Expose
	public List<Job> jobs = new ArrayList<Job>();

}