package com.example.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void show() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b"));
        customers.add(new Customer("a"));
        customers.add(new Customer("c"));
        Collections.sort(customers);

        System.out.println(customers);
    }
}
