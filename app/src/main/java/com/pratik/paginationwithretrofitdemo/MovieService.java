package com.pratik.paginationwithretrofitdemo;

import movieAPI.MovieResponceParser;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieService {
    @GET(Constants.API_METHOD_NAME)
    Call<MovieResponceParser> getTopRatedMovies(
            @Query(Constants.API_OUERY_PARAMETER_API_KEY) String apiKey,
            @Query(Constants.API_OUERY_PARAMETER_LANGUAGE) String language,
            @Query(Constants.API_OUERY_PARAMETER_PAGE) int pageIndex
    );
}
