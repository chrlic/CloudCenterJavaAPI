package cz.gargoyle.c3.api.appl;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class HwProfile {

	@SerializedName("memorySize")
	@Expose
	public Integer memorySize;
	@SerializedName("numOfCPUs")
	@Expose
	public Integer numOfCPUs;
	@SerializedName("networkSpeed")
	@Expose
	public Object networkSpeed;
	@SerializedName("numOfNICs")
	@Expose
	public Integer numOfNICs;
	@SerializedName("localStorageCount")
	@Expose
	public Integer localStorageCount;
	@SerializedName("localStorageSize")
	@Expose
	public Integer localStorageSize;
	@SerializedName("cudaSupport")
	@Expose
	public Boolean cudaSupport;
	@SerializedName("ssdSupport")
	@Expose
	public Boolean ssdSupport;
	@SerializedName("supportHardwareProvision")
	@Expose
	public Boolean supportHardwareProvision;

}