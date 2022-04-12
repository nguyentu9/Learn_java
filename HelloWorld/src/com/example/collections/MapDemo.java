package com.example.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show() {
        // Java: Maps
        // C#: Dictionary
        // Python: Dictionary
        // JavaScript: Objects
            // var person = { name: "a" }

        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        var customer = map.get("e1");
        System.out.println(customer); // a

        var unknown = new Customer("Unknown", "");
        var customer2 = map.getOrDefault("e10", unknown);
        System.out.println(customer2); // Unknown


        var exist = map.containsKey("e10");
        System.out.println(exist); // false

        map.replace("e1", new Customer("a++", "e000"));
        System.out.println(map); // {e1=a++, e2=b}

        for(var key : map.keySet())
            System.out.println(key);

        for(var entry : map.entrySet())
            System.out.println(entry);

        for(var _customer : map.values())
            System.out.println(_customer);
    }
}
