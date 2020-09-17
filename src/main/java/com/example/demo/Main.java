package com.example.demo;

import com.example.demo.model.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(1, 2));
        System.out.println(c.multiply(2,2));
    }
}
