package mx.edu.utez.calculadora.ui.screens.Dado

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import mx.edu.utez.calculadora.R
import mx.edu.utez.calculadora.ui.theme.CalculadoraTheme

@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
@Composable
fun DadoScreen(viewModel: DadoViewModel, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        Image(
            painter = painterResource(R.drawable.d),
            contentDescription = "imagen de un dado"
        )
        Text(viewModel.resultado)
        Button({ viewModel.tirar_dado() }){Text("Tirar")}
    }
}

@SuppressLint("ViewModelConstructorInComposable")
@Preview(showBackground = true)
@Composable
fun DadoScreenPreview(){
    val viewModel: DadoViewModel = DadoViewModel()
    CalculadoraTheme{
        DadoScreen(viewModel)
    }
}