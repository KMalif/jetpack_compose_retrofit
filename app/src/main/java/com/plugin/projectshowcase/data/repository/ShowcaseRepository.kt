package com.plugin.projectshowcase.data.repository

import com.plugin.projectshowcase.data.api.ShowcaseAPI
import com.plugin.projectshowcase.data.api.model.Showcase
import javax.inject.Inject

class ShowcaseRepository @Inject constructor(
    private val showcaseAPI: ShowcaseAPI
) {
    suspend fun getAllShowcase () : List<Showcase>{
        return showcaseAPI.getAllShowcase()
    }
}