package cz.gargoyle.c3.api.appl

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Application {

	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("resource")
	@Expose
	public String resource;
	@SerializedName("perms")
	@Expose
	public List<Object> perms = new ArrayList<Object>();
	@SerializedName("name")
	@Expose
	public String name;
	@SerializedName("version")
	@Expose
	public Object version;
	@SerializedName("description")
	@Expose
	public String description;
	@SerializedName("serviceTierId")
	@Expose
	public String serviceTierId;
	@SerializedName("versions")
	@Expose
	public List<String> versions = new ArrayList<String>();
	@SerializedName("executor")
	@Expose
	public String executor;
	@SerializedName("category")
	@Expose
	public String category;

}

