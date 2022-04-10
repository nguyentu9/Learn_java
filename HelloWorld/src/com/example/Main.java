package com.example;

public class Main {

    public static void main(String[] args) {
        // Implicit casting
        // byte > long > int > long > float > double
        String x = "1";
        int y = Integer.parseInt(x) + 2;
        System.out.println(y); // 3

        String x2 = "1.1";
        double y2 = Double.parseDouble(x2) + 2;
        System.out.println(y2); // 3.1
    }
}
