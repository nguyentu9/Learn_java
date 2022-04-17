package com.example.concurrency;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;

public class ThreadDemo {
    public static void show() {
//        Thread thread = new Thread(new DownloadFileTask());
//        thread.start();
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        thread.interrupt();

        // ##############

//        List<Thread> threads = new ArrayList<>();
//
//        var status = new DownloadStatus();
//        for (int i = 0; i < 10; i++) {
//            Thread thread = new Thread(new DownloadFileTask(status));
//            thread.start();
//            threads.add(thread);
//        }
//
//        for(Thread thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//
//        System.out.println(status.getTotalBytes());

        // ###############
//        var status = new DownloadStatus();
//        var thread1 = new Thread(new DownloadFileTask(status));
//        var thread2 = new Thread(() -> {
//            while(!status.isDone()) {
//                synchronized (status) {
//                    try {
//                        status.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//            System.out.println(status.getTotalBytes());
//        });
//
//        thread1.start();
//        thread2.start();


        // ##############

//        List<Thread> threads = new ArrayList<>();
//
//        var status = new DownloadStatus();
//        for (int i = 0; i < 10; i++) {
//            Thread thread = new Thread(new DownloadFileTask(status));
//            thread.start();
//            threads.add(thread);
//        }
//
//        for(Thread thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//
//        System.out.println(status.getTotalBytes());

        // 210 Synchronized Collections
        // Collection<Integer> collection = new ArrayList<>(); // doesn't thread-safe
//        Collection<Integer> collection = Collections.synchronizedCollection(new ArrayList<>()); // thread-safe
//
//        var thread1 = new Thread(() -> {
//            collection.addAll(Arrays.asList(1, 2, 3));
//        });
//
//        var thread2 = new Thread(() -> {
//            collection.addAll(Arrays.asList(4, 5, 6));
//        });
//
//        thread1.start();
//        thread2.start();
//
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(collection);

        // 211 Concurrent Collections
//        Map<Integer, String> map = new ConcurrentHashMap<>();
//        map.put(1, "a");
//        map.get(1);
//        map.remove(1);

    }
}
