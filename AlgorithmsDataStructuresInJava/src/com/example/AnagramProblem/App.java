package com.example.AnagramProblem;

public class App {
    public static void main(String[] args) {
        AnagramProblem problem = new AnagramProblem();

        System.out.println(problem.solve("Adam".toCharArray(), "Daniel".toCharArray())); // false

        System.out.println(problem.solve("restful".toCharArray(), "fluster".toCharArray())); // true
    }
}
