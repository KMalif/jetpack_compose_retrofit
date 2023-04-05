package com.plugin.projectshowcase.data.api

import com.plugin.projectshowcase.data.api.model.Photos
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT


interface ApiClient {

    @GET("/photos")
    suspend fun getAllPhotos() : List<Photos>

}