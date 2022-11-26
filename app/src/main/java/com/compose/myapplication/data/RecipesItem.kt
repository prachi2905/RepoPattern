@file:Suppress("DEPRECATED_ANNOTATION")

package com.compose.myapplication.data

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize
import java.time.LocalDate

@JsonClass(generateAdapter = false)
@Parcelize
data class RecipesItem(
    @Json(name = "service_version")
    val serviceVersion: String = "",
    @Json(name = "title")
    val title: String = "",
    @Json(name = "explanation")
    val explanation: String = "",
    @Json(name = "date")
    val date: LocalDate,
    @Json(name = "media_type") val mediaType: String = "",
    @Json(name = "hdurl") val hdUrl: String = "",
    val url: String
) : Parcelable
