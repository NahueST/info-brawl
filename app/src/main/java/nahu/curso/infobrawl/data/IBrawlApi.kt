package nahu.curso.infobrawl.data

import retrofit2.http.GET
import retrofit2.http.Path

interface IBrawlApi {
    @GET("players/{tag}")
    suspend fun getPlayer(
        @Path("tag") tag: String
    ) : Player
}