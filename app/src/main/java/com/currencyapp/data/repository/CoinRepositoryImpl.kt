package com.currencyapp.data.repository

import com.currencyapp.data.remote.CoinApi
import com.currencyapp.data.remote.dto.CoinDetailDto
import com.currencyapp.data.remote.dto.CoinDto
import com.currencyapp.data.remote.dto.toCoin
import com.currencyapp.data.remote.dto.toCoinDetail
import com.currencyapp.domain.model.Coin
import com.currencyapp.domain.model.CoinDetail
import com.currencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinApi
) : CoinRepository {
    override suspend fun getCoins(): List<Coin> {
        return api.getCoins().map { it.toCoin() }
    }

    override suspend fun getCoinById(coinId: String): CoinDetail {
        return api.getCoinById(coinId = coinId).toCoinDetail()
    }
}