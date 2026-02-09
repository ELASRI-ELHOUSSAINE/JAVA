# Quick Start Guide

## Compile and Run the Main Program

```bash
# Compile
javac src/main/java/com/example/Main.java

# Run
java -cp src/main/java com.example.Main
```

## Compile and Run Exercise 01 (Calculator)

```bash
# Compile
javac src/exercises/Exercise01_Calculator.java

# Run
java -cp src/exercises Exercise01_Calculator
```

## Quick Commands Reference

### Compile a Single Java File
```bash
javac path/to/YourFile.java
```

### Run a Compiled Java Class
```bash
java -cp path/to/directory ClassName
```

### Compile All Java Files in a Directory
```bash
javac path/to/directory/*.java
```

## Tips

- Always compile from the project root directory
- Use the `-cp` (classpath) flag to specify where to find compiled classes
- Java class names must match the file name
- The `main` method signature must be exactly: `public static void main(String[] args)`

## Troubleshooting

**Error: "Could not find or load main class"**
- Make sure you're using the correct classpath with `-cp`
- Verify the package name matches the directory structure
- Check that you're using the fully qualified class name (package.ClassName)

**Error: "class is public, should be declared in a file named..."**
- Rename your file to match the public class name exactly

**Error: "package does not exist"**
- Make sure the directory structure matches the package declaration
