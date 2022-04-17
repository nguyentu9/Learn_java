package com.example.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
    private AtomicInteger totalBytes = new AtomicInteger();
    private int totalFiles;


    private boolean isDone;

    private Object totalBytesLock = new Object();
    private Object totalFilesLock = new Object();

    public void incrementTotalBytes() {
        totalBytes.incrementAndGet();
    }

    /*
    public void incrementTotalFiles() {
        synchronized (this) {
            totalFiles++;
        }
    }
     */

    public synchronized void incrementTotalFiles() {
        totalFiles++;
    }

    public int getTotalBytes() {
        return totalBytes.get();
    }

    public int getTotalFiles() {
        return totalFiles;
    }


    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}
