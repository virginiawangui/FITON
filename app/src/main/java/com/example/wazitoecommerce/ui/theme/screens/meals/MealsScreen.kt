package com.example.wazitoecommerce.ui.theme.screens.meals

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme
import com.example.wazitoecommerce.ui.theme.screens.home.HomeScreen

@Composable
fun MealsScreen(navController: NavHostController){

     Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Meals",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,

        )
        Spacer(modifier = Modifier.height(10.dp))


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            contentAlignment = Alignment.TopStart
        ) {
            Image(painter = painterResource(id = R.drawable.red2),
                contentDescription ="blue",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop)
            Text(text = "Meal Plan",
                color = Color.White,
                fontSize = 30.sp

                )
        }
        //End of box
        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
        ) {
            //Card1
            Card(
                modifier = Modifier
                    .width(230.dp)
                    .height(230.dp)
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.breakfast),
                            contentDescription = "Green",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Text(
                        text = "BREAKFAST",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        color = Color.Red,
                        fontSize = 20.sp

                    )

                    Spacer(modifier = Modifier.height(1.dp))
                    Text(
                        text = "Caramelized Cacoa Puffs",
                        modifier = Modifier.fillMaxWidth(),
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                }
            }
            //EndCard
            Spacer(modifier = Modifier.width(20.dp))
            //Card2
            Card(
                modifier = Modifier
                    .width(230.dp)
                    .height(230.dp)
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lunch),
                            contentDescription = "Green",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Text(
                        text = "LUNCH",
                        modifier = Modifier.fillMaxWidth(),
                        color = Color.Red,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Lentil Bolognese",
                        modifier = Modifier.fillMaxWidth(),
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                }
            }
            //EndCard
            Spacer(modifier = Modifier.width(20.dp))
            //Card3
            Card(
                modifier = Modifier
                    .width(230.dp)
                    .height(230.dp)
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.snack),
                            contentDescription = "Green",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Text(
                        text = "PM SNACK",
                        modifier = Modifier.fillMaxWidth(),
                        color = Color.Red,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Cashew and Sweet Potato Dip",
                        modifier = Modifier.fillMaxWidth(),
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                }
            }
            //EndCard
            Spacer(modifier = Modifier.width(20.dp))
            //Card4
            Card(
                modifier = Modifier
                    .width(230.dp)
                    .height(230.dp)
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.dinner),
                            contentDescription = "Green",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Text(
                        text = "DINNER",
                        modifier = Modifier.fillMaxWidth(),
                        color = Color.Red,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Lentil and Cauliflower curry",
                        modifier = Modifier.fillMaxWidth(),
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                }
            }
            //EndCard
        }
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "Explore",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(20.dp)
            )

         Spacer(modifier = Modifier.height(10.dp))
         Column {
             Row {
                 Card(modifier = Modifier
                     .padding(horizontal = 10.dp)
                     .size(width = 180.dp, height = 180.dp)) {
                     Column {
                         Box(
                             Modifier
                                 .fillMaxWidth()
                                 .padding(10.dp),

                         ) {
                             Image(
                                 painter = painterResource(id = R.drawable.two),
                                 contentDescription = "amazon",
                                 modifier = Modifier
                                     .size(120.dp)

                             )
                         }

                         Text(
                             text = "Trending", fontSize = 25.sp,
                             color = Color.Black,
                             modifier = Modifier.fillMaxWidth(),

                         )

                     }
                 }
                 //end of card1
                 Spacer(modifier = Modifier.width(30.dp))
                 Card(modifier = Modifier.size(width = 180.dp, height = 180.dp)) {
                     Column {
                         Box(
                             Modifier
                                 .fillMaxWidth()
                                 .padding(10.dp)

                         ) {
                             Image(
                                 painter = painterResource(id = R.drawable.one),
                                 contentDescription = "amazon",
                                 modifier = Modifier.size(120.dp)
                             )
                         }

                         Text(
                             text = "Easy", fontSize = 25.sp,
                             color = Color.Black,
                             modifier = Modifier.fillMaxWidth(),

                         )

                     }
                 }
                 //end of card1
             }//End of Row2
             Spacer(modifier = Modifier.height(20.dp))
             Row {
                 Card(modifier = Modifier
                     .padding(horizontal = 10.dp)
                     .size(width = 180.dp, height = 180.dp)) {
                     Column {
                         Box(
                             Modifier.fillMaxWidth()
                                 .padding(10.dp),

                             ) {
                             Image(
                                 painter = painterResource(id = R.drawable.two),
                                 contentDescription = "amazon",
                                 modifier = Modifier
                                     .size(120.dp)

                             )
                         }

                         Text(
                             text = "Trending", fontSize = 25.sp,
                             color = Color.Black,
                             modifier = Modifier.fillMaxWidth(),

                             )

                     }
                 }
                 //end of card1
                 Spacer(modifier = Modifier.width(30.dp))
                 Card(modifier = Modifier.size(width = 180.dp, height = 180.dp)) {
                     Column {
                         Box(
                             Modifier.fillMaxWidth()
                                 .padding(10.dp)

                         ) {
                             Image(
                                 painter = painterResource(id = R.drawable.one),
                                 contentDescription = "amazon",
                                 modifier = Modifier.size(120.dp)
                             )
                         }

                         Text(
                             text = "Easy", fontSize = 25.sp,
                             color = Color.Black,
                             modifier = Modifier.fillMaxWidth(),

                             )

                     }
                 }
                 //end of card1
             }//End of Row2



         }
         }
}
@Composable
@Preview(showBackground = true)
fun MealsScreen(){
        MealsScreen(navController = rememberNavController())
}
