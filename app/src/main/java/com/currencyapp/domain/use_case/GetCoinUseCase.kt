package com.currencyapp.domain.use_case

import com.currencyapp.common.Resource
import com.currencyapp.domain.model.CoinDetail
import com.currencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading<CoinDetail>())
            val coin = repository.getCoinById(coinId)
            emit(Resource.Success<CoinDetail>(data = coin))
        } catch (e: HttpException) {
            emit(Resource.Error<CoinDetail>(e.localizedMessage ?: "error"))
        } catch (e: IOException) {
            emit(Resource.Error<CoinDetail>("Check your internet connection"))
        }

    }
}