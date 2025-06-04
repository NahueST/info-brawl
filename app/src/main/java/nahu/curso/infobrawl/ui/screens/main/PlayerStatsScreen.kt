package nahu.curso.infobrawl.ui.screens.main

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
import nahu.curso.infobrawl.ui.commons.CardGrafica
import nahu.curso.infobrawl.ui.commons.CardStatsGrid

@Composable
fun PlayerStatsScreen(modifier: Modifier = Modifier,
            navController: NavHostController,
            vm: MainScreenViewModel = viewModel()
)
{
    Column {
        ElevatedCard(
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
                .padding(10.dp),
            elevation = CardDefaults.cardElevation(15.dp)
        ){
            Column {
                vm.uiState.player?.let { CardStatsGrid(it) }
            }
        }
        Row {
            CardGrafica( titulo = "Copas", datos = listOf(
                0.1f to 0.3f,
                0.4f to 0.7f,
                0.7f to 0.5f),
                modifier = Modifier
                    .size(width = 350.dp, height = 250.dp)
                    .padding(5.dp)
            )
        }
    }
}