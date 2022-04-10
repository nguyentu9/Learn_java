package com.example;

public class Main {

    public static void main(String[] args) {
        int role = 1;
        switch(role) {
            case 1:
                System.out.println("You're an admin");
                break;
            case 2:
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }
    }
}
