package cz.gargoyle.c3.api.appl;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ParameterSpecs {

	@SerializedName("systemParams")
	@Expose
	public SystemParams systemParams;
	@SerializedName("customParams")
	@Expose
	public CustomParams customParams;
	@SerializedName("envVars")
	@Expose
	public EnvVars envVars;

}