package com.example.netv.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.netv.HOME_GRAPH_ROUTE
import com.example.netv.ROOT_GRAPH_ROUTE


@Composable
fun  Nav_graph (
    NavContoller : NavHostController
){
    NavHost(navController = NavContoller, startDestination = HOME_GRAPH_ROUTE
    , route = ROOT_GRAPH_ROUTE){

        authNavGraph(NavContoller)

        homeNavGraph(NavContoller)

    }


}