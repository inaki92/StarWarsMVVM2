package com.inaki.starwarsmvvmapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/inaki/starwarsmvvmapp/di/NetworkModule;", "", "()V", "providesLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "providesNetworkApi", "Lcom/inaki/starwarsmvvmapp/rest/NetworkApi;", "okHttpClient", "Lokhttp3/OkHttpClient;", "providesOkHttpClient", "loggingInterceptor", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    
    public NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor providesLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient providesOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor loggingInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.inaki.starwarsmvvmapp.rest.NetworkApi providesNetworkApi(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
}