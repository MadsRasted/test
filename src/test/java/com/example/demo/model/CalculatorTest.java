package com.example.demo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator c;

    @BeforeEach
    void setUp() {
        c = new Calculator();
    }

    @Test
    void add() {
        assertEquals(3, c.add(1,2));
    }

    @Test
    void multiply() {
        assertEquals(6, c.multiply(2, 3));
    }

    @Test
    void subtract() {
        assertEquals(5, c.subtract(10, 5));
    }

    @Test
    void divide() {
        assertEquals(2, c.divide(8,4));
    }

    @Test
    void modules() {
        assertEquals(1, c.modules(5,2));
    }
}