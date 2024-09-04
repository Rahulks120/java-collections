package com.ivoyant.java;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Names in the LinkedList:");
        for (String name : names) {
            System.out.println(name);
        }

        names.addFirst("Zara");

        names.addLast("Dev");

        System.out.println("\nNames after adding to the beginning and end:");
        for (String name : names) {
            System.out.println(name);
        }

        names.remove("Charlie");

        System.out.println("\nNames after removing 'Charlie':");
        for (String name : names) {
            System.out.println(name);
        }

        String firstName = names.getFirst();
        String lastName = names.getLast();

        System.out.println("\nFirst name in the LinkedList: " + firstName);
        System.out.println("Last name in the LinkedList: " + lastName);
    }
}

