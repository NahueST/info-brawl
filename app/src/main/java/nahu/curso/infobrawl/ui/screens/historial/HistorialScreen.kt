package nahu.curso.infobrawl.ui.screens.historial

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import nahu.curso.infobrawl.ui.commons.FilterChip

@Composable
fun HistorialScreen(navController: NavHostController) {
    FilterChip(botones = listOf("Copas", "Competitivo", "Atrapagemas"))
}


