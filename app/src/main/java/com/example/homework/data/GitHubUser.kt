package com.example.homework.data

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class GitHubUser(
    @SerializedName("id")
    @Expose val id: String? = null,
    @SerializedName("login")
    @Expose val login: String? = null,
    @SerializedName("avatar_url")
    @Expose val avatarUrl: String? = null,
//    @SerializedName("type")
//    @Expose val type: String = ""
) : Parcelable