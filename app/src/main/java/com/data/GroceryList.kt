package com.data

class GroceryList {
    private val items: HashMap<String, Item> = hashMapOf()

    fun getItems(): Map<String, Item> {
        return items
    }

    fun addItem(item: Item) {
        items[item.getName()] = item
    }

    fun removeItem(name: String) {
        items.remove(name)
    }

    fun containsItem(name: String): Boolean {
        return items[name] != null
    }

    fun checkOffItem(name: String) {
        items.map { (n, i) -> if (n == name) { i.check() } }
    }
    fun isItemChecked(name: String): Boolean {
        return items[name]?.isChecked() ?: false
    }
}