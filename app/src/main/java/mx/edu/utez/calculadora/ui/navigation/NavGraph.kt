package mx.edu.utez.calculadora.ui.navigation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import mx.edu.utez.calculadora.ui.screens.AreaTriangulo.AreaScreen
import mx.edu.utez.calculadora.ui.screens.AreaTriangulo.AreaViewModel
import mx.edu.utez.calculadora.ui.screens.Calculadora.CalculadoraScreen
import mx.edu.utez.calculadora.ui.screens.Calculadora.CalculadoraViewModel
import mx.edu.utez.calculadora.ui.screens.Dado.DadoScreen
import mx.edu.utez.calculadora.ui.screens.Dado.DadoViewModel
import mx.edu.utez.calculadora.ui.screens.Menu.MenuScreen

@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun NavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(
        navController = navController,
        startDestination = "menu",
        modifier = modifier
    ){
        composable("menu"){
            MenuScreen(
                onNavigateToCalculadora = { navController.navigate("calculadora") },
                onNavigateToDado = { navController.navigate("dado") },
                onNavigateToArea = { navController.navigate("area") }
            )
        }
        composable("calculadora"){
            CalculadoraScreen(CalculadoraViewModel())
        }
        composable("dado"){
            DadoScreen(DadoViewModel())
        }
        composable("area"){
            AreaScreen(AreaViewModel())
        }
    }
}