package Tests;

import ro.sit.homework.test.Calculator;
import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    public Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(20, calculator.compute(7, 13, "+"), "Addition does not work as expected");
    }

    @Test
    public void testSubtraction() {
        assertEquals(50, calculator.compute(70, 20, "-"), "Subtraction does not work as expected");
    }

    @Test
    public void testMultiplication() {
        assertEquals(15, calculator.compute(5, 3, "*"), "Multiplication does not work as expected");
    }

    @Test
    public void testDivision() {
        assertEquals(10, calculator.compute(70, 7, "/"), "Division does not work as expected");
    }

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.compute(70, 0, "/");
        });

        String expectedMessage = "Divide by ZERO";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testSQRT() {
        assertEquals(7, calculator.compute(49, 7, "SQRT"), "SQRT does not work as expected");
    }

    @Test
    public void testInvalidOperator() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.compute(1, 1, "test");
        });

        String expectedMessage = "UNSUPPORTED OPERATOR: test";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
