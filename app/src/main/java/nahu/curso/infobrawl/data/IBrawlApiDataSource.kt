package nahu.curso.infobrawl.data

interface IBrawlApiDataSource {
    suspend fun getPlayer(search: String): Player
}