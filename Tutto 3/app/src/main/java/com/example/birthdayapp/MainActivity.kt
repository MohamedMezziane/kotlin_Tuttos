
package com.example.BirthdayApp


import android.content.ClipDescription
import android.graphics.Paint.Align
import android.media.audiofx.AudioEffect.Descriptor
import androidx.compose.ui.graphics.Color // ajouter la bibliothéque de couleur
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
// import com.example.BirthdayApp.ui.theme.BirthdayAppTheme
import com.example.birthdayapp.R
import com.example.birthdayapp.ui.theme.BirthdayAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Greeting("abdel")
                }
            }
        }
    }
}


@Composable
fun GreetingText(message: String,from: String,modifier: Modifier = Modifier) {
    Text(
        text = message,
        fontSize = 100.sp,
        lineHeight = 150.sp,
        textAlign = TextAlign.Center
    )
}






@Composable
fun GreetingImage(ville : String, title : String, phone : String, description : String, modifier: Modifier = Modifier) {

    val image = painterResource(R.drawable.quimado);
    Box(
        modifier = Modifier
            .fillMaxSize()
            .alpha(0.5f)
    ) {
        Image(
            painter = painterResource(id = R.drawable.img), // Replace with your image name
            contentDescription = "morocco Image",
            contentScale = ContentScale.Crop, // Scales the image to fill the box
            modifier = Modifier.fillMaxSize()
        )
    }

    // Column one by one
    Column(

        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Text(
            text = title,
            style = TextStyle(fontWeight = FontWeight.Bold),
            fontSize = 70.sp,
            textAlign = TextAlign.Center,
            color = Color.White
        )

        Text(
            text = ville,
            style = TextStyle(fontWeight = FontWeight.Bold),
            fontSize = 60.sp,
            textAlign = TextAlign.Center,
            color = Color.White
        )

        Box(modifier = Modifier.fillMaxWidth())
        {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(Alignment.Center)
                    .aspectRatio(10 / 7f),
            )
        }

        Text(
            text = phone,
            style = TextStyle(fontWeight = FontWeight.Bold),
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.padding(top = 20.dp, start = 10.dp, end = 20.dp),
            color = Color.Blue
        )

        Text(
            text = description,
            style = TextStyle(fontWeight = FontWeight.Bold),
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 20.dp, start = 10.dp, end = 20.dp)
        )
    }


}


@Preview(showBackground = true,
    showSystemUi = true,
)
@Composable
fun GreetingPreview() {
    BirthdayAppTheme {
        GreetingImage(
            "Al Hoceima",
            "Welcome to",
            "Contact Us\n +212 642014890",
            "Al Hoceima is characterized by its wonderful beaches and picturesque mountains, where the beauty of nature meets a rich culture. \n Discover its charming atmosphere and delicious seafood!"

        )
    }
}

