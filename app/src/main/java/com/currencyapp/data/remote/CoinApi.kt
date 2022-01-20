package com.currencyapp.data.remote

import com.currencyapp.data.remote.dto.CoinDetailDto
import com.currencyapp.data.remote.dto.CoinDto
import retrofit2.http.*

interface CoinApi {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}