package io.fatora.sdk.models

data class CheckoutRequest(
    val amount: Double,
    val currency: String,
    val order_id: String,
    val client: Client,
    val language: String,
    val success_url: String,
    val failure_url: String,
    val fcm_token: String,
    val save_token: Boolean,
    val note: String
) 