package com.templates.moonwolf125.androidkotlinarchitecturetemplates.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TempModel(
    val data: String
): Parcelable