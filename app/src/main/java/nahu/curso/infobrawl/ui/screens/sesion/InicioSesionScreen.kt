package nahu.curso.infobrawl.ui.screens.sesion

import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import org.w3c.dom.Text

@Composable
fun InicioSesionScreen(){
    TextField(
        state = rememberTextFieldState(),
        lineLimits = TextFieldLineLimits,
        label = { ("Correo electronico")}
    )
}

fun TextField(state: TextFieldState, lineLimits: TextFieldLineLimits.Companion, label: () -> Unit) {

}
