package com.example.ReverseArrayProblem;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        ReverseArrayProblem problem = new ReverseArrayProblem();

        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(problem.solve(nums)));
    }
}
