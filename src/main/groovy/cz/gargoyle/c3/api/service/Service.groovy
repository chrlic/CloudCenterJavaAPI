package cz.gargoyle.c3.api.service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Service {

	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("resource")
	@Expose
	public String resource;
	@SerializedName("perms")
	@Expose
	public List<String> perms = new ArrayList<String>();
	@SerializedName("name")
	@Expose
	public String name;
	@SerializedName("displayName")
	@Expose
	public String displayName;
	@SerializedName("description")
	@Expose
	public String description;
	@SerializedName("logoPath")
	@Expose
	public String logoPath;
	@SerializedName("parentServiceId")
	@Expose
	public String parentServiceId;
	@SerializedName("parentService")
	@Expose
	public Boolean parentService;
	@SerializedName("systemService")
	@Expose
	public Boolean systemService;
	@SerializedName("externalService")
	@Expose
	public Boolean externalService;
	@SerializedName("visible")
	@Expose
	public Boolean visible;
	@SerializedName("bundleLocation")
	@Expose
	public String bundleLocation;
	@SerializedName("externalBundleLocation")
	@Expose
	public String externalBundleLocation;
	@SerializedName("costPerHour")
	@Expose
	public Integer costPerHour;
	@SerializedName("defaultImageId")
	@Expose
	public Integer defaultImageId;
	@SerializedName("serviceType")
	@Expose
	public String serviceType;
	@SerializedName("ownerUserId")
	@Expose
	public String ownerUserId;
	@SerializedName("serviceActions")
	@Expose
	public List<ServiceAction> serviceActions = new ArrayList<ServiceAction>();
	@SerializedName("externalActions")
	@Expose
	public List<Object> externalActions = new ArrayList<Object>();
	@SerializedName("servicePorts")
	@Expose
	public List<ServicePort> servicePorts = new ArrayList<ServicePort>();
	@SerializedName("serviceParamSpecs")
	@Expose
	public List<Object> serviceParamSpecs = new ArrayList<Object>();
	@SerializedName("egressRestrictions")
	@Expose
	public List<Object> egressRestrictions = new ArrayList<Object>();
	@SerializedName("childServices")
	@Expose
	public List<Object> childServices = new ArrayList<Object>();
	@SerializedName("images")
	@Expose
	public List<Image> images = new ArrayList<Image>();
	@SerializedName("repositories")
	@Expose
	public List<Repository> repositories = new ArrayList<Repository>();

}