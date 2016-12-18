package cz.gargoyle.c3.api.depenv

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class DeploymentEnvironment {

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
	@SerializedName("description")
	@Expose
	public String description;
	@SerializedName("allowedClouds")
	@Expose
	public Object allowedClouds;
	@SerializedName("defaultSettings")
	@Expose
	public String defaultSettings;
	@SerializedName("requiresApproval")
	@Expose
	public Boolean requiresApproval;
	@SerializedName("associatedClouds")
	@Expose
	public List<AssociatedCloud> associatedClouds = new ArrayList<AssociatedCloud>();
	@SerializedName("totalDeployments")
	@Expose
	public Integer totalDeployments;
	@SerializedName("costDetails")
	@Expose
	public Object costDetails;
}
