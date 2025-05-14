package nahu.curso.infobrawl

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import nahu.curso.infobrawl.ui.screens.main.MainScreen
import nahu.curso.infobrawl.ui.theme.InfoBrawlTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { //lo que está dentro del set content sale dentro de la pantalla
            MaterialTheme {

                MainScreen()

            }
        }
    }
}

