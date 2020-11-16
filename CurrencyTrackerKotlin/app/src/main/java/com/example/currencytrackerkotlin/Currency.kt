package com.example.currencytrackerkotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

data class Currency(
    @SerializedName("base")
    @Expose
    val base: String? = null,

    @SerializedName("date")
    @Expose
    val date: String? = null,

    @SerializedName("rates")
    @Expose
    val rates: Map<String, Float>? = null
)