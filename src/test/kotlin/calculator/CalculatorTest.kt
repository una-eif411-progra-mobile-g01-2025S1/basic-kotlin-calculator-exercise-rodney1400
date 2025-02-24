package calculator

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CalculatorTest {

    private val calculator = Calculator()

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
}