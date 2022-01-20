package com.currencyapp.domain.model

import com.currencyapp.data.remote.dto.*

data class CoinDetail (
    val description: String,
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val tags: List<Tag>,
    val team: List<Team>,
)