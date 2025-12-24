package com.data

// TODO: Find a way to test for negative price values before creating an instance

data class Item(private val name: String, private var price: Double, private val category: Category,
                private val store: Store) {
    private var checked: Boolean = false
    fun getName(): String {
        return this.name
    }

    fun getPrice(): Double {
        return this.price
    }
    fun setPrice(newPrice: Double) {
        this.price = newPrice
    }

    fun getCategory(): Category {
        return this.category
    }

    fun getStore(): Store {
        return this.store
    }

    fun isChecked(): Boolean {
        return this.checked
    }
    fun check() {
        this.checked = !this.checked
    }
}