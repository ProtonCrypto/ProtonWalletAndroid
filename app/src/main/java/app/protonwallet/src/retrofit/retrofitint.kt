package app.protonwallet.src.retrofit

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("api/wallet/mobile/CreateNew")
    fun sendRequest(@Body data: JsonObject): Call<Responseserver?>?
}
