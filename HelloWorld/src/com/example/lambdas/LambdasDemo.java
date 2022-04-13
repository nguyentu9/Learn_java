package com.example.lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdasDemo {

    public String prefix = "-";


    public LambdasDemo(String message) {
    }

    public static void print(String message) {
    }

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

//        greet(System.out::println);
//        greet(message -> print(message));
//        greet(LambdasDemo::print);
//
//        greet(message -> new LambdasDemo(message));
//        greet(LambdasDemo::new);

        // Imperative Programming (for, if/else, switch/case)
//        List<Integer> list = List.of(1, 2, 3);

        // Declarative Programming
//        list.forEach(System.out::println);


//     List<String> list = List.of("a", "b", "c");
//     Consumer<String> print = item -> System.out.println(item);
//     Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
//
//     list.forEach(print.andThen(printUpperCase).andThen(print));

        Supplier<Double> getRandom = () -> Math.random();
        var random = getRandom.get();
        System.out.println(random);

        Function<String, Integer> map = str -> str.length();
        var length = map.apply("Sky");
        System.out.println(length);

        Function<Integer, Integer> mapDou = item -> item * 2;
        var value = mapDou.apply(4);
        System.out.println(value);
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
