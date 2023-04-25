package com.jarrodcoffee.example.data.events

import com.jarrodcoffee.example.data.MenuItem

interface MenuItemClickListener {
    fun onItemClicked(menuItem: MenuItem)
}