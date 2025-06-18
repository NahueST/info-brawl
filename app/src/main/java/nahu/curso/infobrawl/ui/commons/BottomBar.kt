package nahu.curso.infobrawl.ui.commons

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomBar(navController: NavHostController) {
    val currentDestination = navController.currentBackStackEntryAsState().value?.destination?.route
    val selectedIndex = Destination.entries.indexOfFirst { it.route == currentDestination }

    NavigationBar {
        Destination.entries.forEachIndexed { index, destination ->
            NavigationBarItem(
                selected = selectedIndex == index,
                onClick = {
                    if (currentDestination != destination.route) {
                        navController.navigate(destination.route) {
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                },
                icon = { Icon(destination.icon, contentDescription = destination.contentDescription) },
                label = { Text(destination.label) }
            )
        }
    }
}

enum class Destination(
    val route: String,
    val label: String,
    val icon: ImageVector,
    val contentDescription: String
) {
    PlayerStats("main_screen",      "Estadisticas", Icons.Default.Menu,   "Estadisticas"),
    History(    "historial_screen", "Historial",    Icons.Default.DateRange,    "Historial"),
    //Maps(       "maps_screen",      "Mapas",        Icons.Default.LocationOn,   "Mapas"),
    //Brawlers(   "brawlers_screen",  "Brawlers",     Icons.Default.AccountBox,         "Brawlers")
}