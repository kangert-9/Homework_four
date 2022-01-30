package com.example.homework.data

import io.reactivex.rxjava3.core.Single

interface GitHubUserRepository {

    fun getUsers(): Single<List<GitHubUser>>

   // fun getUserByLogin(userId: String): GitHubUser?
}