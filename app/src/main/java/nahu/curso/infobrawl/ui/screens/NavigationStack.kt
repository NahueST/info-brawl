package nahu.curso.infobrawl.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import nahu.curso.infobrawl.ui.screens.historial.HistorialScreen
import nahu.curso.infobrawl.ui.screens.main.PlayerStatsScreen
import nahu.curso.infobrawl.ui.splash.SplashScreen

@Composable
fun NavigationStack() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screens.Splash.route
    ){
        composable(route = Screens.MainScreen.route) {
            PlayerStatsScreen(navController = navController)
        }
        composable(route = Screens.HistorialScreen.route) {
            HistorialScreen(navController = navController)
        }
        composable(route = Screens.Splash.route) {
            SplashScreen( navController = navController)
        }

    }
}

