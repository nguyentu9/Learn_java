package com.example.exceptions;

/*
    Runtime Exceptions
    - NullPointerException
    - ArithmeticException
    - IllegalArgumentException
    - IndexOutOfBoundsException
    - IllegalStateException
*/
public class ExceptionsDemo {
    public static void show() {
        sayHello(null);
    }
    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
