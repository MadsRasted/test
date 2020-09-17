package com.example.demo.model;

public class Calculator {

    public int add(int x, int y){
        return x + y;
        //Prøv lav en fejl med vilje for at se om testen fejler
        //return x - y;
    }

    public int subtract(int x, int y){
        return x - y;
    }

    public int multiply(int x, int y){
        return x * y;
    }

    public int divide(int x, int y){
        return x / y;
    }

    public int modules(int x, int y){
        return x % y;
    }


}
