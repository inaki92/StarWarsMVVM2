package com.inaki.starwarsmvvmapp.model.starships


import com.google.gson.annotations.SerializedName

data class Starship(
    @SerializedName("name")
    val name: String,
    @SerializedName("uid")
    val uid: String,
    @SerializedName("url")
    val url: String
)