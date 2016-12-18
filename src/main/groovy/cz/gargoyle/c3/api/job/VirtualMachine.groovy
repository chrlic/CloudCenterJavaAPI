package cz.gargoyle.c3.api.job

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class VirtualMachine {

	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("resource")
	@Expose
	public String resource;
	@SerializedName("perms")
	@Expose
	public List<Object> perms = new ArrayList<Object>();
	@SerializedName("publicIp")
	@Expose
	public String publicIp;
	@SerializedName("privateIp")
	@Expose
	public String privateIp;
	@SerializedName("hostName")
	@Expose
	public String hostName;
	@SerializedName("status")
	@Expose
	public String status;
	@SerializedName("startTime")
	@Expose
	public String startTime;
	@SerializedName("endTime")
	@Expose
	public Object endTime;
	@SerializedName("nodeNetworkInterfaces")
	@Expose
	public List<NodeNetworkInterface> nodeNetworkInterfaces = new ArrayList<NodeNetworkInterface>();
	@SerializedName("costDetails")
	@Expose
	public Object costDetails;
	@SerializedName("additionalInfo")
	@Expose
	public List<Object> additionalInfo = new ArrayList<Object>();

}