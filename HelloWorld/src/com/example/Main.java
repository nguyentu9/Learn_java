package com.example;

import com.example.generics.User;
import com.example.generics.Utils;

public class Main {

    public static void main(String[] args) {
        var max = Utils.max(1, 3);
        System.out.println(max);

        var max2 = Utils.max(new User(10), new User(20));
        System.out.println(max2);
    }
}
