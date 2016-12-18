package cz.gargoyle.c3.api.service;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ValueConstraint {

	@SerializedName("maxLength")
	@Expose
	public Integer maxLength;
	@SerializedName("allowSpaces")
	@Expose
	public Boolean allowSpaces;

}