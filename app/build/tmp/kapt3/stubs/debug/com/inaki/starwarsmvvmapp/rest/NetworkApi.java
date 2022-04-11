package com.inaki.starwarsmvvmapp.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\'\u00a8\u0006\n"}, d2 = {"Lcom/inaki/starwarsmvvmapp/rest/NetworkApi;", "", "retrieveCharacters", "Lio/reactivex/Single;", "Lcom/inaki/starwarsmvvmapp/model/people/People;", "retrievePlanets", "Lcom/inaki/starwarsmvvmapp/model/planets/Planets;", "retrieveStarships", "Lcom/inaki/starwarsmvvmapp/model/starships/Starships;", "Companion", "app_debug"})
public abstract interface NetworkApi {
    @org.jetbrains.annotations.NotNull()
    public static final com.inaki.starwarsmvvmapp.rest.NetworkApi.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://www.swapi.tech/";
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/people")
    public abstract io.reactivex.Single<com.inaki.starwarsmvvmapp.model.people.People> retrieveCharacters();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/planets")
    public abstract io.reactivex.Single<com.inaki.starwarsmvvmapp.model.planets.Planets> retrievePlanets();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/starships")
    public abstract io.reactivex.Single<com.inaki.starwarsmvvmapp.model.starships.Starships> retrieveStarships();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/inaki/starwarsmvvmapp/rest/NetworkApi$Companion;", "", "()V", "BASE_URL", "", "STAR_WARS_PEOPLE", "STAR_WARS_PLANETS", "STAR_WARS_STARSHIPS", "app_debug"})
    public static final class Companion {
        private static final java.lang.String STAR_WARS_PEOPLE = "api/people";
        private static final java.lang.String STAR_WARS_PLANETS = "api/planets";
        private static final java.lang.String STAR_WARS_STARSHIPS = "api/starships";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_URL = "https://www.swapi.tech/";
        
        private Companion() {
            super();
        }
    }
}