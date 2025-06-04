package nahu.curso.infobrawl.data

import android.util.Log
import com.google.gson.Gson
import kotlinx.coroutines.delay

class BrawlTestDataSource : IBrawlApiDataSource{

    override suspend fun getPlayer(search: String): Player{
        //delay(5000)

        val gson = Gson()
        val playerResultado = gson.fromJson(json, Player::class.java)
        Log.d("GSONDATA", playerResultado.toString())
        return playerResultado
    }


    private var json = """
       {
      "tag": "#820uugrc8",
      "name": "Mck",
      "trophies": 39121,
      "highestTrophies": 39133,
      "expLevel": 221,
      "3vs3Victories": 14455,
      "soloVictories": 489,
      "duoVictories": 884,
      "club": {
        "tag": "#92PVGUL",
        "name": "JCM"
      },
      "brawlers": [
        {
          "id": 16000000,
          "name": "SHELLY",
          "power": 10,
          "rank": 38,
          "trophies": 738,
          "highestTrophies": 743,
          "gears": [
            {
              "id": 62000000,
              "name": "SPEED"
            },
            {
              "id": 62000001,
              "name": "HEALTH"
            }
          ],
          "starPowers": [
            {
              "id": 23000076,
              "name": "SHELL SHOCK"
            },
            {
              "id": 23000135,
              "name": "BAND-AID"
            }
          ],
          "gadgets": [
            {
              "id": 23000255,
              "name": "FAST FORWARD"
            },
            {
              "id": 23000288,
              "name": "CLAY PIGEONS"
            }
          ]
        }
      ]
    }
    """.trimIndent()
}