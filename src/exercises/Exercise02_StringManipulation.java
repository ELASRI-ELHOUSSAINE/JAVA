/**
 * Exercise 2: String Manipulation
 * 
 * This exercise helps practice working with String methods in Java.
 * 
 * Task: Create a program that performs various string operations.
 * 
 * Instructions:
 * 1. Read a string from the user
 * 2. Display string length, uppercase, lowercase versions
 * 3. Check if it's a palindrome
 * 4. Count vowels and consonants
 */

import java.util.Scanner;

public class Exercise02_StringManipulation {
    
    /**
     * Checks if a string is a palindrome (reads same forwards and backwards)
     * @param str The string to check
     * @return true if palindrome, false otherwise
     */
    public boolean isPalindrome(String str) {
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
    
    /**
     * Counts the number of vowels in a string
     * @param str The string to analyze
     * @return Number of vowels
     */
    public int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Counts the number of consonants in a string
     * @param str The string to analyze
     * @return Number of consonants
     */
    public int countConsonants(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c) && "aeiouAEIOU".indexOf(c) == -1) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Main method to test string manipulation
     */
    public static void main(String[] args) {
        Exercise02_StringManipulation stringOps = new Exercise02_StringManipulation();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== String Manipulation Exercise ===");
        System.out.println();
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.println();
        System.out.println("Analysis Results:");
        System.out.println("------------------");
        System.out.println("Original: " + input);
        System.out.println("Length: " + input.length() + " characters");
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("Is Palindrome: " + stringOps.isPalindrome(input));
        System.out.println("Vowel count: " + stringOps.countVowels(input));
        System.out.println("Consonant count: " + stringOps.countConsonants(input));
        
        // Additional operations
        if (input.length() > 0) {
            System.out.println("First character: " + input.charAt(0));
            System.out.println("Last character: " + input.charAt(input.length() - 1));
        }
        
        scanner.close();
    }
}
