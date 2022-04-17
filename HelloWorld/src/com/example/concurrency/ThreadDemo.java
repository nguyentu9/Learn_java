package com.example.concurrency;

import java.util.ArrayList;
import java.util.List;

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

        List<Thread> threads = new ArrayList<>();

        var status = new DownloadStatus();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread);
        }

        for(Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println(status.getTotalBytes());
    }
}
