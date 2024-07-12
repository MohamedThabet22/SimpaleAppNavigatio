package com.example.netv.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation

import com.example.netv.HOME_GRAPH_ROUTE

import com.example.netv.Screen.DatilsScreen
import com.example.netv.Screen.HomeScreen
import com.example.netv.Screens




fun NavGraphBuilder.homeNavGraph(
    NavContoller : NavHostController
){
    
    navigation( startDestination = Screens.Home.route,
        route =  HOME_GRAPH_ROUTE){



        composable(Screens.Home.route){
            HomeScreen(NavContoller)

        }
        composable(
            Screens.Detail.route)
        {

            DatilsScreen(NavContoller)

        }
    }
}
