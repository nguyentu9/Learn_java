package com.example;

import com.example.collections.CollectionsDemo;
import com.example.collections.MapDemo;
import com.example.collections.SetDemo;
import com.example.concurrency.ThreadDemo;
import com.example.executors.CompletableFuturesDemo;
import com.example.executors.ExecutorsDemo;
import com.example.executors.MailService;
import com.example.generics.GenericList;
import com.example.generics.Instructor;
import com.example.generics.User;
import com.example.generics.Utils;
import com.example.lambdas.LambdasDemo;
import com.example.streams.CreatingStreamsDemo;
import com.example.streams.StreamsDemo;

import java.util.concurrent.CompletableFuture;


public class Main {

    public static void main(String[] args) {
//        CollectionsDemo.show();
//        SetDemo.show();
//        MapDemo.show();
//        LambdasDemo.show();
//        StreamsDemo.show();
//        CreatingStreamsDemo.show();
//        ThreadDemo.show();
//        ExecutorsDemo.show();
//        CompletableFuturesDemo.show();




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
