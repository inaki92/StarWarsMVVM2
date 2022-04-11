package com.inaki.starwarsmvvmapp.model.planets


import com.google.gson.annotations.SerializedName

data class Planet(
    @SerializedName("name")
    val name: String,
    @SerializedName("uid")
    val uid: String,
    @SerializedName("url")
    val url: String
)