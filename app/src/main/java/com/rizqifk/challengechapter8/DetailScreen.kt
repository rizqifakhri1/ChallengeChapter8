package com.rizqifk.challengechapter8

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rizqifk.challengechapter8.ui.theme.Screen

@Composable
fun DetailScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        /*Text(
            modifier = Modifier.clickable {
                navController.navigate(route = Screen.Home.route){
                    popUpTo(Screen.Home.route){
                        inclusive =true
                    }
                }
            },
            text = "Detail",
            color = Color.Red,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold
        )*/
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
    ) {
        Image(painter = painterResource(id = R.drawable.posterbig_blank),
            contentDescription = "Poster Utama",
            Modifier
                .fillMaxWidth()
                .clickable {
                    navController.navigate(route = Screen.Home.route) {
                        popUpTo(Screen.Home.route) {
                            inclusive = true
                        }
                    }
                })
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Judul Film",
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            textAlign = TextAlign.Center)

        Text(modifier = Modifier.fillMaxWidth(),
            text = "Rating Film 10/10",
            fontSize = 16.sp,
            textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(16.dp))
        Text(
            modifier = Modifier.padding(16.dp),
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla posuere magna a magna lacinia, dapibus tincidunt lorem pulvinar. Proin tristique at mi id gravida. Quisque nec ultrices enim. Praesent dignissim lorem sit amet lobortis congue. Aenean velit lorem, sagittis vel molestie non, blandit ac augue. In luctus neque nibh, eu vestibulum ex pretium et.",
            textAlign = TextAlign.Justify
        )
    }

    
}

@Composable
@Preview(showBackground = true)
fun DetailPreview(){
    DetailScreen(navController = rememberNavController())
}