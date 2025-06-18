package nahu.curso.infobrawl.ui.commons

import android.util.Log
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import nahu.curso.infobrawl.ui.screens.main.RegistroDiario

@Composable
fun CardGrafica(
    titulo: String,
    datos: List<RegistroDiario>?,
    modifier: Modifier = Modifier
) {
    ElevatedCard(
        modifier = modifier
            .fillMaxWidth()
            .height(320.dp)
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = titulo,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 12.dp)
            )

            if (!datos.isNullOrEmpty()) {
                val copasMax = datos.maxOf { it.copas }
                val copasMin = datos.minOf { it.copas }
                val pasoY = (copasMax - copasMin).takeIf { it != 0 } ?: 10

                val etiquetasY = (copasMin..copasMax step pasoY / 2).toList().sortedDescending()

                Row {
                    // Etiquetas eje Y
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .height(150.dp)
                            .padding(end = 8.dp)
                    ) {
                        etiquetasY.forEach {
                            Text(it.toString(), fontSize = 12.sp)
                        }
                    }

                    // Canvas del gráfico
                    Canvas(
                        modifier = Modifier
                            .weight(1f)
                            .height(150.dp)
                            .border(1.dp, Color.Gray)
                    ) {
                        val w = size.width
                        val h = size.height
                        val margen = 16f

                        val escalaY = (h - 2 * margen) / pasoY
                        val pasoX = (w - 2 * margen) / (datos.size - 1).coerceAtLeast(1)

                        val puntos = datos.mapIndexed { index, dato ->
                            val x = margen + index * pasoX
                            val y = h - margen - ((dato.copas - copasMin) * escalaY)
                            Offset(x, y)
                        }

                        // Eje Y
                        drawLine(
                            Color.Black,
                            Offset(margen, 0f),
                            Offset(margen, h),
                            strokeWidth = 2f
                        )

                        // Eje X
                        val ceroY = h - margen - ((0 - copasMin) * escalaY)
                        drawLine(
                            Color.Black,
                            Offset(margen, ceroY),
                            Offset(w - margen, ceroY),
                            strokeWidth = 2f
                        )

                        // Conexión entre puntos
                        for (i in 0 until puntos.size - 1) {
                            drawLine(Color.Blue, puntos[i], puntos[i + 1], strokeWidth = 3f)
                        }

                        // Puntos individuales
                        puntos.forEachIndexed { i, offset ->
                            val color = when {
                                datos[i].copas > 0 -> Color.Green
                                datos[i].copas < 0 -> Color.Red
                                else -> Color.Gray
                            }
                            drawCircle(color, radius = 6f, center = offset)
                        }
                    }
                }

                // Etiquetas eje X (scrollable si hay muchas)
                Row(
                    modifier = Modifier
                        .horizontalScroll(rememberScrollState())
                        .fillMaxWidth()
                        .padding(top = 8.dp, start = 16.dp, end = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    datos.forEach {
                        Text(
                            text = it.dia,
                            fontSize = 12.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }
            } else {
                Text("Sin datos disponibles", modifier = Modifier.padding(16.dp))
                Log.d("CardGrafica", "Sin datos: $datos")
            }
        }
    }
}
