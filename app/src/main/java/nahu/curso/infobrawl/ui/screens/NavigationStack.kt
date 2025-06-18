package nahu.curso.infobrawl.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import nahu.curso.infobrawl.ui.commons.BottomBar
import nahu.curso.infobrawl.ui.commons.Destination
import nahu.curso.infobrawl.ui.screens.historial.HistorialScreen
import nahu.curso.infobrawl.ui.screens.main.PlayerStatsScreen
import nahu.curso.infobrawl.ui.splash.SplashScreen

@Composable
fun NavigationStack() {
    val navController = rememberNavController()
    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentRoute in Destination.entries.map { it.route }) {
                BottomBar(navController = navController)
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screens.MainScreen.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screens.Splash.route) {
                SplashScreen(navController = navController)
            }
            composable(Screens.MainScreen.route) {
                PlayerStatsScreen(navController = navController)
            }
            composable(Screens.HistorialScreen.route) {
                HistorialScreen(navController = navController)
            }
        }
    }
}