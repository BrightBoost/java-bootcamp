package com.pluralsight.week5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    SimpleCalculator simpleCalculator;
    @BeforeEach
    void init() {
        simpleCalculator = new SimpleCalculator();
    }
    @Test
    void addTwoNumbers_positiveNrs() {
       // SimpleCalculator simpleCalculator = new SimpleCalculator();
        double result = simpleCalculator.addTwoNumbers(2, 4);
        assertEquals(6, result);
    }

    @Test
    void addTwoNumbers_negativeNrs() {
        // arrange
       // SimpleCalculator simpleCalculator = new SimpleCalculator();
        // act
        double result = simpleCalculator.addTwoNumbers(-2, -4);
        // assert
        assertEquals(-6, result);

    }

    @Test
    void divideTwoNumbers_positiveNumbers() {
        // arrange
       // SimpleCalculator simpleCalculator = new SimpleCalculator();
        // act
        double result = simpleCalculator.divideTwoNumbers(8, 4);
        // assert
        assertEquals(2, result);
    }

    @Test
    void divideTwoNumbers_onePositiveOneNegativeNumber() {
        // arrange
      //  SimpleCalculator simpleCalculator = new SimpleCalculator();
        // act
        double result = simpleCalculator.divideTwoNumbers(8, -4);
        // assert
        assertEquals(-2, result);
    }

    @Test
    void divideTwoNumbers_negativeNumber() {
        // arrange
       // SimpleCalculator simpleCalculator = new SimpleCalculator();
        // act
        double result = simpleCalculator.divideTwoNumbers(-8, -4);
        // assert
        assertEquals(2, result);
    }

    @Test
    void divideTwoNumbers_divideByZero() {
        // arrange
       // SimpleCalculator simpleCalculator = new SimpleCalculator();
        // act
        double result = simpleCalculator.divideTwoNumbers(8, 0);
        // assert
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    void addTwoNumbers_resultDeltaFraction() {
        // arrange
        // SimpleCalculator simpleCalculator = new SimpleCalculator();
        // act
        double result = simpleCalculator.addTwoNumbers(0.1, 0.2);
        // assert
        assertEquals(0.3, result, 0.0001);
    }
}