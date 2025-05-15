package nahu.curso.infobrawl.ui.screens.main

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import nahu.curso.infobrawl.ui.commons.Card


@Composable
fun MainScreen(modifier: Modifier = Modifier) {

    Row {
        //BarraDeNavegacionSuperior{  }
        Card()
    }



}

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun BarraDeNavegacionSuperior(
//    navigateBack: () -> Unit,
//) {
//    Scaffold(
//        topBar = {
//            CenterAlignedTopAppBar(
//                title = {
//                    Text(
//                        "Info Brawl",
//                    )
//                },
//            )
//        },
//    ) { innerPadding ->
//        Text(
//            "Click the back button to pop from the back stack.",
//            modifier = Modifier.padding(innerPadding),
//        )
//    }
//}

//@Composable
//fun CardCopas(with: Dp = 240.dp, height: Dp = 100.dp ) {
//    OutlinedCard(
//        colors = CardDefaults.cardColors(
//            containerColor = MaterialTheme.colorScheme.surface,
//        ),
//        border = BorderStroke(1.dp, Color.Black),
//        modifier = Modifier
//            .size(width = with, height = height)
//    ) {
//        Text(
//            text = "Copas",
//            modifier = Modifier
//                .padding(16.dp),
//        )
//    }
//}