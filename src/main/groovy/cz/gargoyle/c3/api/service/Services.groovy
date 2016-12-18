package cz.gargoyle.c3.api.service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Services {

	@SerializedName("resource")
	@Expose
	public String resource;
	@SerializedName("size")
	@Expose
	public Integer size;
	@SerializedName("pageNumber")
	@Expose
	public Integer pageNumber;
	@SerializedName("totalElements")
	@Expose
	public Integer totalElements;
	@SerializedName("totalPages")
	@Expose
	public Integer totalPages;
	@SerializedName("services")
	@Expose
	public List<Service> services = new ArrayList<Service>();

}