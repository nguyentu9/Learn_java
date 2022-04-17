package com.example.concurrency;

public class DownloadStatus {
    private int totalBytes;
    private int totalFiles;

    private Object totalBytesLock = new Object();
    private Object totalFilesLock = new Object();

    public void incrementTotalBytes() {
        synchronized (totalBytesLock) {
            totalBytes++;
        }
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
        return totalBytes;
    }

    public int getTotalFiles() {
        return totalFiles;
    }
}
