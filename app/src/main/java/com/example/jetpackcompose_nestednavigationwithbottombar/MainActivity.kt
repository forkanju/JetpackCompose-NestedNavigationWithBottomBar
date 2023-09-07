package com.example.jetpackcompose_nestednavigationwithbottombar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose_nestednavigationwithbottombar.graphs.RootNavGraph
import com.example.jetpackcompose_nestednavigationwithbottombar.ui.theme.JetpackComposeNestedNavigationWithBottomBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeNestedNavigationWithBottomBarTheme {
                RootNavGraph(navController = rememberNavController())
            }
        }
    }
}

