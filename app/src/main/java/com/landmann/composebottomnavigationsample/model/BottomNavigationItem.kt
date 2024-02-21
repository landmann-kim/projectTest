package com.landmann.composebottomnavigationsample.model

sealed class BottomNavItem(val title: String, val route: String) {
    object List : BottomNavItem("목록", "list")
    object Write : BottomNavItem("글쓰기", "write")
}

enum class BottomNavItemType {
    LIST, WRITE
}