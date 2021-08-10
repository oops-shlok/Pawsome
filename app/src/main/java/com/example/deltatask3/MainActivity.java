package com.example.deltatask3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private Context context;
    LinearLayoutManager layoutManager = new LinearLayoutManager(this);
    List<infoClass> userList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.info_dogs);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.thedogapi.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JSONPlaceHolder jsonPlaceHolder = retrofit.create(JSONPlaceHolder.class);
        Call<List<infoClass>> call = jsonPlaceHolder.getDogs();
        call.enqueue(new Callback<List<infoClass>>() {
            @Override
            public void onResponse(Call<List<infoClass>> call, Response<List<infoClass>> response) {
                List<infoClass> userList = response.body();
                Adapter adapter = new Adapter(MainActivity.this,userList);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<infoClass>> call, Throwable t) {
                return;
            }

        });

    }

}