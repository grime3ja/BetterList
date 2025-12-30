package com.data

import kotlin.math.min

/**
 * Grocery List class. This class implements Shareable, which inherits the File I/O Functionality.
 */
class GroceryList : Shareable {
    private val items: HashMap<String, Item> = hashMapOf()

    /**
     * Gets the Grocery List's private items Map.
     */
    fun getItems(): Map<String, Item> {
        return items
    }

    /**
     * Adds an item to Grocery List. Converts it to lowercase in the data-structure to ensure no
     * duplicates
     *
     * @param item The item to add.
     */
    fun addItem(item: Item) {
        items[item.getName().lowercase()] = item
    }

    /**
     * Removes an item from the Grocery List.
     *
     * @param name The name of the item to remove.
     */
    fun removeItem(name: String) {
        items.remove(name.lowercase())
    }

    /**
     * Checks if the Grocery List contains an item.
     *
     * @param name the name of the item to search for.
     * @return true if the item is in the Grocery List, false otherwise
     */
    fun containsItem(name: String): Boolean {
        return items[name.lowercase()] != null
    }

    /**
     * Checks off an item in the Grocery List. Calls the Item class' check() function
     *
     * @param name The name of the Item to check off.
     */
    fun checkOffItem(name: String) {
        items.map { (n, i) -> if (n == name.lowercase()) { i.check() } }
    }

    /**
     * Checks if an Item is checked off.
     *
     * @param name The name of the Item to see if it is checked.
     * @return true if the Item is checked off, false otherwise or if the Item is not in the Grocery List
     */
    fun isItemChecked(name: String): Boolean {
        return items[name.lowercase()]?.isChecked() ?: false
    }

    /**
     * Calculates the Levenshtein Edit Distance to perform spell checking. This will be used when an
     * Item is searched for that has not been initialized in the Item class.
     *
     * @param s1 The first String.
     * @param s2 The second String.
     * @return The Edit Distance.
     */
    companion object {
        fun editDistance(s1: String, s2: String): Int {
            val m: Int = s1.length
            val n: Int = s2.length

            var prev: Int
            val curr: MutableList<Int> = (0..n).map { it }.toMutableList()

            for (i in 1..m) {
                prev = curr[0]
                curr[0] = i
                for (j in 1..n) {
                    val temp: Int = curr[j]
                    if (s1[i - 1] == s2[j - 1])
                        curr[j] = prev
                    else
                        curr[j] = 1 + min(min(curr[j - 1], prev), curr[j])
                    prev = temp
                }
            }
            return curr[n]
        }
    }

    override fun export(filename: String) {
        require(filename.endsWith(".glist", true))

        // TODO Write to the file with the specified file format
    }

    override fun import(filename: String) {
        require(filename.endsWith(".glist", true))

        // TODO Read from the file and load the grocery list type
    }
}