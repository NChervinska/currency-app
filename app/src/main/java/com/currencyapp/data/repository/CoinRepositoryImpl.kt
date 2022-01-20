package com.currencyapp.data.repository

import com.currencyapp.data.remote.CoinApi
import com.currencyapp.data.remote.dto.CoinDetailDto
import com.currencyapp.data.remote.dto.CoinDto
import com.currencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins();
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId);
    }
}