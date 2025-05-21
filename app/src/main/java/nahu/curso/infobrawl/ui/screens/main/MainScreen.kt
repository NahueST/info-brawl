package nahu.curso.infobrawl.ui.screens.main

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import nahu.curso.infobrawl.ui.commons.Card
import nahu.curso.infobrawl.ui.screens.main.CardGrafica

@Composable
fun MainScreen(modifier: Modifier = Modifier) {

    Column {
        Row {
            Card(titulo = "Copas", puntos = "45000")
            Card(titulo = "Competitivo", puntos = "5000")
        }
        Row {
            CardGrafica( titulo = "Copas", datos = listOf(
                0.1f to 0.3f,
                0.4f to 0.7f,
                0.7f to 0.5f),
                modifier = Modifier
                    .size(width = 300.dp, height = 250.dp)
                    .padding(12.dp)
            )
            CardGrafica( titulo = "Competitivo", datos = listOf(
                0.1f to 0.3f,
                0.4f to 0.7f,
                0.7f to 0.5f),
                modifier = Modifier
                    .size(width = 300.dp, height = 250.dp)
                    .padding(12.dp)
            )
        }
        Row{
            CardEstadisticas( texto = "Record de temporada", puntos = "40000")
        }

    }
}