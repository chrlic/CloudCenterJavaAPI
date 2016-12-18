package cz.gargoyle.c3.api.appl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class AppParamSpec {

	@SerializedName("paramName")
	@Expose
	public String paramName;
	@SerializedName("displayName")
	@Expose
	public String displayName;
	@SerializedName("helpText")
	@Expose
	public Object helpText;
	@SerializedName("type")
	@Expose
	public Object type;
	@SerializedName("valueList")
	@Expose
	public Object valueList;
	@SerializedName("defaultValue")
	@Expose
	public String defaultValue;
	@SerializedName("userVisible")
	@Expose
	public Boolean userVisible;
	@SerializedName("userEditable")
	@Expose
	public Boolean userEditable;
	@SerializedName("systemParam")
	@Expose
	public Boolean systemParam;
	@SerializedName("exampleValue")
	@Expose
	public Object exampleValue;
	@SerializedName("dataUnit")
	@Expose
	public Object dataUnit;
	@SerializedName("optional")
	@Expose
	public Boolean optional;
	@SerializedName("valueConstraint")
	@Expose
	public Object valueConstraint;
	@SerializedName("scope")
	@Expose
	public Object scope;
	@SerializedName("webserviceListParams")
	@Expose
	public Object webserviceListParams;
	@SerializedName("collectionList")
	@Expose
	public List<Object> collectionList = new ArrayList<Object>();

}