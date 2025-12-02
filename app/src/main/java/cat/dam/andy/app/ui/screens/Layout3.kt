package cat.dam.andy.app.ui.screens

import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import cat.dam.andy.app.ui.theme.AppTheme

@Composable
fun Layout3() {
    Column() {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue)
                .weight(1f),
        ) {
            Text("7", color = Color.White,fontSize = 60.sp, textAlign = TextAlign.Center, modifier = Modifier.weight(1f))
            Text("8", color = Color.White,fontSize = 60.sp, textAlign = TextAlign.Center, modifier = Modifier.weight(1f))
            Text("9", color = Color.White,fontSize = 60.sp, textAlign = TextAlign.Center, modifier = Modifier.weight(1f))
            Text("%", color = Color.White,fontSize = 60.sp, textAlign = TextAlign.Center, modifier = Modifier.weight(1f).background(Color.Red))
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue)
                .weight(1f),
            ) {
            Text("4", color = Color.White,fontSize = 60.sp, textAlign = TextAlign.Center, modifier = Modifier.weight(1f))
            Text("5", color = Color.White,fontSize = 60.sp, textAlign = TextAlign.Center, modifier = Modifier.weight(1f))
            Text("6", color = Color.White,fontSize = 60.sp, textAlign = TextAlign.Center, modifier = Modifier.weight(1f))
            Text("X", color = Color.White,fontSize = 60.sp, textAlign = TextAlign.Center, modifier = Modifier.weight(1f).background(Color.Red))
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue)
                .weight(1f),
            ) {
            Text("1", color = Color.White,fontSize = 60.sp, textAlign = TextAlign.Center, modifier = Modifier.weight(1f))
            Text("2", color = Color.White,fontSize = 60.sp, textAlign = TextAlign.Center, modifier = Modifier.weight(1f))
            Text("3", color = Color.White,fontSize = 60.sp, textAlign = TextAlign.Center, modifier = Modifier.weight(1f))
            Text("-", color = Color.White,fontSize = 60.sp, textAlign = TextAlign.Center, modifier = Modifier.weight(1f).background(Color.Red))
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue)
                .weight(1f),
            ) {
            Text(".", color = Color.White,fontSize = 60.sp, textAlign = TextAlign.Center, modifier = Modifier.weight(1f))
            Text("0", color = Color.White,fontSize = 60.sp, textAlign = TextAlign.Center, modifier = Modifier.weight(1f))
            Text("=", color = Color.White,fontSize = 60.sp, textAlign = TextAlign.Center, modifier = Modifier.weight(1f))
            Text("+", color = Color.White,fontSize = 60.sp, textAlign = TextAlign.Center, modifier = Modifier.weight(1f) .background(Color.Red))
        }
    }

}


@Composable
@Preview(showBackground = true)
fun PreviewLayout3() {
    AppTheme {
        Layout3()
    }
}
