package io.fatora.sdk.models

data class VerifyResponse(
    val status: String,
    val result: VerifyResult
)


data class VerifyResult(
    val order_id: String,
    val transaction_id: String,
    val amount: Double,
    val currency: String,
    val client: VerifyClient,
    val payment_date: String,
    val payment_status: String,
    val mode: String,
    val auth_code: String,
    val exchange_details: Any?,
    val exchange_rate: String,
    val transfer_details: Any?,
    val interchange_fees: String,
    val rate: Double,
    val transfer_number: String,
    val description: String,
    val card_token: String,
    val refund_details: Any?,
    val refund_transaction_id: String,
    val card_details: String,
    val card_type: String,
    val last_4_digits: String,
    val type: String
)


data class VerifyClient(
    val name: String,
    val email: String,
    val phone: String,
    val note: String
) 