package nahu.curso.infobrawl.ui.commons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Header(textoIzquierdo: String, textoDerecho: String ){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = textoIzquierdo,
            style = MaterialTheme.typography.titleMedium
        )
        Text(
            text = textoDerecho,
            style = MaterialTheme.typography.titleMedium
        )
    }
}



