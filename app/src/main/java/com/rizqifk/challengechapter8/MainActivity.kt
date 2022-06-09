package com.rizqifk.challengechapter8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.rizqifk.challengechapter8.ui.theme.ChallengeChapter8Theme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChallengeChapter8Theme(darkTheme = false) {
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}


/*
@Preview(showBackground = true, device = "id:pixel", showSystemUi = true) //Menambahkan tampilan mobile
@Composable
fun DefaultPreview() {
    ChallengeChapter8Theme {

    }
}*/
