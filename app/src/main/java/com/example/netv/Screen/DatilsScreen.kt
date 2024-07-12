package com.example.netv.Screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.netv.Screens


@Composable

fun  DatilsScreen(NavHostController : NavHostController) {

    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ) {

        Text(text = "Datils"
        , color = Color.Black
        , fontSize = 50.sp
            , modifier = Modifier.clickable {

                NavHostController.navigate(Screens.Home.route){
                    popUpTo(Screens.Home.route){
                        inclusive = true
                    }
                }
            }
        )

    }
}