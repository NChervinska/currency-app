package com.currencyapp.di

import com.currencyapp.common.Constants
import com.currencyapp.data.remote.CoinApi
import com.currencyapp.data.repository.CoinRepositoryImpl
import com.currencyapp.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApi(): CoinApi {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(CoinApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinApi): CoinRepository{
        return CoinRepositoryImpl(api)
    }
}