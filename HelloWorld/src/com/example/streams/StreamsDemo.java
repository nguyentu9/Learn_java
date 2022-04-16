package com.example.streams;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10, Genre.THRILLER),
                new Movie("a", 10, Genre.THRILLER),
                new Movie("b", 15, Genre.ACTION),
                new Movie("c", 20, Genre.ACTION)
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

        System.out.println("---");
        System.out.println("REDUCE");
        Optional<Integer> sum = movies.stream().map(m -> m.getLikes()).reduce((a, b) -> a + b);
        System.out.println("SUM1: " + sum.orElse(0));

        Optional<Integer> sum1 = movies.stream().map(m -> m.getLikes()).reduce(Integer::sum);
        System.out.println("SUM1_re: " +  sum1.orElse(0));

        Integer sum2 = movies.stream().map(m -> m.getLikes()).reduce(0, (a, b) -> a + b);
        System.out.println("SUM2: " + sum2);

        Integer sum3 = movies.stream().map(m -> m.getLikes()).reduce(0, Integer::sum);
        System.out.println("SUM2_re: " + sum3);

        System.out.println("---");
        System.out.println("COLLECTORS");

        List<Movie> resultList = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.toList());
        System.out.println("LIST");
        System.out.println(resultList);

        Set<Movie> resultSet = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.toSet());
        System.out.println("SET");
        System.out.println(resultSet);

        var resultMap = movies.stream()
                .filter(m -> m.getLikes() > 10)
//                .collect(Collectors.toMap(m -> m.getTitle(), Function.identity()));
                .collect(Collectors.toMap(Movie::getTitle, Function.identity()));
        System.out.println("MAP");
        System.out.println(resultMap);

        System.out.println("SUMMING INT");
        Double resultSummingInt = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.summingDouble(Movie::getLikes));
        System.out.println(resultSummingInt);


        System.out.println("SUMMARIZING INT");
        IntSummaryStatistics resultSummarizingInt = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.summarizingInt(Movie::getLikes));
        System.out.println(resultSummarizingInt);

        System.out.println("JOINING");
        String resultJoining = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .map(Movie::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println(resultJoining);

        System.out.println("GROUPING");
        Map<Genre, List<Movie>> resultGrouping = movies.stream().collect(Collectors.groupingBy(Movie::getGenre));
        System.out.println(resultGrouping);

        Map<Genre, Set<Movie>> resultGrouping2 = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.toSet()));
        System.out.println(resultGrouping2);

        Map<Genre, Long> resultGrouping3 = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));
        System.out.println(resultGrouping3);

        var resultGrouping4 = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre,
                        Collectors.mapping(Movie::getTitle, Collectors.joining(", "))));
        System.out.println(resultGrouping4);

        System.out.println("---");
        System.out.println("PARTITIONNING");

        var resultPartitionning = movies.stream()
                .collect(Collectors.partitioningBy(m -> m.getLikes() > 20));
        System.out.println(resultPartitionning);


        Map<Boolean, String> resultPartitionning1 = movies.stream()
                .collect(Collectors.partitioningBy(m -> m.getLikes() > 20, Collectors.mapping(Movie::getTitle, Collectors.joining(", "))));
        System.out.println(resultPartitionning1);


        System.out.println("---");
        System.out.println("PRIMITIVE TYPE STREAMS");

        IntStream.range(1, 5).forEach(System.out::println); // 1 -> 4
        System.out.println("---");
        IntStream.rangeClosed(1, 5).forEach(System.out::println); // 1 -> 5
    }
}
