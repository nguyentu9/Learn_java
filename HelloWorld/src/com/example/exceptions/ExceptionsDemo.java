package com.example.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

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
        try {
            var reader = new FileReader("file.txt");
            System.out.println("File opened");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            System.out.println("File does not exist.");
        }
    }
    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
