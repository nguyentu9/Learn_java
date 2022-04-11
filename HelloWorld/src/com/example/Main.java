package com.example;

public class Main {
    public static void main(String[] args) {
        new Employee(10_000);
        System.out.println(Employee.numberOfEmployees);
        var employee = new Employee(50, 20);
        int wage = employee.calculateWage();

        System.out.println(wage);
    }
}
