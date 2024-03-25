package com.developing.myfirstkotlinapplication  // This is the name what we gave our applications package at the beggining when we created the application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.developing.myfirstkotlinapplication.ui.theme.MyFirstKotlinApplicationTheme // Este es el contenido de ui.theme de la carpeta kotlin+java de la izquierda

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { // This means, that whenever my main activity is created, on the creation of this activity, execute whatever is inside of these curly brackets
        super.onCreate(savedInstanceState) // This is the default behavior of oncreate for a given activity is: to run that first
        setContent { // then, the next
            MyFirstKotlinApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) { // fillMaxSize(): Means this surface should fill the entire screen // colorScheme: Means that the colour will be modified depending on the dark mode and light mode
                    Greeting("Dani") // This will be the @composable in the line 29
                }
            }
        }
    }
}

@Composable // is an element you can see on the screen. It can contain another @composable that are then visible or is the thing you can see itself. They represent the UI and can either contain other composables or be the visible element itself.
fun Greeting(name: String, modifier: Modifier = Modifier) { // the name: is the same name we introduce in the line 22 // Modifier is what we entered in the line 21
    Text( // It is an @composable Text
            text = "Welcome $name!", // @name: is the variable name that will save the name introduced as parameter
            modifier = modifier
    )
}

@Preview(showBackground = true) // This preview allows to see a visual representation of parts of the application without running it
@Composable
fun GreetingPreview() {
    MyFirstKotlinApplicationTheme {
        Greeting("Android")
    }
}