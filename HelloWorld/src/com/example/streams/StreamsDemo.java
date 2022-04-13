package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
            new Movie("a", 10),
            new Movie("b", 15),
            new Movie("c", 20)
        );

        // Imperative Programming
        int count = 0;
        for (var movie : movies) {
            if(movie.getLikes() > 10)
                count++;
        }

        // Declarative (Functional) Programming
        var count2 = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();

        int[] numbers = { 1, 2, 3};
        Arrays.stream(numbers)
                .forEach(n -> System.out.println(n));

        System.out.println("---");

        movies.stream()
                .mapToInt(Movie::getLikes)
                .forEach(System.out::println);

        System.out.println("---");

        var stream = Stream.of(List.of(1,2,3), List.of(4,5,6));
        stream
                .flatMap(list -> list.stream())
                .forEach(System.out::println);


        System.out.println("---");

        Predicate<Movie> isPopular =  m -> m.getLikes() > 10;

        movies.stream()
                .filter(isPopular)
                .forEach(m -> System.out.println(m.getTitle()));
    }
}
