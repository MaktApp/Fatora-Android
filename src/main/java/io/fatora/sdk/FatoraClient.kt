package io.fatora.sdk

import io.fatora.sdk.models.CheckoutRequest
import io.fatora.sdk.models.CheckoutResponse
import io.fatora.sdk.models.VerifyRequest
import io.fatora.sdk.models.VerifyResponse
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class FatoraClient(private val apiKey: String) {
    private val apiService: ApiService

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.fatora.io/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        apiService = retrofit.create(ApiService::class.java)
    }

    suspend fun createCheckout(request: CheckoutRequest): CheckoutResponse? {
        val response: Response<CheckoutResponse> = apiService.createCheckout(apiKey, request)
        return if (response.isSuccessful) response.body() else null
    }

    suspend fun verifyPayment(request: VerifyRequest): VerifyResponse? {
        val response: Response<VerifyResponse> = apiService.verifyPayment(apiKey, request)
        return if (response.isSuccessful) response.body() else null
    }
} 