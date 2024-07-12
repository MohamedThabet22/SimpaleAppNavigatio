package com.example.netv.nav_graph

import android.util.Log
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.netv.AUTH_GRAPH_ROUTE
import com.example.netv.Screen.LoginScreen
import com.example.netv.Screen.SignUpScreen
import com.example.netv.Screens


fun NavGraphBuilder.authNavGraph(
    NavContoller : NavHostController
) {
    navigation(
        startDestination = Screens.Login.route,
        route = AUTH_GRAPH_ROUTE
    ) {
        composable(Screens.Login.route) {
            LoginScreen(navController = NavContoller)
        }
        composable(Screens.SignUp.route) {
            SignUpScreen(navController = NavContoller)
        }
    }
}