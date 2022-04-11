package com.inaki.starwarsmvvmapp.model.planets


import com.google.gson.annotations.SerializedName

data class Planets(
    @SerializedName("message")
    val message: String,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: Any,
    @SerializedName("results")
    val planets: List<Planet>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_records")
    val totalRecords: Int
)