package com.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        // numbers[10] = 3; // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
        System.out.println(Arrays.toString(numbers)); // [1, 2, 0, 0, 0]

        int[] numbers2 = {2, 3, 5, 1, 4};
        Arrays.sort(numbers2);
        System.out.println(numbers2.length); // 5
        System.out.println(Arrays.toString(numbers2)); // [1, 2, 3, 4, 5]
    }
}
