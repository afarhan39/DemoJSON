package my.fallacy.demohashmapjson;

import com.google.gson.annotations.SerializedName;

public class MockLastReachedWP {

	@SerializedName("alt")
	private int alt;

	@SerializedName("wpNo")
	private int wpNo;

	@SerializedName("lat")
	private double lat;

	@SerializedName("lng")
	private double lng;

	public void setAlt(int alt){
		this.alt = alt;
	}

	public int getAlt(){
		return alt;
	}

	public void setWpNo(int wpNo){
		this.wpNo = wpNo;
	}

	public int getWpNo(){
		return wpNo;
	}

	public void setLat(double lat){
		this.lat = lat;
	}

	public double getLat(){
		return lat;
	}

	public void setLng(double lng){
		this.lng = lng;
	}

	public double getLng(){
		return lng;
	}
}