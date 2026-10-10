package mx.edu.utez.calculadora.ui.screens.AreaTriangulo

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class AreaViewModel: ViewModel() {
    //Variables
    var basee by mutableStateOf("")
    var altura by mutableStateOf("")
    var resultado by mutableStateOf("Aqui saldra el resultado")
    //Funciones
    fun onBaseChanged(nuevaBase: String){basee = nuevaBase}
    fun onAlturaChanged(nuevaAltura: String){altura = nuevaAltura}
    fun calcularArea(){resultado = ((basee.toDouble() * altura.toDouble()) / 2).toString()}
}