package com.kikopoggi.themoviedb.api

import com.kikopoggi.themoviedb.model.moviesResult
import com.kikopoggi.themoviedb.util.Constants.API_KEY
import com.kikopoggi.themoviedb.util.Constants.PAGE_INIT
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface MoviesApi {

    @GET("movie/top_rated")
    suspend fun getMovies(
        @Query("page") page: Int = PAGE_INIT,
        @Query("api_key") apiKey : String = API_KEY
    ): Response<moviesResult>
}