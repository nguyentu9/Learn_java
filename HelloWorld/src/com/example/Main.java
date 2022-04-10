package com.example;

public class Main {

    public static void main(String[] args) {
        String message = greetUser("Toan", "Huynh");
    }

    private static String greetUser(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName;
    }
}
