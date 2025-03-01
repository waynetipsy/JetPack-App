package app.ify.jetpackapp

import android.graphics.fonts.FontFamily
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.ify.jetpackapp.ui.theme.JetpackAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String,
             modifier: Modifier = Modifier) {
    Column {
        Text(text = "Hello Waynetipsy is here",
          color = Color.Red,
            fontSize = 48.sp,
            modifier = Modifier.padding(start = 50.dp),
            fontStyle = FontStyle.Italic,
            //fontFamily = FontFamily.Serif
            textDecoration = TextDecoration.combine(
               listOf(

               )
            )
            )
        
        Text(text = "Download it from Playstore")
    }

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackAppTheme {
        Greeting("Android and Ios")
    }
}