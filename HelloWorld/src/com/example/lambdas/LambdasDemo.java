package com.example.lambdas;

public class LambdasDemo {
    public static void show() {
        // C1:
//        greet(new ConsolePrinter());

       // C2:
//        greet(new Printer() {
//            @Override
//            public void print(String message) {
//                System.out.println(message);
//            }
//        });

        // C3
//        greet(message -> System.out.println(message));

        Printer printer = message -> System.out.println(message);
        greet(printer);

    }
    public static void greet(Printer printer){
        printer.print("Hello World");
    }
}
