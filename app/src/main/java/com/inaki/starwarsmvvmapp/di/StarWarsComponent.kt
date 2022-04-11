package com.inaki.starwarsmvvmapp.di

import com.inaki.starwarsmvvmapp.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(modules = [
    AppModule::class,
    NetworkModule::class
])
@Singleton
interface StarWarsComponent {

    // here we need to define what are the components where we want to inject
    fun inject(mainActivity: MainActivity)
}