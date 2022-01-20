package com.currencyapp.domain.repository

import com.currencyapp.data.remote.dto.CoinDetailDto
import com.currencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}