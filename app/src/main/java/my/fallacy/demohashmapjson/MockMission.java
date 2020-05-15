package my.fallacy.demohashmapjson;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MockMission {

	@SerializedName("lastReachedWP")
	private MockLastReachedWP mockLastReachedWP;

	@SerializedName("missionStatus")
	private int missionStatus;

	@SerializedName("Id")
	private int id;

	@SerializedName("token")
	private String token;

	@SerializedName("Name")
	private String name;

	@SerializedName("updatedAt")
	private int updatedAt;

	@SerializedName("waypoints")
	private Map<String, List<Float>> waypointMap;

	public void setMockLastReachedWP(MockLastReachedWP mockLastReachedWP){
		this.mockLastReachedWP = mockLastReachedWP;
	}

	public MockLastReachedWP getMockLastReachedWP(){
		return mockLastReachedWP;
	}

	public void setMissionStatus(int missionStatus){
		this.missionStatus = missionStatus;
	}

	public int getMissionStatus(){
		return missionStatus;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setToken(String token){
		this.token = token;
	}

	public String getToken(){
		return token;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUpdatedAt(int updatedAt){
		this.updatedAt = updatedAt;
	}

	public int getUpdatedAt(){
		return updatedAt;
	}
}