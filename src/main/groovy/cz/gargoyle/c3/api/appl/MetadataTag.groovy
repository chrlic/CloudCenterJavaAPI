package cz.gargoyle.c3.api.appl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class MetadataTag {

	@SerializedName("id")
	@Expose
	public Object id;
	@SerializedName("resource")
	@Expose
	public Object resource;
	@SerializedName("perms")
	@Expose
	public List<Object> perms = new ArrayList<Object>();
	@SerializedName("namespace")
	@Expose
	public Object namespace;
	@SerializedName("tagName")
	@Expose
	public String tagName;
	@SerializedName("tagCollectionId")
	@Expose
	public Object tagCollectionId;
	@SerializedName("value")
	@Expose
	public String value;
	@SerializedName("required")
	@Expose
	public Boolean required;
	@SerializedName("editable")
	@Expose
	public Boolean editable;

}