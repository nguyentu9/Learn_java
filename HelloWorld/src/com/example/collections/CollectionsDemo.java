package com.example.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add(0, "!");
//        System.out.println(list);

        Collections.addAll(list, "a", "b", "c");
        System.out.println(list);
        list.set(0, "a+");
        System.out.println(list);
        System.out.println(list.get(0));

        System.out.println(list.subList(0, 2));

    }
}
