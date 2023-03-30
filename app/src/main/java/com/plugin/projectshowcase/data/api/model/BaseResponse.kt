package com.plugin.projectshowcase.data.api.model

data class BaseResponse (
val code : Int,
val status : String,
val data : List<Showcase>
)