package com.example.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
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
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("File does not exist.");
        }
        catch(IOException | ParseException e){
            System.out.println("Cound not read data.");
        }
    }
    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
