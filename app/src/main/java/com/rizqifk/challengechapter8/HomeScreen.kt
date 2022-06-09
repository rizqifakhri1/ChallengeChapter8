package com.rizqifk.challengechapter8

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rizqifk.challengechapter8.ui.theme.Screen

@Composable
fun HomeScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(R.color.white)),
        contentAlignment = Alignment.BottomCenter
    ){
        Text(
            modifier = Modifier.clickable {
                navController.navigate(route = Screen.Detail.route)
            },

            text = "HomeScreen",
            color = Color.White,
            fontSize = 16.sp/*MaterialTheme.typography.h3.fontSize*/,
            /*fontWeight = FontWeight.Bold*/
        )
    }


    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())){
        //Section Header
        Row(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Image(painter = painterResource(id = R.drawable.ic_profil),
                contentDescription = "Image Profile",Modifier.size(54.dp))
            Spacer(modifier = Modifier.width(16.dp))

            //Section Nama
            Column(
                modifier = Modifier
                    .fillMaxWidth(1f)

            ) {
                Text(text = "Halo, Rizqi Fakhri!", fontWeight = FontWeight.Bold, fontSize = 24.sp)
                Text(text = "Mau Nonton Film Apa hari ini?")
            }
        }
        
        Image(painter = painterResource(id = R.drawable.posterbig_blank), 
            contentDescription = "Poster Utama", 
            Modifier.fillMaxWidth())
        /*Spacer(modifier = Modifier.height(16.dp))*/
        Text(text = "Sedang Populer", fontWeight = FontWeight.Bold, fontSize = 24.sp, modifier = Modifier.padding(16.dp))


        val painter = painterResource(id = R.drawable.poster_blank)
        val description = "Deskripsi Film"
        val title = "Judul Film"
        /*val scrollState = rememberScrollState()*/


        Box(modifier = Modifier
            .fillMaxSize(1f)
        ){
            Row(modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .fillMaxWidth(1f)) {
                Spacer(modifier = Modifier.width(16.dp))
                ImageCard(painter = painter, contentDescriptor = description, title = title)
                Spacer(modifier = Modifier.width(16.dp))
                ImageCard(painter = painter, contentDescriptor = description, title = title)
                Spacer(modifier = Modifier.width(16.dp))
                ImageCard(painter = painter, contentDescriptor = description, title = title)
                Spacer(modifier = Modifier.width(16.dp))
                ImageCard(painter = painter, contentDescriptor = description, title = title)
                Spacer(modifier = Modifier.width(16.dp))
                ImageCard(painter = painter, contentDescriptor = description, title = title)
                Spacer(modifier = Modifier.width(16.dp))
            }

        }

    }



}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescriptor: String,
    title: String,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier.width(150.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = 5.dp
    ) {
        Box(modifier = Modifier.height(200.dp)){
            Image( // Image
                painter = painter,
                contentDescription = contentDescriptor,
                contentScale = ContentScale.Crop //centercrop
            )
            Box(modifier = Modifier //Membuat Gradasi
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        startY = 300f //Tingkat gradasi mau dari mana
                    )
                )
            )
            Box( //Untuk Title
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ){
                Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen(navController = rememberNavController())
}