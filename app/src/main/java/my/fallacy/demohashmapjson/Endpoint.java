package my.fallacy.demohashmapjson;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Endpoint {
    @GET("demo")
    Call<MockResponse> mockAPI();
}