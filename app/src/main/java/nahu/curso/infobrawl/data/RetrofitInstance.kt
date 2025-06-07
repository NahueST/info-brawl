package nahu.curso.infobrawl.data

import nahu.curso.infobrawl.BuildConfig
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val BASE_URL = "https://api.brawlstars.com/v1/"
    private val client = OkHttpClient.Builder().addInterceptor(AuthInterceptor()).build()
    private val retrofit by lazy{
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: IBrawlApi by lazy{
        retrofit.create(IBrawlApi::class.java)
    }
}

class AuthInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val apiKey = BuildConfig.apiKey
        val request = chain.request().newBuilder()
            .addHeader(
                "Authorization",
                "Bearer $apiKey"
            )
            .build()
        return chain.proceed(request)
    }
}
