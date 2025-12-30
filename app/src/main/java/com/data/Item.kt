package com.data

/**
 * Data class for an Item. This class implements Shareable, which inherits the File I/O functionality.
 *
 * @param name the name of Grocery Item.
 * @param price the price of the Grocery Item.
 * @param category the Category type of the Grocery Item.
 * @param store the Store type of the Grocery Item.
 */
data class Item(private val name: String, private var price: Double, private val category: Category,
                private val store: Store) : Shareable {
    private var checked: Boolean = false

    init {
        require(this.price >= 0)
    }

    /**
     * Gets the Item's private name.
     *
     * @return The Item's name.
     */
    fun getName(): String {
        return this.name
    }

    /**
     * Gets the Item's private price.
     *
     * @return The Item's price.
     */
    fun getPrice(): Double {
        return this.price
    }

    /**
     * Sets the Item's private price.
     *
     * @param newPrice The Item's new price.
     */
    fun setPrice(newPrice: Double) {
        require(newPrice >= 0)
        this.price = newPrice
    }

    /**
     * Gets the Item's private Category.
     *
     * @return The Item's Category.
     */
    fun getCategory(): Category {
        return this.category
    }

    /**
     * Gets the Item's private Store.
     *
     * @return The Item's store.
     */
    fun getStore(): Store {
        return this.store
    }

    /**
     * Returns the status of the Item's checked attribute.
     *
     * @return true if Item is checked, false otherwise.
     */
    fun isChecked(): Boolean {
        return this.checked
    }

    /**
     * Flips the Item's checked attribute.
     */
    fun check() {
        this.checked = !this.checked
    }

    override fun export(filename: String) {
        require(filename.endsWith(".item", true))

        // TODO Write to the file with the specified file format
    }

    override fun import(filename: String) {
        require(filename.endsWith(".item", true))

        // TODO Read from the file and load the item type
    }
}