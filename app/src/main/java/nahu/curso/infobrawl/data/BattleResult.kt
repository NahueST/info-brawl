package nahu.curso.infobrawl.data

data class Battles(
    val items : List<Batalla>
)

data class Batalla(
    val battleTime: String,
    val event: Event,
    val battle: Battle,
)

data class Event(
    val id: Int,
    val mode: String,
    val map: String
)

data class Battle(
    val mode: String,
    val type: String,
    val result: String,
    val duration: Int,
    val trophyChange: Int,
    val starPlayer: StarPlayer,
    val teams: List<List<Team>>
)

data class StarPlayer(
    val tag: String,
    val name: String,
    val brawler: Brawler,
)

data class Team(
    val tag: String,
    val name: String,
    val brawler: Brawler
)