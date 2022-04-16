package com.example.concurrency;

public class ThreadDemo {
    public static void show() {
        System.out.println(Thread.activeCount()); // 2
        System.out.println(Runtime.getRuntime().availableProcessors()); // 4
    }
}
