package com.example.moviepro.service;

import com.example.moviepro.model.Result;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {

    //Base url
    // https://api.themoviedb.org

    //End point url
    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);

}
