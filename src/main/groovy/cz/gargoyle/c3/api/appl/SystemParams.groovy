package cz.gargoyle.c3.api.appl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class SystemParams {

	@SerializedName("params")
	@Expose
	public List<Param> params = new ArrayList<Param>();
	@SerializedName("size")
	@Expose
	public Object size;

}