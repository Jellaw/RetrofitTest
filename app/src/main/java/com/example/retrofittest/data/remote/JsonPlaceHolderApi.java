package com.example.retrofittest.data.remote;
import com.example.retrofittest.data.model.Acc;
import  com.example.retrofittest.data.model.Post;

import java.util.List;

import retrofit2.Call;

import retrofit2.http.GET;


public interface JsonPlaceHolderApi {
    @GET("contact/")
    Call<List<Post>> getPosts();
    @GET("acc/")
    Call<List<Acc>> getAcc();
}
