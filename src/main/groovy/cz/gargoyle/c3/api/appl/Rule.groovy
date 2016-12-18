package cz.gargoyle.c3.api.appl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Rule {

	@SerializedName("protocol")
	@Expose
	public String protocol;
	@SerializedName("fromPort")
	@Expose
	public Integer fromPort;
	@SerializedName("toPort")
	@Expose
	public Integer toPort;
	@SerializedName("sourceIPRanges")
	@Expose
	public List<String> sourceIPRanges = new ArrayList<String>();
	@SerializedName("sourceGroups")
	@Expose
	public List<Object> sourceGroups = new ArrayList<Object>();

}