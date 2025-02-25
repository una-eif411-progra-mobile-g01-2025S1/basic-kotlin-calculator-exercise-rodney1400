package calculator

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CalculatorTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun `addition should return correct result`() {
        assertEquals(8.5, calculator.add(3.0, 5.5))
    }

    @Test
    fun `subtraction should return correct result`() {
        assertEquals(2.0, calculator.subtract(5.5, 3.5))
    }

    @Test
    fun `multiplication should return correct result`() {
        assertEquals(15.0, calculator.multiply(3.0, 5.0))
    }

    @Test
    fun `division should return correct result`() {
        assertEquals(2.0, calculator.divide(10.0, 5.0))
    }

    @Test
    fun testErrorCases() {
        val exception = assertThrows<IllegalArgumentException> {
            calculator.divide(5.0, 0.0)
        }
        assertEquals("Cannot divide by zero", exception.message)
    }
}