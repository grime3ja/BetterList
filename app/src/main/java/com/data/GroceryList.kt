package com.data

class GroceryList {
    private val items: ArrayList<Item> = arrayListOf()

    fun addItem(item: Item) {
        items.add(item)
    }

    fun removeItem(item: Item) {
        items.remove(item)
    }

    fun checkOffItem(item: Item) {
        items.map { if (it == item) { it.check() } }
    }
}