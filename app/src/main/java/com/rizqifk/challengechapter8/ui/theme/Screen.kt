package com.rizqifk.challengechapter8.ui.theme

sealed class Screen(val route: String){
    object Home: Screen(route = "home_screen")
    object Detail: Screen(route = "detail_Screen")
}