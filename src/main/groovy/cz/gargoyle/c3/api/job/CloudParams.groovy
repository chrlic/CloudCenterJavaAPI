package cz.gargoyle.c3.api.job;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class CloudParams {

	@SerializedName("cloud")
	@Expose
	public String cloud;
	@SerializedName("account")
	@Expose
	public String account;
	@SerializedName("instance")
	@Expose
	public String instance;
	@SerializedName("rootVolumeSize")
	@Expose
	public Object rootVolumeSize;
	@SerializedName("storage")
	@Expose
	public Object storage;
	@SerializedName("cloudProperties")
	@Expose
	public List<CloudProperty> cloudProperties = new ArrayList<CloudProperty>();

}