package com.example;

import com.example.generics.User;

public class Main {

    public static void main(String[] args) {
        var user1 = new User(10);
        var user2 = new User(20);
        if(user1.compareTo(user2) < 0) System.out.println("U1 < U2");
        else if(user1.compareTo(user2) > 0) System.out.println("U1 > U2");
        else System.out.println("U1 == U2");

    }
}
