package com.inaki.starwarsmvvmapp.model.starships


import com.google.gson.annotations.SerializedName

data class Starships(
    @SerializedName("message")
    val message: String,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: Any,
    @SerializedName("results")
    val starships: List<Starship>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_records")
    val totalRecords: Int
)