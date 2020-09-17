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
        assertEquals(4, c.multiply(2, 2));
    }
}