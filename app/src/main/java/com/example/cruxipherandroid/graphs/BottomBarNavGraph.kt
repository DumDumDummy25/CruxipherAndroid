package com.example.cruxipherandroid.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.cruxipherandroid.BottomBarScreen
import com.example.cruxipherandroid.screens.AllCoursesScreen
import com.example.cruxipherandroid.screens.MyCoursesScreen
import com.example.cruxipherandroid.screens.ProfileScreen
import com.example.cruxipherandroid.viewmodels.MainViewModel
import com.example.cruxipherandroid.viewmodels.ProfileViewModel

@Composable
fun BottomBarNavGraph(
    mainNavController: NavHostController,
    bottomNavController: NavHostController,
    mainViewModel: MainViewModel,
    profileViewModel: ProfileViewModel
) {
    NavHost(
        navController = bottomNavController,
        startDestination = BottomBarScreen.MyCourses.route
    ) {
        composable(route = BottomBarScreen.MyCourses.route) {
            MyCoursesScreen(
                mainNavController = mainNavController,
                mainViewModel = mainViewModel
            )
        }
        composable(route = BottomBarScreen.AllCourses.route) {
            AllCoursesScreen(
                mainNavController = mainNavController,
                mainViewModel = mainViewModel
            )
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen(
                mainNavController = mainNavController,
                mainViewModel = mainViewModel,
                profileViewModel = profileViewModel
            )
        }
    }
}