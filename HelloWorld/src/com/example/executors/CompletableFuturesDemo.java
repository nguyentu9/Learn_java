package com.example.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFuturesDemo {
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
        var future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting the current weather");
            throw new IllegalStateException();
        });

        try {
            var temperature = future.exceptionally(ex -> 1).get();
            System.out.println(temperature);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
