package com.example.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class CompletableFuturesDemo {

    public static CompletableFuture<String> getUserEmailAsync() {
        return CompletableFuture.supplyAsync(() -> "email");
    }

    public static CompletableFuture<String> getPlaylistAsync(String email) {
        return CompletableFuture.supplyAsync(() -> "playlist");
    }

    public static int toFahrenheit(int celsius) {
        return (int) (celsius * 1.8) + 32;
    }

    public static void show() {
        // 1
//        Runnable task = () -> System.out.println("a");
//        var future = CompletableFuture.runAsync(task);

        // 2
//        Supplier<Integer> task = () -> 1;
//        var future = CompletableFuture.supplyAsync(task);
//
//        try {
//            var result = future.get();
//            System.out.println(result);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }


        // 3
//        var future = CompletableFuture.supplyAsync(() -> 1);
//        future.thenRunAsync(() -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("Done");
//        });
        // KQ
//        ForkJoinPool.commonPool-worker-3
//        Done


        // 3.1
//        var future = CompletableFuture.supplyAsync(() -> 1);
//        future.thenRun(() -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("Done");
//        });
        // KQ
        // main
        // Done

        // 3.2
//        var future = CompletableFuture.supplyAsync(() -> 1);
//        future.thenAccept(result -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(result);
//        });
        // KQ
        // main
        // 1

        // 3.3
//        var future = CompletableFuture.supplyAsync(() -> 1);
//        future.thenAcceptAsync(result -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(result);
//        });
        // KQ
//        ForkJoinPool.commonPool-worker-3
//        1

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // 222 Handling Exceptions
//        var future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("Getting the current weather");
//            throw new IllegalStateException();
//        });
//
//        try {
//            var temperature = future.exceptionally(ex -> 1).get();
//            System.out.println(temperature);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }


        // 223 Transforming a Completable Future
//        var future = CompletableFuture.supplyAsync(() -> 20);
//        future
//            .thenApply(CompletableFuturesDemo::toFahrenheit)
//            .thenAccept(System.out::println);


        // 224 Composing Completable Futures
//        var future = CompletableFuture.supplyAsync(() -> "email");
//        future.thenCompose(email -> CompletableFuture.supplyAsync(() -> "playlist"))
//                .thenAccept(playlist -> System.out.println(playlist));

//        getUserEmailAsync()
//                .thenCompose(CompletableFuturesDemo::getPlaylistAsync)
//                .thenAccept(playlist -> System.out.println(playlist));

        // 225 Combining Completable Futures
//        var first = CompletableFuture.supplyAsync(() -> "20USD")
//                .thenApply(str -> {
//                    var price = str.replace("USD", "");
//                    return Integer.parseInt(price);
//                });
//        var second = CompletableFuture.supplyAsync(() -> 0.9);
//
//        first.thenCombine(second, (price, exchangeRate) -> price * exchangeRate)
//                .thenAccept(System.out::println);
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // 226 Waiting for Many Tasks to Complete
//        var first = CompletableFuture.supplyAsync(() -> 1);
//        var second = CompletableFuture.supplyAsync(() -> 2);
//        var third = CompletableFuture.supplyAsync(() -> 3);
//
//        var all =CompletableFuture.allOf(first, second, third);
//        all.thenRun(() -> {
//            try {
//                var firstResult = first.get();
//                System.out.println(firstResult);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
//            System.out.println("All tasks completed successfully");
//        });

        // 227 Waiting for the First Task
//        var first = CompletableFuture.supplyAsync(() -> {
//           LongTask.simulate();
//           return 20;
//        });
//
//        var second = CompletableFuture.supplyAsync(() -> 15);
//
//        CompletableFuture
//                .anyOf(first, second)
//                .thenAccept(temp -> System.out.println(temp)); // 15

        // 228 Handling timeouts
        var future = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 20;
        });

        try {
            // alternate: orTimeout
            var result = future.completeOnTimeout(1, 1, TimeUnit.SECONDS).get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }


}
