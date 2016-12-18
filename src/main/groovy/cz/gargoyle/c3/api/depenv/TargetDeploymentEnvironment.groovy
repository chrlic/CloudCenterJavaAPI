package cz.gargoyle.c3.api.depenv

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class TargetDeploymentEnvironment {

	@SerializedName("deploymentEnvironments")
	@Expose
	public List<DeploymentEnvironment> deploymentEnvironments = new ArrayList<DeploymentEnvironment>();
	@SerializedName("permsList")
	@Expose
	public List<Object> permsList = new ArrayList<Object>();

}