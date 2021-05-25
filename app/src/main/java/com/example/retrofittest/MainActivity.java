package com.example.retrofittest;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.example.retrofittest.data.model.Acc;
import com.example.retrofittest.data.model.Post;
import com.example.retrofittest.data.remote.JsonPlaceHolderApi;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class MainActivity extends AppCompatActivity {
    private TextView textViewResult;
    private ImageView imgView;
    List<Acc> accs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = findViewById(R.id.text_view_result);
        imgView=findViewById(R.id.imageView);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://172.16.222.202:8080/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        Retrofit retrofitAcc = new Retrofit.Builder()
                .baseUrl("http://172.16.222.202:8080/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderApi jsonPlaceHolderApiACC = retrofitAcc.create(JsonPlaceHolderApi.class);

        Call<List<Post>> call = jsonPlaceHolderApi.getPosts();
        Call<List<Acc>> callAcc = jsonPlaceHolderApiACC.getAcc();
        callAcc.enqueue(new Callback<List<Acc>>() {

                            @Override
                            public void onResponse(Call<List<Acc>> call, Response<List<Acc>> response) {
                                accs = response.body();
                            }

                            @Override
                            public void onFailure(Call<List<Acc>> call, Throwable t) {
                                textViewResult.setText(t.getMessage());
                            }
                        });
        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                if (!response.isSuccessful()) {
                    textViewResult.setText("Code: " + response.code());
                    return;
                }
                List<Post> posts = response.body();
                for (Post post : posts) {
                    String content = "";
                    content += "ID: " + post.getId() + "\n";
                    content += "name: " + post.getName() + "\n";
                    content += "Acc ID: " + post.getAccid() + "\n";
                    for (Acc acc : accs) {
                        if (post.getAccid()==acc.getId()){
                            content += "username: " + acc.getUsername() + "\n";
                            content += "password: " + acc.getPassword() + "\n\n";
                        }
                    }
                    textViewResult.append(content);
                }
            }
            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }
        });
        Glide.with(getApplicationContext())
                .load("http://172.16.222.202:8080/downloadFile/the_joker_illustration-wallpaper-1920x1080.jpg")
                .centerCrop()
                .into(imgView);
    }
}