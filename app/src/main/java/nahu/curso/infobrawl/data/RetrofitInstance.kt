package nahu.curso.infobrawl.data

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
        val request = chain.request().newBuilder()
            .addHeader(
                "Authorization",
                "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6ImI4MmRhOWNjLTYzMDAtNDc4MS1hOGI4LTQ4NDlmY2Y5OTE2NCIsImlhdCI6MTc0Njg0Mzc0OSwic3ViIjoiZGV2ZWxvcGVyL2MwZjdlNzdjLTQ3YjgtNDVkNi0yNTljLTc0NGVlNmZhNTE1MyIsInNjb3BlcyI6WyJicmF3bHN0YXJzIl0sImxpbWl0cyI6W3sidGllciI6ImRldmVsb3Blci9zaWx2ZXIiLCJ0eXBlIjoidGhyb3R0bGluZyJ9LHsiY2lkcnMiOlsiMjAxLjIxOS43My40OCJdLCJ0eXBlIjoiY2xpZW50In1dfQ.LFOq3J4Q8qEjjIPeMpdxZxxC1zrWNTfiT0p6XWx0RSFtZR2JaO2rGC0eKgBJEu6OjPMawajZs0T-DPC7XFgLiw"
            )
            .build()
        return chain.proceed(request)
    }
}