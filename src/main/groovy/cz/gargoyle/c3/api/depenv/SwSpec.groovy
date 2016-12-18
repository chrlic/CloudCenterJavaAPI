package cz.gargoyle.c3.api.depenv;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class SwSpec {

	@SerializedName("support32bit")
	@Expose
	public Boolean support32bit;
	@SerializedName("support64bit")
	@Expose
	public Boolean support64bit;
	@SerializedName("support32On64")
	@Expose
	public Boolean support32On64;
	@SerializedName("osName")
	@Expose
	public Object osName;

}

