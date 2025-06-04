package nahu.curso.infobrawl.domain

import nahu.curso.infobrawl.data.Player

interface IApiBrawlRepository{
    suspend fun fetchPlayer(search: String) : Player
}