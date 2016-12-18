package cz.gargoyle.c3.api.service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ServicePort {

	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("resource")
	@Expose
	public Object resource;
	@SerializedName("perms")
	@Expose
	public List<Object> perms = new ArrayList<Object>();
	@SerializedName("protocol")
	@Expose
	public String protocol;
	@SerializedName("fromPort")
	@Expose
	public String fromPort;
	@SerializedName("toPort")
	@Expose
	public String toPort;

}