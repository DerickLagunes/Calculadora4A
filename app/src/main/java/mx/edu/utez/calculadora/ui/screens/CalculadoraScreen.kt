package mx.edu.utez.calculadora.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import mx.edu.utez.calculadora.ui.theme.CalculadoraTheme

@Composable
fun CalculadoraScreen (
    viewModel: CalculadoraViewModel = viewModel(),
    modifier: Modifier = Modifier
){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxHeight()
    ){
        OutlinedTextField(
            viewModel.texto,
            { viewModel.onChanged(it) },
            modifier= Modifier.fillMaxWidth())
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ){
            Button({ viewModel.clickOn5() }){Text("5")}
            Button({ viewModel.clickOn7() }){Text("7")}
            Button({ viewModel.sumar() }){Text("+")}
        }
        Button({viewModel.resultado()}){Text("=")}
    }
}

@Preview(showBackground = true)
@Composable
fun CalculadoraScreenPreview(){
    CalculadoraTheme() {
        CalculadoraScreen()
    }
}