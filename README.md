# Java Student Grades Manager

A simple console-based Java program that manages student grades. It lets you enter students, their grades, and then displays per-student best grades, class statistics, and the best/worst student in the class.

## Features
- Add multiple students and their grades
- Show the best grade for each student
- Find the student with the highest and lowest grade
- Compute the class average
- Count the total number of students

## Project Structure
- Classroom.java: Manages the list of students and class-level statistics
- Students.java: Stores student data and basic stats
- StudentsGradesManagerPart.java: Entry point and console I/O

## How To Run
1) Compile:
```
javac Classroom.java Students.java StudentsGradesManagerPart.java
```
2) Run:
```
java StudentsGradesManagerPart
```

## Example Flow
- Enter the number of students
- Enter each student name and grades
- View the generated statistics

## Notes
- This project uses standard input and output (console).
- Grades are stored in arrays and processed in memory.
