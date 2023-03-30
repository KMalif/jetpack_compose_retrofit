package com.plugin.projectshowcase.data.api

import com.plugin.projectshowcase.data.api.model.Photos
import com.plugin.projectshowcase.data.api.model.Showcase
import retrofit2.http.GET

interface ShowcaseAPI {
    @GET("api/showcases")
    suspend fun getAllShowcase() : List<Showcase>

    @GET("/photos")
    suspend fun getAllPhotos() : List<Photos>

}