package nahu.curso.infobrawl.data

import android.util.Log

class BrawlApiDataSource : IBrawlApiDataSource{

    override suspend fun getPlayer(search: String): Player {

        Log.d("API", "BrawlApiDataSource.getPlayer")
        val playerResult = RetrofitInstance.api.getPlayer(search)
        Log.d("API", "BrawlApiDataSource.getPlayer Result: ${playerResult}")
        return playerResult
    }

    override suspend fun getBattles(search: String): Battles {
        Log.d("API", "BrawlApiDataSource.getBattles")
        val battlesResult = RetrofitInstance.api.getBattles(search)
        Log.d("API", "BrawlApiDataSource.getBattles: Result $battlesResult")
        return battlesResult
    }
}