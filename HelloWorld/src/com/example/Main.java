package com.example;

public class Main {

    public static void main(String[] args) {
        int result = Math.round(1.1F);
        System.out.println(result); // 1

        result = (int)Math.ceil(1.1F);
        System.out.println(result); // 2

        result = (int)Math.floor(1.1F);
        System.out.println(result); // 1

        result = Math.max(1, 2);
        System.out.println(result); // 2

        int result2 = (int)(Math.random() * 100);
        System.out.println(result2);
    }
}
