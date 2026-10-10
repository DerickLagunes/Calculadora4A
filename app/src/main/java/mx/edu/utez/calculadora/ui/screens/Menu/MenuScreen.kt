package mx.edu.utez.calculadora.ui.screens.Menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import mx.edu.utez.calculadora.R

@Composable
fun MenuScreen(
    onNavigateToCalculadora: () -> Unit,
    onNavigateToDado: () -> Unit,
    onNavigateToArea: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.d), // Reemplazar con tu imagen (ej. R.drawable.logo_herramientas)
            contentDescription = "Logo de Herramientas",
            contentScale = ContentScale.Crop, // Escala y recorta para llenar la forma
            modifier = Modifier
                .size(120.dp)                 // Tamaño de la imagen
                .clip(CircleShape)            // Recorte en forma de círculo
                .rotate(90.0F)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Mis Herramientas",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(bottom = 32.dp)
        )
        Button(
            onClick = onNavigateToCalculadora,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Text("Ir a calculadora")
        }
        Button(
            onClick = onNavigateToDado,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Text("Ir al dado")
        }
        Button(
            onClick = onNavigateToArea,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Text("Área del triangulo")
        }
    }
}