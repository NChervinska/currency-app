package com.currencyapp.presentation.coin_list

import androidx.lifecycle.ViewModel
import com.currencyapp.domain.use_case.get_coins.GetCoinsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CoinListViewModel @Inject constructor(
private val getCoinsUseCase: GetCoinsUseCase
) : ViewModel() {

}