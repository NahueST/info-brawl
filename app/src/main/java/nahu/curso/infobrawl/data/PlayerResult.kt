package nahu.curso.infobrawl.data

import com.google.gson.annotations.SerializedName

data class Player(
    val tag: String,
    val name: String,
    val trophies: Int,
    val highestTrophies: Int,
    @SerializedName("3vs3Victories")
    val teamVictories: Int,
    val soloVictories: Int,
    val duoVictories: Int,
    val expLevel: Int,
    val expPoints: Int,
    val club: Club,
    val brawlers: List<Brawler>
    )

data class Club(
    val tag: String,
    val name: String
)

data class Brawler(
    val id: Int,
    val name: String,
    val power: Int,
    val rank: Int,
    val trophies: Int,
    val highestTrophies: Int,
    val gears: List<Gear>,
    val starPowers: List<StarPower>,
    val gadgets: List<Gadget>
)

data class Gear(
    val id: Int,
    val name: String,
)

data class StarPower(
    val id: Int,
    val name: String,
)

data class Gadget(
    val id: Int,
    val name: String,
)