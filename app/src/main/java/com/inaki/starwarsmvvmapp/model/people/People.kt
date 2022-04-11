package com.inaki.starwarsmvvmapp.model.people

import com.google.gson.annotations.SerializedName

data class People(
    @SerializedName("message")
    val message: String,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: Any,
    @SerializedName("results")
    val people: List<Person>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_records")
    val totalRecords: Int
)