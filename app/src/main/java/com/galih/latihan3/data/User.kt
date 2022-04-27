package com.galih.latihan3.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

//27 April 2022
//10119175
//Mochamad Galih Prasetya
//IF-5

@Parcelize
data class User(
    val name: String?,
    val age: Int?
) : Parcelable