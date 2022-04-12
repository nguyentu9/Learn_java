package com.example.collections;

import java.util.*;

public class CollectionsDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        // b -> a -> c

        var front = queue.poll();
        System.out.println(front);
        System.out.println(queue);

    }
}
