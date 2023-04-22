package com.example.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        System.out.println("\n====== EXAMPLE 1 ========");
        names.insert("Adam");
        names.insert("Daniel");
        names.insert("Ana");
        names.traverse();

        System.out.println("\n==============");
        names.remove("Daniel");
        names.traverse();

        System.out.println("\n==============");
        names.remove("Michael");
        names.traverse();


        System.out.println("\n====== EXAMPLE 2 ========");

        LinkedList<Person> people = new LinkedList<>();
        people.insert(new Person(23, "Adam"));
        people.insert(new Person(34, "Daniel"));
        people.insert(new Person(56, "Michael"));

        people.traverse();

        System.out.println("\n==============");
        people.remove(new Person(34, "Daniel"));
        people.traverse();


    }
}
