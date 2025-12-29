package com.data

data class Item(private val name: String, private var price: Double, private val category: Category,
                private val store: Store) {
    private var checked: Boolean = false

    init {
        require(this.price >= 0)
    }

    fun getName(): String {
        return this.name
    }

    fun getPrice(): Double {
        return this.price
    }
    fun setPrice(newPrice: Double) {
        require(newPrice >= 0)
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