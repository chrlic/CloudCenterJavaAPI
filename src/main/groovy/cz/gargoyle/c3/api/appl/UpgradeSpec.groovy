package cz.gargoyle.c3.api.appl;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class UpgradeSpec {

	@SerializedName("upgradeScript")
	@Expose
	public String upgradeScript;
	@SerializedName("rollbackScript")
	@Expose
	public String rollbackScript;
	@SerializedName("preUpgradeScript")
	@Expose
	public String preUpgradeScript;
	@SerializedName("postUpgradeScript")
	@Expose
	public String postUpgradeScript;
	@SerializedName("start")
	@Expose
	public Boolean start;
	@SerializedName("stop")
	@Expose
	public Boolean stop;

}