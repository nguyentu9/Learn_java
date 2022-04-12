package com.example.collections;

import java.util.*;

public class SetDemo {
    public static void show(){
//        Collection<String> collection = new ArrayList<>();
//        Collections.addAll(collection, "a", "b", "c");
//        Set<String> set = new HashSet<>(collection);
//        System.out.println(set);

        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

        // Union
        set1.addAll(set2);
        System.out.println(set1); // [a, b, c, d]

        // Intersection
        Set<String> set3 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set4 = new HashSet<>(Arrays.asList("b", "c", "d"));
        set3.retainAll(set4);
        System.out.println(set3); // [b, c]


        // Difference
        Set<String> set5 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set6 = new HashSet<>(Arrays.asList("b", "c", "d"));
        set5.removeAll(set6);
        System.out.println(set5); // [a]
    }
}
