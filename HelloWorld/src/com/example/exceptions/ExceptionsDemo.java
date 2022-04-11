package com.example.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
        var account = new Account();
        try {
            account.deposit(-1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
