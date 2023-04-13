package com.plugin.projectshowcase.data.repository

import com.plugin.projectshowcase.data.api.ShowcaseAPI
import com.plugin.projectshowcase.data.api.model.Photos
import retrofit2.Call
import javax.inject.Inject

class PhotosRepo @Inject constructor(
    private val showcaseAPI: ShowcaseAPI
) {
    suspend fun getAllPhotos() : List<Photos>{
        return showcaseAPI.getAllPhotos()
    }

    suspend fun getPhotoById(id : Int) : Call<Photos> {
        return showcaseAPI.getPhotoById(id)
    }
}