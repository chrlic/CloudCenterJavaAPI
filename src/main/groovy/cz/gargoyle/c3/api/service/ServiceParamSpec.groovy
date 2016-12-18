package cz.gargoyle.c3.api.service;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ServiceParamSpec {

	@SerializedName("paramName")
	@Expose
	public String paramName;
	@SerializedName("displayName")
	@Expose
	public String displayName;
	@SerializedName("helpText")
	@Expose
	public String helpText;
	@SerializedName("type")
	@Expose
	public String type;
	@SerializedName("valueConstraint")
	@Expose
	public ValueConstraint valueConstraint;
	@SerializedName("defaultValue")
	@Expose
	public String defaultValue;
	@SerializedName("userVisible")
	@Expose
	public Boolean userVisible;
	@SerializedName("userEditable")
	@Expose
	public Boolean userEditable;
	@SerializedName("optional")
	@Expose
	public Boolean optional;
	@SerializedName("systemParam")
	@Expose
	public Boolean systemParam;

}