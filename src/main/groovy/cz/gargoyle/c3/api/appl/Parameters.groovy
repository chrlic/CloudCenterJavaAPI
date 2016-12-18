package cz.gargoyle.c3.api.appl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Parameters {

	@SerializedName("appParams")
	@Expose
	public List<AppParam> appParams = new ArrayList<AppParam>();
	@SerializedName("envParams")
	@Expose
	public List<Object> envParams = new ArrayList<Object>();

}