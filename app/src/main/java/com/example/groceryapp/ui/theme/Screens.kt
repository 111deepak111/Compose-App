package com.example.groceryapp.ui.theme

sealed class Screens(val route:String){
    object MainScreen : Screens("main_screen");
    object LoginScreen : Screens("login_screen");

}
