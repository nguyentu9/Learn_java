package com.example.streams;

import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show() {
        var stream = Stream.generate(() -> Math.random());
        stream.limit(3)
                .forEach(System.out::println);

        System.out.println("---");

        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(System.out::println);

    }
}
