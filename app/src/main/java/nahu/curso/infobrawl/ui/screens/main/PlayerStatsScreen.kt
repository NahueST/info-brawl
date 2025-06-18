package nahu.curso.infobrawl.ui.screens.main

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import nahu.curso.infobrawl.data.Batalla
import nahu.curso.infobrawl.ui.commons.CardGrafica
import nahu.curso.infobrawl.ui.commons.CardStatsGrid
import nahu.curso.infobrawl.ui.commons.Header

@Composable
fun PlayerStatsScreen(modifier: Modifier = Modifier, navController: NavHostController, vm: MainScreenViewModel = viewModel())
{
    vm.uiState.player?.let { Header(textoIzquierdo = it.name, textoDerecho = it.club.name) }
    Column {
        ElevatedCard(
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
                .padding(10.dp, 50.dp),
            elevation = CardDefaults.cardElevation(15.dp)
        ){
            Column {
                vm.uiState.player?.let { CardStatsGrid(it) }
            }
        }
        Row {
            val registros = vm.uiState.battles?.let { obtenerRegistroDiario(vm) }

            CardGrafica(
                titulo = "Copas",
                datos = registros,
                modifier = Modifier
                    .size(width = 350.dp, height = 250.dp)
                    .padding(5.dp)
            )
        }
    }
}

data class RegistroDiario(val dia: String, val copas: Int)

fun obtenerRegistroDiario(vm: MainScreenViewModel): List<RegistroDiario> {
    val player = vm.uiState.player
    val batallas = vm.uiState.battles?.items

    Log.d("Player StatsScreen", player.toString())
    Log.d("Player StatsScreen", batallas.toString())

    if (player == null || batallas == null) return emptyList()

    val mapaCopas = mutableMapOf<String, Int>()
    val jugadorTag = player.tag

    Log.d("Player StatsScreen", jugadorTag)

    for (batalla in batallas) {
        val fecha = batalla.battleTime.substring(0, 8)
        val fechaFormateada = "${fecha.substring(6, 8)}/${fecha.substring(4, 6)}"

        val jugador = batalla.battle.teams.flatten().find { it.tag.replace("#", "", ignoreCase = true).equals(jugadorTag.replace("#", ""), ignoreCase = true) }

        Log.d("jugadoressss", jugador.toString())

        if (jugador != null) {
            val copasGanadas = batalla.battle.trophyChange
            Log.d("Entro aca", jugador.toString())
            mapaCopas[fechaFormateada] = mapaCopas.getOrDefault(fechaFormateada, 0) + copasGanadas
        }
    }

    return mapaCopas.toSortedMap().map { RegistroDiario(it.key, it.value) }
}