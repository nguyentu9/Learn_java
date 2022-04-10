package com.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.toString(numbers)); // [[I@7c30a502, [I@49e4cb85]
        System.out.println(Arrays.deepToString(numbers)); // [[1, 0, 0], [0, 0, 0]]

        int[][] numbers2 = { {1,2,3}, {4,5,6} };
        System.out.println(Arrays.deepToString(numbers2)); // [[1, 2, 3], [4, 5, 6]]

    }
}
