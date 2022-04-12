package com.example;

import com.example.generics.GenericList;
import com.example.generics.Instructor;
import com.example.generics.User;
import com.example.generics.Utils;

public class Main {

    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        for(var item:list)
            System.out.println(item);

    }
}
