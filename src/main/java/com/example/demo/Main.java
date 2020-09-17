package com.example.demo;

import com.example.demo.model.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(1, 2));
        System.out.println(c.multiply(2,2));
        System.out.println(c.subtract(10, 5));
        System.out.println(c.divide(8,4));
        System.out.println(c.modules(5,2));
    }
}
