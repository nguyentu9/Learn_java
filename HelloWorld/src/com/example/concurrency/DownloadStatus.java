package com.example.concurrency;

import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
    private LongAdder totalBytes = new LongAdder();
    private int totalFiles;


    private boolean isDone;

    private Object totalBytesLock = new Object();
    private Object totalFilesLock = new Object();

    public void incrementTotalBytes() {
        totalBytes.increment();
    }

    public int getTotalBytes() {
        return totalBytes.intValue(); // sum()
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
