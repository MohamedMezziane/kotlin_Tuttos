package com.example.doctor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.doctor.ui.theme.DoctorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "Logo de l'application",
                    modifier = Modifier.size(100.dp)
                )
                Text(text = "Bienvenue dans l'application Compose!")
            }
        }
    }
}



//@Preview
@Composable
fun exercice1(){
    Text(text = "Bonjour, Solicode !", style = MaterialTheme.typography.headlineMedium)
}

//@Preview
@Composable
fun exercice2(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Logo de l'application",
            modifier = Modifier.size(100.dp)
        )
        Text(text = "Bienvenue dans l'application Compose!")
    }


}

//@Preview
@Composable
fun Exercice3(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Cliquez sur le bouton ci-dessous !")

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { println("Bouton cliqué") }) {
            Text(text = "Cliquez-moi")
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
//@Preview
@Composable
fun Exercice4() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Application Compose") })
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
            Text(text = "Créez facilement votre interface avec Compose!", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(35.dp))
            Button(onClick = { /* TODO */ }) {
                Text(text = "Démarrer")
            }
        }
    }
}

/*@Preview
@Composable
fun Exercice5(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.jsfullstack),
            contentDescription = "Photo de profil",
            modifier = Modifier.size(300.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Madani Ali", style = MaterialTheme.typography.headlineMedium)
        Text(text = "Développeur Android", style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { println("Carte de visite partagée !") }) {
            Text(text = "Partager")
        }
    }
}
*/

/*@Preview
@Composable
fun Exercice5() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFB3E5FC), // Light blue
                        Color(0xFF81D4FA), // Slightly darker blue
                        Color(0xFF0288D1)  // Dark blue
                    )
                ),
                shape = RoundedCornerShape(16.dp)
            )
            .clip(RoundedCornerShape(16.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.jsfullstack),
                contentDescription = "Photo de profil",
                modifier = Modifier.size(300.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Mohamed Mezziane",
                style = MaterialTheme.typography.headlineMedium
            )
            Text(
                text = "Développeur Android",
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { println("Carte de visite partagée !") }) {
                Text(text = "Partager")
            }
        }
    }
}
*/

@Preview(showBackground = true)
@Composable
fun Exercice5() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFB3E5FC), // Bleu clair
                        Color(0xFF81D4FA), // Bleu un peu plus foncé
                        Color(0xFF0288D1)  // Bleu foncé
                    )
                ),
                shape = RoundedCornerShape(16.dp)
            )
            .clip(RoundedCornerShape(16.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Image
            Image(
                painter = painterResource(id = R.drawable.mezziane),
                contentDescription = "Photo de profil",
                modifier = Modifier
                    .size(220.dp)
                    .clip(CircleShape)
                    .border(2.dp, MaterialTheme.colorScheme.primary, CircleShape)
            )
            Spacer(modifier = Modifier.height(16.dp))

            // Nom et profession
            Text(
                text = "Mohamed Mezziane",
                style = MaterialTheme.typography.headlineMedium.copy(
                    color = MaterialTheme.colorScheme.onSurface,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(
                text = "Développeur Android",
                style = MaterialTheme.typography.bodyLarge.copy(
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7F)
                )
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Informations de contact
            Text(
                text = "📧 Email : mezziane.official@gmail.com",
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = MaterialTheme.colorScheme.onSurface
                )
            )
            Text(
                text = "📞 Téléphone : +212 6 42 01 48 90",
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = MaterialTheme.colorScheme.onSurface
                )
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Bouton "Partager"
            Button(
                onClick = { println("Whatsapp Link !") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                modifier = Modifier
                    .padding(horizontal = 50.dp)
                    .height(48.dp)
            ) {
                Text(text = "Whatsapp", style = MaterialTheme.typography.labelLarge)
            }
        }
    }
}
