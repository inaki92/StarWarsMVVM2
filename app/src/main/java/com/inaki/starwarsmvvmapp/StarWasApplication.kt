package com.inaki.starwarsmvvmapp

import android.app.Application
import com.inaki.starwarsmvvmapp.di.AppModule
import com.inaki.starwarsmvvmapp.di.DaggerStarWarsComponent
import com.inaki.starwarsmvvmapp.di.StarWarsComponent

class StarWasApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        starWarsComponent = DaggerStarWarsComponent
            .builder()
            .appModule(AppModule(this))
            .build()
    }

    companion object {
        lateinit var starWarsComponent: StarWarsComponent
    }
}