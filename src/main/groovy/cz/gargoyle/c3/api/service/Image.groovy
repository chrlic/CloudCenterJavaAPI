package cz.gargoyle.c3.api.service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Image {

	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("resource")
	@Expose
	public Object resource;
	@SerializedName("perms")
	@Expose
	public List<String> perms = new ArrayList<String>();
	@SerializedName("name")
	@Expose
	public String name;
	@SerializedName("internalImageName")
	@Expose
	public String internalImageName;
	@SerializedName("description")
	@Expose
	public String description;
	@SerializedName("visibility")
	@Expose
	public String visibility;
	@SerializedName("imageType")
	@Expose
	public String imageType;
	@SerializedName("osName")
	@Expose
	public String osName;
	@SerializedName("tags")
	@Expose
	public List<Object> tags = new ArrayList<Object>();
	@SerializedName("numOfNics")
	@Expose
	public Integer numOfNics;
	@SerializedName("tenantId")
	@Expose
	public Integer tenantId;
	@SerializedName("enabled")
	@Expose
	public Boolean enabled;
	@SerializedName("systemImage")
	@Expose
	public Boolean systemImage;
	@SerializedName("detail")
	@Expose
	public Object detail;
	@SerializedName("count")
	@Expose
	public Integer count;

}