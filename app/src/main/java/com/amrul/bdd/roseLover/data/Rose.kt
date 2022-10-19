package com.amrul.bdd.roseLover.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Rose(
    var name: String = "",
    var detail: String = "",
    var color: String = "",
    var photo: Int = 0,
) : Parcelable
