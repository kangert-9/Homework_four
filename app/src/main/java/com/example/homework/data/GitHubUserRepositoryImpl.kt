package com.example.homework.data

import com.example.homework.data.retrofit.GitHubApi
import io.reactivex.rxjava3.schedulers.Schedulers

class GitHubUserRepositoryImpl(val api: GitHubApi): GitHubUserRepository {

   override fun getUsers() = api.fetchUsers().subscribeOn(Schedulers.io())

//    override fun getUserByLogin(userId: String): GitHubUser? {
//        return null
//    }
}