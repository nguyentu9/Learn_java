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
        try(
            var  reader = new FileReader("file.txt");
            var writer = new FileWriter("...");
        ) {
            var value = reader.read();
        }
        catch(IOException e){
            System.out.println("Cound not read data.");
        }
    }
    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
