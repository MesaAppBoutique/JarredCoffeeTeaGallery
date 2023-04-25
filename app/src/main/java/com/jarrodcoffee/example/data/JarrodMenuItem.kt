package com.jarrodcoffee.example.data

data class JarrodMenuItem(
    val category: String,
    val id: Int,
    val imageURL: String,
    val menuItems: List<MenuItem>
)