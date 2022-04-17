package com.example.executors;

public class ImplementAsyncAPI {
   public static void show() {
       // 220 Implementing an Asynchronous API

       // Lần 1
//        var service = new MailService();
//        service.send();
//        System.out.println("hello world");

// KQ:
//        Mail was sent.
//        hello world

       // Lần 2
       var service = new MailService();
       service.sendAsync();
       System.out.println("hello world");

       try {
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

// KQ:
//        hello world
//        Mail was sent.
   }
}
