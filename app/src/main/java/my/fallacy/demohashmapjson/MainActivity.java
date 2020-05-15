package my.fallacy.demohashmapjson;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button bCallApi = findViewById(R.id.bCallApi);
        bCallApi.setOnClickListener(v -> {
            Endpoint endpoint = ApiBuilder.getRetrofitJsonInstance().create(Endpoint.class);
            Call<MockResponse> call = endpoint.mockAPI();
            call.enqueue(new Callback<MockResponse>() {
                @Override
                public void onResponse(@NonNull Call<MockResponse> call, @NonNull Response<MockResponse> response) {
                    Log.d("yikes", response.toString());
                }

                @Override
                public void onFailure(@NonNull Call<MockResponse> call, @NonNull Throwable t) {
                    Log.d("yikes", t.toString());
                }
            });

        });
    }
}