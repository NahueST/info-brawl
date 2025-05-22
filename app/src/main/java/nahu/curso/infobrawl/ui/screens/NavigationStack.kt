package nahu.curso.infobrawl.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationStack() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screens.Splash.route
    )  {
        composable(route = Screens.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screens.AnimeList.route) {
            AnimeListScreen(navController = navController)
        }
        composable(route = Screens.AnimeDetail.route + "/{animeId}") { it ->
            var id = it.arguments?.getString("animeId")
            val animeId = id?.toIntOrNull()
            AnimeDetailScreen(animeId ?: 0)
        }

    }

}
