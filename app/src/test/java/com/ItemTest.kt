package com

import com.data.Category
import com.data.Item
import com.data.Store

import org.junit.Test

import org.junit.Assert.*

class ItemTest {
    @Test
    fun testGetters() {
        val item = Item("Chicken", 8.95, Category("Poultry"),
            Store("Costco"))
        assertEquals("Chicken", item.getName())
        assertEquals(8.95, item.getPrice(), 0.0)
    }

    @Test
    fun testSetters() {
        val item = Item("Chicken", 8.95, Category("Poultry"),
            Store("Costco"))
        item.setPrice(7.65)
        assertEquals(7.65, item.getPrice(), 0.0)
    }

    @Test
    fun testCheck() {
        val item = Item("Chicken", 8.95, Category("Poultry"),
            Store("Costco"))
        assertEquals(false, item.isChecked())
        item.check()
        assertEquals(true, item.isChecked())
        item.check()
        assertEquals(false, item.isChecked())
    }
}