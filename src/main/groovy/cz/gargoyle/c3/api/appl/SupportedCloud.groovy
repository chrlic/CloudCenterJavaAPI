package cz.gargoyle.c3.api.appl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class SupportedCloud {

	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("resource")
	@Expose
	public String resource;
	@SerializedName("perms")
	@Expose
	public List<Object> perms = new ArrayList<Object>();

}