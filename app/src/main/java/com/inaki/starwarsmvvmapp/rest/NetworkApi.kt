package com.inaki.starwarsmvvmapp.rest

import com.inaki.starwarsmvvmapp.model.people.People
import com.inaki.starwarsmvvmapp.model.planets.Planets
import com.inaki.starwarsmvvmapp.model.starships.Starships
import io.reactivex.Single
import retrofit2.http.GET

interface NetworkApi {

    @GET(STAR_WARS_PEOPLE)
    fun retrieveCharacters(): Single<People>

    @GET(STAR_WARS_PLANETS)
    fun retrievePlanets(): Single<Planets>

    @GET(STAR_WARS_STARSHIPS)
    fun retrieveStarships(): Single<Starships>

    companion object{
        private const val STAR_WARS_PEOPLE = "api/people"
        private const val STAR_WARS_PLANETS = "api/planets"
        private const val STAR_WARS_STARSHIPS = "api/starships"
        const val BASE_URL = "https://www.swapi.tech/"
    }
}