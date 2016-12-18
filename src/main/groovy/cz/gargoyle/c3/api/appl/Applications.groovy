package cz.gargoyle.c3.api.appl

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Applications {

	@SerializedName("apps")
	@Expose
	public List<Application> apps = new ArrayList<Application>();
	@SerializedName("size")
	@Expose
	public Integer size;

}

