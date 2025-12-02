package cat.dam.andy.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cat.dam.andy.app.ui.screens.*
import cat.dam.andy.app.ui.theme.AppTheme
import cat.dam.andy.app.ui.theme.Blue
@Composable
fun Layout2() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        val boxSize = 120.dp


        Box(
            modifier = Modifier
                .size(boxSize)
                .background(Color.Red)
                .align(Alignment.TopStart),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Top Left", color = Color.Black)
        }

        Box(
            modifier = Modifier
                .size(boxSize)
                .background(Color.Green)
                .align(Alignment.TopEnd),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Top Right", color = Color.Black)
        }

        Box(
            modifier = Modifier
                .size(boxSize)
                .background(Color.Blue)
                .align(Alignment.BottomStart),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Bottom Left", color = Color.Black)
        }

        Box(
            modifier = Modifier
                .size(boxSize)
                .background(Color.Yellow)
                .align(Alignment.BottomEnd),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Bottom Right", color = Color.Black)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewLayout2() {
    AppTheme {
        Layout2()
    }
}
