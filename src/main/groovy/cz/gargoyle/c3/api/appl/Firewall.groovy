package cz.gargoyle.c3.api.appl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Firewall {

	@SerializedName("name")
	@Expose
	public String name;
	@SerializedName("description")
	@Expose
	public String description;
	@SerializedName("rules")
	@Expose
	public List<Rule> rules = new ArrayList<Rule>();

}