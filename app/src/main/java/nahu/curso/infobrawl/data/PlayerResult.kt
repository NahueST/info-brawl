package nahu.curso.infobrawl.data

import com.google.gson.annotations.SerializedName


data class PlayerResult(
    val data: Player
)

data class Player(
    val club: Club,
    val tag: String,
    val name: String,
    val thropies: Int,
    val highestThropies: Int,
    val expPoints: Int,
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
    val thropies: Int,
    val highestThropies: Int,
    val gears: List<Gear>,
    val starPower: List<StarPower>,
    val gadgets: List<Gadget>

)