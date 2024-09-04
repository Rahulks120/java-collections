package com.ivoyant.java;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Banana");

        Collections.sort(fruits);
        System.out.println("Second fruit: " + fruits.get(1));

        fruits.remove("Banana");

        System.out.println("Size: " + fruits.size());
 
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Contains Cherry? " + fruits.contains("Cherry"));

        fruits.clear();

        System.out.println("Size after clearing: " + fruits.size());
    }
}
