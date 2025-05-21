package nahu.curso.infobrawl.ui.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CardEstadisticas(texto: String, puntos: String, backgroundColor: Color = MaterialTheme.colorScheme.primaryContainer, textoColor: Color = MaterialTheme.colorScheme.onPrimaryContainer ){
    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth()
            .height(220.dp)
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ){
       Column {
           Text( text = "Estadisticas")

           Box(
                modifier = Modifier
                    .padding(end = 8.dp)
                    .background(backgroundColor, shape = RoundedCornerShape(50))
           ){
               Column {
                   Text(
                       text = texto,
                       style = MaterialTheme.typography.labelMedium,
                       color = textoColor,
                   )
                   Text(
                       text = puntos
                   )
               }

           }

        }
    }
}