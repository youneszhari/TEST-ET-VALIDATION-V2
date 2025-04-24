import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        assertEquals(8.0, calculator.add(5, 3));
        assertEquals(0.0, calculator.add(-2, 2));
    }

    @Test
    public void testSoustraction() {
        assertEquals(2.0, calculator.subtract(5, 3));
        assertEquals(-4.0, calculator.subtract(-2, 2));
    }

    @Test
    public void testMultiplication() {
        assertEquals(15.0, calculator.multiply(5, 3));
        assertEquals(-4.0, calculator.multiply(-2, 2));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.divide(6, 3));
        assertEquals(-2.5, calculator.divide(-5, 2));
    }

    @Test
    public void testDivisionParZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });

        assertEquals("Division par zéro !", exception.getMessage());
    }
}
