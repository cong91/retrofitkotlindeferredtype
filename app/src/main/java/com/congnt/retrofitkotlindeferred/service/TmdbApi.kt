package com.congnt.retrofitkotlindeferred.service

import com.congnt.retrofitkotlindeferred.data.TmdbMovieResponse
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface TmdbApi{

    @GET("movie/popular")
    fun getPopularMovie(): Deferred<Response<TmdbMovieResponse>>
}