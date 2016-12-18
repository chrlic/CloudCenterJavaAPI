package cz.gargoyle.c3.api.depenv

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class AssociatedCloud {

	@SerializedName("regionId")
	@Expose
	public String regionId;
	@SerializedName("regionName")
	@Expose
	public String regionName;
	@SerializedName("regionDisplayName")
	@Expose
	public String regionDisplayName;
	@SerializedName("cloudFamily")
	@Expose
	public String cloudFamily;
	@SerializedName("cloudId")
	@Expose
	public String cloudId;
	@SerializedName("cloudAccountId")
	@Expose
	public String cloudAccountId;
	@SerializedName("cloudName")
	@Expose
	public String cloudName;
	@SerializedName("cloudAccountName")
	@Expose
	public String cloudAccountName;
	@SerializedName("cloudAssociationDefaults")
	@Expose
	public List<CloudAssociationDefault> cloudAssociationDefaults = new ArrayList<CloudAssociationDefault>();
	@SerializedName("default")
	@Expose
	public Boolean _default;
}
