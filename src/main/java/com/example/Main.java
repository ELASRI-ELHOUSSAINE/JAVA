package com.example;

import java.util.Scanner;

/**
 * Main class - Entry point for the Java starter project
 * Demonstrates basic console input/output operations
 */
public class Main {
    
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        // Display welcome message
        System.out.println("=================================");
        System.out.println("Welcome to the Java Starter Project!");
        System.out.println("=================================");
        System.out.println();
        
        // Basic input/output demonstration
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Display personalized message
        System.out.println();
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println();
        
        // Simple calculation example
        System.out.println("Let's do a simple calculation:");
        System.out.print("Enter first number: ");
        scanner.nextLine(); // Consume newline
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double sum = num1 + num2;
        double product = num1 * num2;
        
        System.out.println();
        System.out.println("Results:");
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " * " + num2 + " = " + product);
        
        System.out.println();
        System.out.println("Thank you for using the Java Starter Project!");
        
        // Close the scanner
        scanner.close();
    }
}
