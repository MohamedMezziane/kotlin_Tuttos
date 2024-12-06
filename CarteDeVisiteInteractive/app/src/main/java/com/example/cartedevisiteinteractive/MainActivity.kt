package com.example.cartedevisiteinteractive

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cartedevisiteinteractive.ui.theme.CarteDeVisiteInteractiveTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarteDeVisiteInteractiveTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

                    CarteDeVisite()
                }
            }
        }
    }
}

@Composable
fun ContactInfo(label: String, value: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .clickable(onClick = onClick)
            .padding(vertical = 4.dp)
    ) {
        Text(text = "$label ", fontWeight = FontWeight.Bold)
        Text(text = value, color = Color.Blue)
        Spacer(modifier = Modifier.height(16.dp))
    }
}



@Composable
fun CarteDeVisite() {
    val context = LocalContext.current
    val callIntent = Intent(Intent.ACTION_DIAL).apply {
        data = Uri.parse("tel:+212642014890")
    }
    val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
        data = Uri.parse("mailto:mohamedmezziane19@gmail.com")
    }
    val websiteIntent = Intent(Intent.ACTION_VIEW).apply {
        data = Uri.parse("https://www.google.com")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Nom et profession
        Text(
            text = "Mohamed Mezziane",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = "Développeur Android",
            style = MaterialTheme.typography.titleMedium,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(16.dp))

        ContactInfo(
            label = "Téléphone :",
            value = "+212 642014890",
            onClick = { context.startActivity(callIntent) }
        )
        ContactInfo(
            label = "Email :",
            value = "mohamedmezziane19@gmail.com",
            onClick = { context.startActivity(emailIntent) }
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Bouton pour site web
        Button(onClick = { context.startActivity(websiteIntent) }) {
            Text("Visit My Website")
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CarteDeVisiteInteractiveTheme {
        CarteDeVisite()
    }
}




