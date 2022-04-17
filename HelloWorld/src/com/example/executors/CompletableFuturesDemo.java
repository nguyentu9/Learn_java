package com.example.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFuturesDemo {
    public static void show() {
//        Runnable task = () -> System.out.println("a");
//        var future = CompletableFuture.runAsync(task);

        Supplier<Integer> task = () -> 1;
        var future = CompletableFuture.supplyAsync(task);

        try {
            var result = future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
