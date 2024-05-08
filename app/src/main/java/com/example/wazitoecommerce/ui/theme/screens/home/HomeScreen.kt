package com.example.wazitoecommerce.ui.theme.screens.home

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ADD_PRODUCTS_URL
import com.example.wazitoecommerce.navigation.LOGIN_URL
import com.example.wazitoecommerce.navigation.SIGNUP_URL
import com.example.wazitoecommerce.navigation.VIEW_PRODUCTS_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@Composable
fun HomeScreen(navController:NavHostController){
    Column(

        modifier = Modifier.fillMaxSize()
            .paint(
                painterResource(id = R.drawable.grey),
                contentScale = ContentScale.FillBounds
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val mcontext = LocalContext.current


        Spacer(modifier = Modifier.height(30.dp))
        //Centering an image
        Box (modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Image(painter = painterResource(id = R.drawable.fit),
                contentDescription = "fiton",
                modifier = Modifier
                    .size(150.dp),
                contentScale = ContentScale.Crop

            )

        }

        Text(text = "FITON",
            fontWeight = FontWeight.Bold,
            fontSize = 50.sp,
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Personalized Training",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            fontFamily = FontFamily.Serif,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            navController.navigate(LOGIN_URL)
        },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Black
            ),
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxWidth(),
        ) {
            Text(text = "Login")
        }

        Spacer(modifier = Modifier.height(30.dp))


        Button(onClick = {
            navController.navigate(SIGNUP_URL)
        },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Gray
            ),
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxWidth(),
            ) {
            Text(text = "Sign Up")
        }
        Spacer(modifier = Modifier.height(30.dp))



    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    WazitoECommerceTheme {
        HomeScreen(navController = rememberNavController())
    }
}