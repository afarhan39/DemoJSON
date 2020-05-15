package my.fallacy.demohashmapjson;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class MockResponse {
	@SerializedName("status")
	private int status;
	@SerializedName("message")
	private String message;

	@SerializedName("data")
	private Map<String, MockMission> mockMissionMap;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, MockMission> getMockMissionMap() {
		return mockMissionMap;
	}

	public void setMockMissionMap(Map<String, MockMission> mockMissionMap) {
		this.mockMissionMap = mockMissionMap;
	}
}