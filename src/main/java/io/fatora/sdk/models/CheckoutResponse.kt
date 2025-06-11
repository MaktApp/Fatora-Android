package io.fatora.sdk.models

data class CheckoutResponse(
    val status: String,
    val result: CheckoutResult
)

data class CheckoutResult(
    val checkout_url: String
) 