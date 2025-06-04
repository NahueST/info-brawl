package nahu.curso.infobrawl.ui.commons

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import nahu.curso.infobrawl.data.Player

@Composable
fun CardStatsGrid(player: Player?)
{
    if (player == null) {
        Text("No se encontró el jugador")
        return
    }

    val playerStats = listOf(
        "Copas" to player.trophies,
        "Record de copas" to player.highestTrophies,
        "Victorias solo" to player.soloVictories,
        "Victorias duo" to player.duoVictories,
        "Victorias Trio" to player.teamVictories
    )

    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 128.dp),
        modifier = Modifier.padding(35.dp)
    )
    {
        items(playerStats){ (titulo, puntos) ->
           Card(titulo = titulo, puntos = puntos)
        }
    }
}
