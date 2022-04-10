package com.example;

import java.awt.*;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String message = "  Hello World" + "!!  ";
        System.out.println(message.endsWith("!!")); // true
        System.out.println(message.length()); // 17
        System.out.println(message.indexOf("e")); // 3
        System.out.println(message.indexOf("sky")); // -1
        System.out.println(message.replace("!", "*")); // Hello World**
        System.out.println(message.toLowerCase()); // hello world!!
        System.out.println(message.trim()); // Hello World!!
    }
}
