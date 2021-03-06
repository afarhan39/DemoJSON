package my.fallacy.demohashmapjson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiBuilder {
    private ApiBuilder() {
    }

    private static Retrofit retrofit;

    public static Retrofit getRetrofitJsonInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://afarhan.free.beeceptor.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}