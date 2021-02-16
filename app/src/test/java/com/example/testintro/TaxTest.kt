package com.example.testintro

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TaxTest {

    private lateinit var tax: Tax

    @Before
    fun setup() {
        tax = Tax()
    }

    @After
    fun tearDown() {

    }

    @Test
    fun calculateTaxTest() {    // `bu şekil bile fonksiyon ismi yazılabilir`
        val netTax = tax.calculateTax(100.0, 0.1)
        assertThat(netTax).isEqualTo(10.0)
    }

    @Test
    fun calculateIncomeTest() {
        val netIncome = tax.calculateIncome(100.0, 0.1)
        assertThat(netIncome).isEqualTo(90.0)
    }

}