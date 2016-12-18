package cz.gargoyle.c3.api.service;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ServiceAction {

	@SerializedName("actionName")
	@Expose
	public String actionName;
	@SerializedName("actionType")
	@Expose
	public String actionType;
	@SerializedName("actionValue")
	@Expose
	public String actionValue;

}