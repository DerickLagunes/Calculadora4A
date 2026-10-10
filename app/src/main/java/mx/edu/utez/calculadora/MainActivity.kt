package mx.edu.utez.calculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import mx.edu.utez.calculadora.ui.navigation.NavGraph
import mx.edu.utez.calculadora.ui.screens.AreaTriangulo.AreaScreen
import mx.edu.utez.calculadora.ui.screens.AreaTriangulo.AreaViewModel
import mx.edu.utez.calculadora.ui.screens.Calculadora.CalculadoraScreen
import mx.edu.utez.calculadora.ui.screens.Calculadora.CalculadoraViewModel
import mx.edu.utez.calculadora.ui.screens.Dado.DadoScreen
import mx.edu.utez.calculadora.ui.screens.Dado.DadoViewModel
import mx.edu.utez.calculadora.ui.theme.CalculadoraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        val viewModel = CalculadoraViewModel()

        setContent {
            CalculadoraTheme {
                val navController = rememberNavController()
                NavGraph(navController)
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalculadoraTheme {
        Greeting("Android")
    }
}