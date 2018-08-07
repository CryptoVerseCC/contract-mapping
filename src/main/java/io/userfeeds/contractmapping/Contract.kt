package io.userfeeds.contractmapping

data class Contract(
        val symbol: String,
        val address: String,
        val name: String,
        val network: String,
        val is721: Boolean
)