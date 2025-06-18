package nahu.curso.infobrawl.data

import nahu.curso.infobrawl.domain.IApiBrawlRepository

class ApiBrawlRepository(                         //BrawlApiDataSource O BrawlTestDataSource
    val brawlApiDataSource: IBrawlApiDataSource = BrawlApiDataSource()) : IApiBrawlRepository
    {
    override suspend fun fetchPlayer(search: String): Player {
        return brawlApiDataSource.getPlayer(search)
    }

    override suspend fun fetchBattles(search: String): Battles {
        return brawlApiDataSource.getBattles(search)
    }

}
