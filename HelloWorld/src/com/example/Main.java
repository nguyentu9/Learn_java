package com.example;

import com.example.generics.List;
import com.example.generics.User;

public class Main {

    public static void main(String[] args) {
        var list = new List();
        list.add(1);
        list.add(Integer.valueOf(1));
        list.add("1");
        list.add(new User());

        int number = (int)list.get(1); // -> get error
    }
}
