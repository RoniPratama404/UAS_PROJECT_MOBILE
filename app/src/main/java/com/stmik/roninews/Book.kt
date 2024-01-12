package com.stmik.roninews

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import com.google.gson.annotations.SerializedName


@Parcelize
data class Book(
    @SerializedName("title")
    val name: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("thumbnail")
    val photo: String
) : Parcelable
