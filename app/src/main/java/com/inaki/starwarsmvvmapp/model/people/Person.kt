package com.inaki.starwarsmvvmapp.model.people


import com.google.gson.annotations.SerializedName

data class Person(
    @SerializedName("name")
    val name: String,
    @SerializedName("uid")
    val uid: String,
    @SerializedName("url")
    val url: String
)