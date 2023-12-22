package org.example.decomposesample

import App
import RootComponent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.retainedComponent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val root = retainedComponent {
            RootComponent(it)
        }
        setContent {
            App(root)
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
//    App()
}