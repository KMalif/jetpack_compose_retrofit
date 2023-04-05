package com.plugin.projectshowcase.data.repository

import com.plugin.projectshowcase.data.api.ApiClient
import com.plugin.projectshowcase.data.api.model.Photos
import javax.inject.Inject

class PhotoRepository @Inject constructor(
    private val apiClient: ApiClient
) {
    suspend fun getAllPhotos() : List<Photos>{
        return apiClient.getAllPhotos()
    }
}