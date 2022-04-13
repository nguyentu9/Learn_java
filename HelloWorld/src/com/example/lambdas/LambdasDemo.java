package com.example.lambdas;

public class LambdasDemo {

    public String prefix = "-";


    public LambdasDemo(String message) {
    }

    public static void print(String message) {}

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

//        Printer printer = message -> System.out.println( message);
//        greet(printer);

        greet(System.out::println);
        greet(message -> print(message));
        greet(LambdasDemo::print);

        greet(message -> new LambdasDemo(message));
        greet(LambdasDemo::new);

    }
    public static void greet(Printer printer){
        printer.print("Hello World");
    }
}
