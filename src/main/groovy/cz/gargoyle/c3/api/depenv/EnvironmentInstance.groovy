package cz.gargoyle.c3.api.depenv;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class EnvironmentInstance {

	@SerializedName("id")
	@Expose
	public Integer id;
	@SerializedName("cloudType")
	@Expose
	public String cloudType;
	@SerializedName("instanceType")
	@Expose
	public String instanceType;
	@SerializedName("name")
	@Expose
	public String name;
	@SerializedName("description")
	@Expose
	public Object description;
	@SerializedName("costPerHour")
	@Expose
	public Double costPerHour;
	@SerializedName("costPerMonth")
	@Expose
	public Double costPerMonth;
	@SerializedName("supportsMonthlyBilling")
	@Expose
	public Boolean supportsMonthlyBilling;
	@SerializedName("hwSpec")
	@Expose
	public HwSpec hwSpec;
	@SerializedName("swSpec")
	@Expose
	public SwSpec swSpec;
	@SerializedName("displayCategory")
	@Expose
	public Object displayCategory;
	@SerializedName("vendorMultiplier")
	@Expose
	public Object vendorMultiplier;

}