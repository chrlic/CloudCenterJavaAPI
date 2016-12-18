package cz.gargoyle.c3.api.appl;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class SwProfile {

	@SerializedName("osName")
	@Expose
	public String osName;
	@SerializedName("support32Bit")
	@Expose
	public Boolean support32Bit;
	@SerializedName("support64Bit")
	@Expose
	public Boolean support64Bit;
	@SerializedName("support32On64")
	@Expose
	public Boolean support32On64;

}