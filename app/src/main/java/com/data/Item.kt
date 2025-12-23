package com.data

class Item {
    private val itemList: ArrayList<ItemData> = arrayListOf()

    data class ItemData(
        private val name: String,
        private val price: Float,
        private val category: Category,
        private val store: Store,
    )

    fun new(name: String, price: Float, category: Category, store: Store) {
        itemList.add(ItemData(name, price, category, store))
    }

    fun getItems(): ArrayList<ItemData> {
        return itemList
    }
}