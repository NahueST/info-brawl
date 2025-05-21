package nahu.curso.infobrawl.ui.commons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun Card(titulo: String, puntos: String, width: Dp = 240.dp, height: Dp = 100.dp ) {
    ElevatedCard(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface,
        ),
        modifier = Modifier
            .size(width = width, height = height)
    ) {
        Text(
            text = titulo,
            modifier = Modifier
                .padding(16.dp),
        )
        Spacer(
            modifier = Modifier
                .padding(5.dp),
        )
        Text(
            text = puntos
        )
    }
}

@Preview(showBackground = true, name = "Vista previa de la card")
@Composable
fun CardPreview(){
    MaterialTheme{
        Card(
            titulo = "Copas",
            puntos = "40000",
            width = 240.dp,
            height = 100.dp
        )
    }
}