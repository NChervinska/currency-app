package com.currencyapp.domain.model

import com.currencyapp.data.remote.dto.TeamMember


data class CoinDetail (
    val description: String,
    val coinId: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val tags: List<String>,
    val team: List<TeamMember>,
)