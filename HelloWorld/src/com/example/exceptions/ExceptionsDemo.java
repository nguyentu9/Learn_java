package com.example.exceptions;

/*
    Runtime Exceptions
    - NullPointerException
    - ArithmeticException
    - IllegalArgumentException
    - IndexOutOfBoundsException
    - IllegalStateException
*/
public class ExceptionsDemo {
    public static void show() {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            var cause = e.getCause();
            System.out.println(cause.getMessage());
        }
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
