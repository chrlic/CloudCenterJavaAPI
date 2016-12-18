package cz.gargoyle.c3.api.appl;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class SystemTag {

	@SerializedName("id")
	@Expose
	public Integer id;
	@SerializedName("name")
	@Expose
	public String name;
	@SerializedName("ownerId")
	@Expose
	public Integer ownerId;
	@SerializedName("description")
	@Expose
	public String description;

}