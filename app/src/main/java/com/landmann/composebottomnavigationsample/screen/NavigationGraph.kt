package com.landmann.composebottomnavigationsample.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "list") {
        composable("list") {
            ListScreen()
        }
        composable("write") {
            WriteScreen()
        }
    }
}