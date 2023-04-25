package com.jarrodcoffee.example.data.events

import com.jarrodcoffee.example.data.JarrodMenuItem

interface CategoryClickListener {
    fun onItemClicked(jarrodMenuItem: JarrodMenuItem)
}