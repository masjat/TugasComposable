package com.example.tugas3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas3.ui.theme.Tugas3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tugas3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(pesan = "Happy Graduation Jenia!!",
                        ucapan = "Selamat dan sukses atas kelulusan Anda! " +
                                "Semoga masa depan penuh dengan kesempatan dan prestasi " +
                                "yang gemilang." +
                                "Selamat menjalani babak baru! \uD83C\uDF1F\uD83C\uDF89",
                        pengirim = "From Jatmika" )
                }
            }
        }
    }
}

@Composable
fun GreetingText(pesan: String, ucapan : String , pengirim : String,modifier: Modifier = Modifier) {
    val customFontFamily = FontFamily(
        Font(R.font.natural_handwritten)
    )
    val customFontFamily2 = FontFamily(
        Font(R.font.racing_games)
    )
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.DarkGray))
    Column (
        verticalArrangement = Arrangement.Top
            ) {
        Text(
            text = pesan,
            style = TextStyle(
                color = Color.White,
                fontFamily = customFontFamily2,
                fontSize = 60.sp,
                lineHeight = 50.sp,
                textAlign = TextAlign.Center
            )
        )
            }
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(6.dp)){
        Text(
            text = ucapan,
            style = TextStyle(
                color = Color.White,
                fontFamily = customFontFamily,
                fontSize = 45.sp,
                lineHeight = 45.sp,
                textAlign = TextAlign.Center
            )
        )
    }
    Column(
        verticalArrangement = Arrangement.Bottom,) {
        Text(
            text = pengirim,
            color = Color.White,
            fontFamily =customFontFamily2,
            fontSize = 26.sp,
            modifier = Modifier
                .padding(5.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tugas3Theme {
        GreetingText(pesan = "Happy Graduation Jenia!!",
            ucapan = "Selamat dan sukses atas kelulusan Anda! " +
                    "Semoga masa depan penuh dengan kesempatan dan prestasi " +
                    "yang gemilang." +
                    "Selamat menjalani babak baru! \uD83C\uDF1F\uD83C\uDF89",
            pengirim = "From Jatmika" )
    }
}