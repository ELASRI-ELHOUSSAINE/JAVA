/**
 * Exercise 1: Calculator
 * 
 * This is an example exercise for practicing basic Java concepts.
 * 
 * Task: Create a simple calculator that performs basic arithmetic operations.
 * 
 * Instructions:
 * 1. Implement methods for addition, subtraction, multiplication, and division
 * 2. Handle division by zero
 * 3. Test your implementation by creating instances and calling methods
 */

import java.util.Scanner;

public class Exercise01_Calculator {
    
    /**
     * Adds two numbers
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public double add(double a, double b) {
        return a + b;
    }
    
    /**
     * Subtracts two numbers
     * @param a First number
     * @param b Second number
     * @return Difference of a and b
     */
    public double subtract(double a, double b) {
        return a - b;
    }
    
    /**
     * Multiplies two numbers
     * @param a First number
     * @param b Second number
     * @return Product of a and b
     */
    public double multiply(double a, double b) {
        return a * b;
    }
    
    /**
     * Divides two numbers
     * @param a Dividend
     * @param b Divisor
     * @return Quotient of a and b
     * @throws ArithmeticException if b is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }
    
    /**
     * Main method to test the Calculator
     */
    public static void main(String[] args) {
        Exercise01_Calculator calc = new Exercise01_Calculator();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Simple Calculator ===");
        System.out.println();
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println();
        System.out.println("Results:");
        System.out.println(num1 + " + " + num2 + " = " + calc.add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + calc.subtract(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + calc.multiply(num1, num2));
        
        try {
            System.out.println(num1 + " / " + num2 + " = " + calc.divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(num1 + " / " + num2 + " = Error: " + e.getMessage());
        }
        
        scanner.close();
    }
}
