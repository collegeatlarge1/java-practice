package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Basic Output
        System.out.println("Welcome to Bob's Burgers!");

        // Basic Arithmetic Operations
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));

        // Simple Loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // Classes and Objects
        Character bob = new Character("Bob Belcher", 46);
        bob.introduce();

        Employee linda = new Employee("Linda Belcher", 44, "Waitress");
        linda.introduce();

        // Exception Handling
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }

        // Collections
        List<String> characters = new ArrayList<>();
        characters.add("Bob Belcher");
        characters.add("Linda Belcher");
        characters.add("Tina Belcher");
        System.out.println("Characters: " + characters);

        // File I/O
        String content = "This is an example of file operations in Java with Bob's Burgers characters.";
        FileOperations.writeToFile(content);

        List<String> fileContent = FileOperations.readFromFile();
        System.out.println("File content:");
        fileContent.forEach(System.out::println);
    }
}
