// Generated by Dagger (https://dagger.dev).
package com.inaki.starwarsmvvmapp.di;

import com.inaki.starwarsmvvmapp.rest.NetworkApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidesNetworkApiFactory implements Factory<NetworkApi> {
  private final NetworkModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public NetworkModule_ProvidesNetworkApiFactory(NetworkModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public NetworkApi get() {
    return providesNetworkApi(module, okHttpClientProvider.get());
  }

  public static NetworkModule_ProvidesNetworkApiFactory create(NetworkModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new NetworkModule_ProvidesNetworkApiFactory(module, okHttpClientProvider);
  }

  public static NetworkApi providesNetworkApi(NetworkModule instance, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(instance.providesNetworkApi(okHttpClient));
  }
}