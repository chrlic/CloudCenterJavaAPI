package cz.gargoyle.c3.api.appl;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class MigrationSpec {

	@SerializedName("backupScript")
	@Expose
	public String backupScript;
	@SerializedName("restoreScript")
	@Expose
	public String restoreScript;
	@SerializedName("backupLocation")
	@Expose
	public String backupLocation;
	@SerializedName("preMigrateScript")
	@Expose
	public String preMigrateScript;
	@SerializedName("postMigrateScript")
	@Expose
	public String postMigrateScript;

}