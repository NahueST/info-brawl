package nahu.curso.infobrawl.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import nahu.curso.infobrawl.ui.screens.historial.HistorialScreen
import nahu.curso.infobrawl.ui.screens.main.MainScreen

@Composable
fun NavigationStack() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screens.MainScreen.route
    )  {
        composable(route = Screens.MainScreen.route) {
            MainScreen(navController = navController)
        }
        composable(route = Screens.HistorialScreen.route) {
            HistorialScreen(navController = navController)
        }
//        composable(route = Screens.AnimeDetail.route + "/{animeId}") { it ->
//            var id = it.arguments?.getString("animeId")
//            val animeId = id?.toIntOrNull()
//            AnimeDetailScreen(animeId ?: 0)
//        }

        }
    }

