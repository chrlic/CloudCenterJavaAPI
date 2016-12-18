package cz.gargoyle.c3.api.job;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class DeploymentInfo {

	@SerializedName("deploymentId")
	@Expose
	public Integer deploymentId;
	@SerializedName("deploymentName")
	@Expose
	public String deploymentName;
	@SerializedName("deploymentHealthStatus")
	@Expose
	public String deploymentHealthStatus;
	@SerializedName("deploymentStatus")
	@Expose
	public String deploymentStatus;
	@SerializedName("deploymentOwnerId")
	@Expose
	public Integer deploymentOwnerId;
	@SerializedName("isSuspendSupported")
	@Expose
	public Boolean isSuspendSupported;
	@SerializedName("isDeploymentTerminated")
	@Expose
	public Boolean isDeploymentTerminated;

}