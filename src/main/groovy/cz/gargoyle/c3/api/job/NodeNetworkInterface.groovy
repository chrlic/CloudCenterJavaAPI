package cz.gargoyle.c3.api.job;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class NodeNetworkInterface {

	@SerializedName("privateIPAddress")
	@Expose
	public String privateIPAddress;
	@SerializedName("publicIPAddress")
	@Expose
	public String publicIPAddress;
	@SerializedName("networkDisplayName")
	@Expose
	public Object networkDisplayName;
	@SerializedName("interfaceIndex")
	@Expose
	public Integer interfaceIndex;

}