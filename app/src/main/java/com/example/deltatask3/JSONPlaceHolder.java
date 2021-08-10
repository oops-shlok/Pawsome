package com.example.deltatask3;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;



public interface JSONPlaceHolder {

    @GET("breeds")
    Call<List<infoClass>>getDogs();
}

