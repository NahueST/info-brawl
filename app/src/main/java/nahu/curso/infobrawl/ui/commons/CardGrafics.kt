package nahu.curso.infobrawl.ui.commons

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CardGrafica(
    titulo: String,
    datos: List<Pair<Float, Float>>, // puntos X-Y normalizados 0f..1f
    modifier: Modifier = Modifier
) {
    ElevatedCard(
        modifier = modifier
            .fillMaxWidth()
            .height(220.dp)
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            // Título en la parte superior
            Text(
                text = titulo,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 12.dp)
            )

            // Contenedor para la gráfica y los ejes
            Row {
                // Eje Y con números 3, 2, 1 (de arriba hacia abajo)
                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .height(150.dp)
                        .padding(end = 8.dp)
                ) {
                    Text("3")
                    Text("2")
                    Text("1")
                }

                // Gráfica en canvas
                Canvas(
                    modifier = Modifier
                        .weight(1f)
                        .height(150.dp)
                        .border(1.dp, Color.Gray)
                ) {
                    val w = size.width
                    val h = size.height

                    // Dibujar línea base para eje X y Y
                    drawLine(Color.Black, Offset(0f, h), Offset(w, h), strokeWidth = 2f) // eje X
                    drawLine(Color.Black, Offset(0f, 0f), Offset(0f, h), strokeWidth = 2f) // eje Y

                    // Dibujar puntos y conectar con líneas
                    if (datos.isNotEmpty()) {
                        val puntos = datos.map { Offset(it.first * w, h - it.second * h) }
                        for (i in 0 until puntos.size - 1) {
                            drawLine(Color.Blue, puntos[i], puntos[i + 1], strokeWidth = 3f)
                        }
                        puntos.forEach {
                            drawCircle(Color.Red, radius = 6f, center = it)
                        }
                    }
                }
            }

            // Eje X con números 4, 5, 7 (debajo)
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 32.dp) // start para alinear con gráfica
            ) {
                Text("4")
                Text("5")
                Text("7")
            }
        }
    }
}
