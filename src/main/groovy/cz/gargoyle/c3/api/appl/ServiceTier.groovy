package cz.gargoyle.c3.api.appl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ServiceTier {

	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("name")
	@Expose
	public String name;
	@SerializedName("description")
	@Expose
	public Object description;
	@SerializedName("version")
	@Expose
	public String version;
	@SerializedName("revisionId")
	@Expose
	public Integer revisionId;
	@SerializedName("serviceTierId")
	@Expose
	public String serviceTierId;
	@SerializedName("executor")
	@Expose
	public Object executor;
	@SerializedName("profileCategory")
	@Expose
	public Object profileCategory;
	@SerializedName("logoPath")
	@Expose
	public String logoPath;
	@SerializedName("hwprofile")
	@Expose
	public HwProfile hwprofile;
	@SerializedName("serviceTiers")
	@Expose
	public List<Object> serviceTiers = new ArrayList<Object>();
	@SerializedName("parameters")
	@Expose
	public Parameters parameters;
	@SerializedName("parameterSpecs")
	@Expose
	public ParameterSpecs parameterSpecs;
	@SerializedName("supportedClouds")
	@Expose
	public List<SupportedCloud> supportedClouds = new ArrayList<SupportedCloud>();
	@SerializedName("appCategories")
	@Expose
	public List<Object> appCategories = new ArrayList<Object>();

}