package com.example.netv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.netv.nav_graph.Nav_graph
import com.example.netv.ui.theme.NetvTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NetvTheme {

                val navController = rememberNavController()
                Nav_graph(NavContoller = navController)
            }
        }
    }
}

