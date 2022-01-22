package com.currencyapp.domain.repository

import com.currencyapp.data.remote.dto.CoinDetailDto
import com.currencyapp.data.remote.dto.CoinDto
import com.currencyapp.domain.model.Coin
import com.currencyapp.domain.model.CoinDetail

interface CoinRepository {

    suspend fun getCoins(): List<Coin>

    suspend fun getCoinById(coinId: String): CoinDetail
}