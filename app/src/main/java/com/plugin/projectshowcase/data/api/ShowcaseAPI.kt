package com.plugin.projectshowcase.data.api

import com.plugin.projectshowcase.data.api.model.Photos
import com.plugin.projectshowcase.data.api.model.Showcase
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ShowcaseAPI {
    @GET("api/showcases")
    suspend fun getAllShowcase() : List<Showcase>

    @GET("/photos")
    suspend fun getAllPhotos() : List<Photos>

    @GET("/photos/{id}")
    suspend fun getPhotoById(
        @Path("id") id : Int
    ) : Call<Photos>

}