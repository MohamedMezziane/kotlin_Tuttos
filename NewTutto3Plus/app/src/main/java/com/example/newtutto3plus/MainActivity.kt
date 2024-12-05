package com.example.newtutto3plus

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat.startActivity
import com.example.newtutto3plus.ui.theme.NewTutto3PlusTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewTutto3PlusTheme {
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
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

/*@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NewTutto3PlusTheme {
        Greeting("Mezziane")
    }
}
*/



@Preview(showBackground = true)
@Composable
fun InteractiveButtonsApp() {
    MaterialTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,

            ) {
                OpenWebsiteButton()
                SendEmailButton()
                DialPhoneNumberButton()
            }
        }
    }
}
@Composable
fun OpenWebsiteButton() {
    Button(onClick = {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
    }) {
        Text("Search With Google")
    }
}

@Composable
fun SendEmailButton() {
    Button(onClick = {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:mohamedmezziane19@gmail.com")
            putExtra(Intent.EXTRA_SUBJECT, "Email Subject")
        }
    }) {
        Text("Contact me via email")
    }
}

@Composable
fun DialPhoneNumberButton() {
    Button(onClick = {
        val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:+212642014890"))
    }) {
        Text("Contact Me Via Phone")
    }
}