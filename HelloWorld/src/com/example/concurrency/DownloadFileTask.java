package com.example.concurrency;

public class DownloadFileTask implements Runnable{

    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        for(var i = 0; i < 1_000_000; i++){
            if(Thread.currentThread().isInterrupted()) break;
            status.incrementTotalBytes();
        }

        status.done();
        synchronized (status) {
            status.notifyAll();
        }

        System.out.println("Downloading complete: " + Thread.currentThread().getName());
    }
}
