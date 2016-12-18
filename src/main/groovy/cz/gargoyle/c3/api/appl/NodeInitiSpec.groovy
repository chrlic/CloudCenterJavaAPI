package cz.gargoyle.c3.api.appl;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class NodeInitSpec {

	@SerializedName("depPkgs")
	@Expose
	public String depPkgs;
	@SerializedName("initScript")
	@Expose
	public String initScript;
	@SerializedName("cleanupScript")
	@Expose
	public String cleanupScript;
	@SerializedName("licServer")
	@Expose
	public Object licServer;
	@SerializedName("licPort")
	@Expose
	public Integer licPort;
	@SerializedName("sudoCmdList")
	@Expose
	public String sudoCmdList;

}