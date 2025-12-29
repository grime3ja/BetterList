package com

import com.data.Category
import com.data.GroceryList
import com.data.Item
import com.data.Store

import org.junit.Test

import org.junit.Assert.*

class GroceryListTest {
    @Test
    fun addRemoveGetTest() {
        val list = GroceryList()
        list.addItem(Item("Chicken", 8.95, Category("Poultry"), Store("Costco")))

        assertEquals(1, list.getItems().size)
        assertTrue(list.containsItem("Chicken"))

        list.addItem(Item("Rice", 32.25, Category("Grain"), Store("Walmart")))
        list.addItem(Item("Ball", 4.60, Category("Sports"), Store("Dicks")))

        assertEquals(3, list.getItems().size)
        assertTrue(list.containsItem("Rice"))
        assertFalse(list.containsItem("ball"))

        list.removeItem("Rice")
        assertEquals(2, list.getItems().size)
        assertFalse(list.containsItem("Rice"))
    }

    @Test
    fun checkOffItemTest() {
        val list = GroceryList()
        list.addItem(Item("Chicken", 8.95, Category("Poultry"), Store("Costco")))
        list.addItem(Item("Rice", 32.25, Category("Grain"), Store("Walmart")))
        list.addItem(Item("Ball", 4.60, Category("Sports"), Store("Dicks")))

        assertFalse(list.isItemChecked("Rice"))
        list.checkOffItem("Rice")
        assertTrue(list.isItemChecked("Rice"))
        assertFalse(list.isItemChecked("Chicken"))
    }
}