package com.example;

import com.example.generics.GenericList;
import com.example.generics.User;

public class Main {

    public static void main(String[] args) {
        var list = new GenericList<User>();
        list.add(new User());
        User number = list.get(0);
    }
}
