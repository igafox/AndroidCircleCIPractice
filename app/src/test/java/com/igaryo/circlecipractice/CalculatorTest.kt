package com.igaryo.circlecipractice

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    private lateinit var calculator: Calculator

    @Before
    fun setup() {
        calculator = Calculator()
    }

    @Test
    fun sum() {
        assertEquals(15, calculator.sum(10, 5))
    }


    @Test
    fun subtract() {
        assertEquals(5, calculator.subtract(10, 5))
    }

}