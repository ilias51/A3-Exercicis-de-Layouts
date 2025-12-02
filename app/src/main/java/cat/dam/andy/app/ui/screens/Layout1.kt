package com.example.navigation
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cat.dam.andy.app.ui.theme.*

@Composable
fun Layout1() {
    // Fondo general blanco
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // Un modificador base para cada celda del teclado
        val cellModifier = Modifier
            .weight(1f)                // ocupa misma proporción dentro de la fila
            .fillMaxHeight()           // la fila decide la altura
            .padding(4.dp)             // espacio entre celdas
            .background(Color.Magenta) // fuchsia
            .wrapContentSize(Alignment.Center)

        val textStyle = TextStyle(
            color = Color.White,
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )

        // Cada Row representa una fila del teclado
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(3f / 4f) // 3 columnas, 4 filas → más alto que ancho
        ) {
            // Fila 1: 1 2 3
            Row(modifier = Modifier.weight(1f)) {
                Box(modifier = cellModifier) { Text("1", style = textStyle) }
                Box(modifier = cellModifier) { Text("2", style = textStyle) }
                Box(modifier = cellModifier) { Text("3", style = textStyle) }
            }

            // Fila 2: 4 5 6
            Row(modifier = Modifier.weight(1f)) {
                Box(modifier = cellModifier) { Text("4", style = textStyle) }
                Box(modifier = cellModifier) { Text("5", style = textStyle) }
                Box(modifier = cellModifier) { Text("6", style = textStyle) }
            }

            // Fila 3: 7 8 9
            Row(modifier = Modifier.weight(1f)) {
                Box(modifier = cellModifier) { Text("7", style = textStyle) }
                Box(modifier = cellModifier) { Text("8", style = textStyle) }
                Box(modifier = cellModifier) { Text("9", style = textStyle) }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Exercise5ScreenPreview() {
    MaterialTheme {
        Layout1()
    }
}