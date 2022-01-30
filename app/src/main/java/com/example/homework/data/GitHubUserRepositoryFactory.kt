package com.example.homework.data

object GitHubUserRepositoryFactory {
    fun create(): GitHubUserRepository = GitHubUserRepositoryImpl()
}