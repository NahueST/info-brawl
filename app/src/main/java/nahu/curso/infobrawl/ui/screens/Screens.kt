package nahu.curso.infobrawl.ui.screens

sealed class Screens(val route: String) {
    object MainScreen: Screens("main_screen")
    object HistorialScreen: Screens("historial_screen")
    object Splash: Screens("Splash")
    object InicioSesion: Screens("inicio_sesion")
}