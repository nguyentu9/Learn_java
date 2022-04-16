package com.example.concurrency;

public class DownloadFileTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        for(var i = 0; i < Integer.MAX_VALUE; i++){
            if(Thread.currentThread().isInterrupted()) break;
            System.out.println("Downloading byte " + i);
        }

        System.out.println("Downloading complete: " + Thread.currentThread().getName());
    }
}
