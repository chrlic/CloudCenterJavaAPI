package cz.gargoyle.c3.api.job;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Metadata {

	@SerializedName("namespace")
	@Expose
	public String namespace;
	@SerializedName("name")
	@Expose
	public String name;
	@SerializedName("value")
	@Expose
	public String value;
	@SerializedName("editable")
	@Expose
	public Boolean editable;
	@SerializedName("required")
	@Expose
	public Boolean required;

}