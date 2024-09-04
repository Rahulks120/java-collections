package com.ivoyant.java;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        System.out.println("Sum: " + addition.operate(5, 3));

        Calculator multiplication = (a, b) -> a * b;
        System.out.println("Product: " + multiplication.operate(5, 3));
    }
}
