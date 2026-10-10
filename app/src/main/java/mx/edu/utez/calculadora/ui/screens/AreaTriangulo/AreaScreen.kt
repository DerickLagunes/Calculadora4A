package mx.edu.utez.calculadora.ui.screens.AreaTriangulo

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import mx.edu.utez.calculadora.ui.theme.CalculadoraTheme

@Composable
fun AreaScreen(
    viewModel: AreaViewModel
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.background(Color.Gray)
            .fillMaxSize()
    ) {
        Text("Calculadora de área del triángulo", style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(20.dp))
        Row(){
            OutlinedTextField(
                viewModel.basee,
                { viewModel.onBaseChanged(it) },
                modifier = Modifier.weight(0.5f),
                label = {Text("Ingresa la base")})
            Spacer(modifier = Modifier.width(20.dp))
            OutlinedTextField(
                viewModel.altura,
                { viewModel.onAlturaChanged(it) },
                modifier = Modifier.weight(0.5f),
                label = {Text("Ingresa la altura")})
        }
        Button(
            { viewModel.calcularArea() },
            modifier = Modifier.padding(vertical = 20.dp)
        ) {
            Text("Calcular Área")
        }
        Text(
            viewModel.resultado,
            style = MaterialTheme.typography.titleLarge,
            color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AreaScreenPreview(){
    CalculadoraTheme{
        AreaScreen(AreaViewModel())
    }
}