/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculator;





import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(-1, Calculator.subtract(2, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, Calculator.multiply(2, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(2, Calculator.divide(6, 3));
    }

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Calculator.division(6, 0);
        });
        assertEquals("Division by zero", exception.getMessage());
    }
}
