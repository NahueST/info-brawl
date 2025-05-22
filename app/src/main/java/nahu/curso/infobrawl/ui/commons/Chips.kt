package nahu.curso.infobrawl.ui.commons

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.size
import androidx.compose.ui.unit.dp


@Composable
fun FilterChip(botones: List<String>) {
    var seleccionados by remember { mutableStateOf(setOf<String>()) }

    Row {
        var modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
        var horizontalArrangement = Arrangement.spacedBy(8.dp)

        botones.forEach { boton ->
            val selected = boton in seleccionados
            FilterChip(
                selected = selected,
                onClick = {
                    seleccionados = if (selected) {
                        seleccionados - boton
                    } else {
                        seleccionados + boton
                    }
                    Log.d("APP", seleccionados.toString())
                },
                label = {
                    Text(text = boton)

                },
                leadingIcon = if (selected) {
                    {
                        Icon(
                            imageVector = Icons.Filled.Done,
                            contentDescription = "Done icon",
                            modifier = Modifier.size(FilterChipDefaults.IconSize)
                        )
                    }
                } else {
                    null
                },
            )
        }
    }
}