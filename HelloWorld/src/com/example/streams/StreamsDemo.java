package com.example.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        // Imperative Programming
        int count = 0;
        for (var movie : movies) {
            if (movie.getLikes() > 10)
                count++;
        }

        // Declarative (Functional) Programming
        var count2 = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();

        /*
            INTERMEDIATE
        - map() / flatMap()
        - filter()
        - limit() / skip()
        - sorted()
        - distinct()
        - peek()

            REDUCERS
        - count()
        - anyMatch(predicate)
        - allMatch(predicate)
        - noneMatch(predicate)
        - findFirst()
        - findAny()
        - max(comparator)
        - min(comparator)

         */

        int[] numbers = {1, 2, 3};
        Arrays.stream(numbers)
                .forEach(n -> System.out.println(n));

        System.out.println("---");

        movies.stream()
                .mapToInt(Movie::getLikes)
                .forEach(System.out::println);

        System.out.println("---");

        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        stream
                .flatMap(list -> list.stream())
                .forEach(System.out::println);


        System.out.println("---");
        System.out.println("FILTER");

        Predicate<Movie> isPopular = m -> m.getLikes() > 10;

        movies.stream()
                .filter(isPopular)
                .forEach(m -> System.out.println(m.getTitle()));

        System.out.println("---");
        System.out.println("LIMIT");
        movies.stream()
                .limit(2)
                .forEach(m -> System.out.println(m.getTitle()));


        System.out.println("---");
        System.out.println("SKIP");
        movies.stream()
                .skip(2)
                .forEach(m -> System.out.println(m.getTitle()));


        System.out.println("---");
        System.out.println("TAKE WHILE");
        movies.stream()
                .takeWhile(m -> m.getLikes() < 30)
                .forEach(m -> System.out.println(m.getTitle()));

        System.out.println("---");
        System.out.println("DROP WHILE");
        movies.stream()
                .dropWhile(m -> m.getLikes() < 20)
                .forEach(m -> System.out.println(m.getTitle()));

        System.out.println("---");
        System.out.println("SORTING");
        movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle))
                .forEach(m -> System.out.println(m.getTitle()));

        movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle).reversed())
                .forEach(m -> System.out.println(m.getTitle()));

        System.out.println("---");
        System.out.println("GET UNIQUE ELEMENTS");
        movies.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(System.out::println);

        System.out.println("---");
        System.out.println("PEEK ELEMENT");
        movies.stream()
                .filter(m -> m.getLikes() > 10)
                .peek(m -> System.out.println("filtered " + m.getTitle()))
                .map(Movie::getTitle)
                .peek(t -> System.out.println("mapped: " + t))
                .forEach(System.out::println);

        System.out.println("---");
        System.out.println("anyMatch");
        var resultAnyMatch = movies.stream()
                .anyMatch(m -> m.getLikes() > 20);
        System.out.println(resultAnyMatch); // false

        System.out.println("---");
        System.out.println("allMatch");
        var resultAllMatch = movies.stream()
                .allMatch(m -> m.getLikes() > 20);
        System.out.println(resultAllMatch); // false

        System.out.println("---");
        System.out.println("noneMatch");
        var resultNoneMatch = movies.stream()
                .noneMatch(m -> m.getLikes() > 20);
        System.out.println(resultNoneMatch); // true

        System.out.println("---");
        System.out.println("findFirst");
        var resultFindFirst = movies.stream()
                .findFirst().get();
        System.out.println(resultFindFirst.getTitle());


        System.out.println("---");
        System.out.println("findAny");
        var resultFindAny = movies.stream()
                .findAny().get();
        System.out.println(resultFindAny.getTitle());

        System.out.println("---");
        System.out.println("max");
        var resultMax = movies.stream()
                .max(Comparator.comparing(Movie::getLikes))
                .get();
        System.out.println(resultMax.getTitle());


        System.out.println("---");
        System.out.println("min");
        var resultMin = movies.stream()
                .min(Comparator.comparing(Movie::getLikes))
                .get();
        System.out.println(resultMin.getTitle());
    }
}
