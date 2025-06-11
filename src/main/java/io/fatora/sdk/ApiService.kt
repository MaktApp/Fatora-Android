package io.fatora.sdk

import io.fatora.sdk.models.CheckoutRequest
import io.fatora.sdk.models.CheckoutResponse
import io.fatora.sdk.models.VerifyRequest
import io.fatora.sdk.models.VerifyResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiService {
    @POST("payments/checkout")
    suspend fun createCheckout(
        @Header("api_key") apiKey: String,
        @Body request: CheckoutRequest
    ): Response<CheckoutResponse>

    @POST("payments/verify")
    suspend fun verifyPayment(
        @Header("api_key") apiKey: String,
        @Body request: VerifyRequest
    ): Response<VerifyResponse>
} 