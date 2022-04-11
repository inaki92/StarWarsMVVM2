package com.inaki.starwarsmvvmapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/inaki/starwarsmvvmapp/di/AppModule;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "providesContext", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class AppModule {
    private final android.app.Application application = null;
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context providesContext() {
        return null;
    }
}