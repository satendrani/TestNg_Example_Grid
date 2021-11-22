package com.examples;

public class HelloWord {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        for (String arg : args) {
            System.out.println("entered value: " + arg);
        }
    }

}
