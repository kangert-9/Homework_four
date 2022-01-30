package com.example.homework

import android.app.Application
import com.example.homework.navigation.CustomRouter
import com.github.terrakok.cicerone.Cicerone


class App: Application() {
    companion object Navigation {

        private val cicerone: Cicerone<CustomRouter> by lazy {
            Cicerone.create(CustomRouter())
        }

        val navigatorHolder = cicerone.getNavigatorHolder()
        val router = cicerone.router
    }
}
