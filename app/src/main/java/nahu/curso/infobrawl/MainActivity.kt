package nahu.curso.infobrawl

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import nahu.curso.infobrawl.ui.screens.NavigationStack

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { //lo que está dentro del set content sale dentro de la pantalla
            MaterialTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) {  innerPadding ->
                    NavigationStack()
                }
            }
        }
    }
}