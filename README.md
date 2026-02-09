# JAVA Starter Project

A repository for Java projects including console apps, OOP exercises, and small projects to practice core Java concepts like classes, inheritance, and data structures.

## Project Structure

```
JAVA/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── Main.java          # Main entry point with console I/O
│   └── exercises/
│       └── Exercise01_Calculator.java     # Sample exercise
├── README.md
└── .gitignore
```

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Terminal/Command Prompt

### How to Compile and Run

#### Running the Main Class

1. Navigate to the project root directory:
   ```bash
   cd /path/to/JAVA
   ```

2. Compile the Main class:
   ```bash
   javac src/main/java/com/example/Main.java
   ```

3. Run the Main class:
   ```bash
   java -cp src/main/java com.example.Main
   ```

#### Running an Exercise

1. Navigate to the project root directory:
   ```bash
   cd /path/to/JAVA
   ```

2. Compile an exercise (e.g., Calculator):
   ```bash
   javac src/exercises/Exercise01_Calculator.java
   ```

3. Run the exercise:
   ```bash
   java -cp src/exercises Exercise01_Calculator
   ```

## Main Features

The `Main.java` class demonstrates:
- Basic console output using `System.out.println()`
- Reading user input using `Scanner`
- String and numeric input handling
- Simple arithmetic operations
- Proper resource cleanup

## Adding New Exercises

To add a new exercise:

1. Create a new Java file in `src/exercises/` directory
2. Name it with the pattern: `Exercise##_TopicName.java` (e.g., `Exercise02_ArrayManipulation.java`)
3. Include a `main` method for testing
4. Add comments explaining the exercise objectives

Example template:
```java
/**
 * Exercise ##: [Topic Name]
 * 
 * Task: [Description of what to implement]
 * 
 * Instructions:
 * 1. [Step 1]
 * 2. [Step 2]
 * 3. [Step 3]
 */

public class Exercise##_TopicName {
    
    // Your implementation here
    
    public static void main(String[] args) {
        // Test your implementation
    }
}
```

## Adding New Projects

For larger projects, create subdirectories under `src/main/java/com/`:

1. Create a new package directory: `src/main/java/com/projectname/`
2. Add your Java classes
3. Update this README with compilation and run instructions

## Learning Resources

This project is designed to help you practice:
- Basic Java syntax
- Object-Oriented Programming (OOP)
- Data structures (Arrays, Lists, Maps, etc.)
- Control flow (if/else, loops, switch)
- Exception handling
- File I/O
- And more!

## Contributing

Feel free to add your own exercises and projects to this repository. Follow the existing structure and naming conventions.

## License

This is an educational project. Feel free to use and modify as needed for learning purposes.
