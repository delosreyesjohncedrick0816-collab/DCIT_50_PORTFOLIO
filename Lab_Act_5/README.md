# Laboratory Activity - Modeling a School Management System

## Purpose
Develop a Java-based School Management System to model people and resources in a school environment and practice:

- Inheritance using the `extends` keyword  
- IS-A and HAS-A relationships in class design  
- Aggregation between related classes  
- Constructors and the `super` keyword  
- Object-Oriented Programming (OOP) concepts  

## Problem Scenario
A school wants to create a simple Java program to manage its people and resources.

All people in the school are considered **Persons**, but there are two specific roles: **Students** and **Teachers**.  
Each teacher handles one or more **Courses**, and each course has a name and a code.

The system models this structure using **inheritance** and **aggregation**.

## Activity Requirements

### Classes

#### Person
- **Attributes**
  - `name`
  - `age`
  - `gender`
- **Method**
  - `displayInfo()` – Displays basic personal information

#### Student
- **Attribute**
  - `studentId`
- **Method**
  - `displayStudent()` – Displays student information

#### Teacher
- **Attribute**
  - `department`
- **Methods**
  - `displayTeacher()` – Displays teacher information
- **Relationship**
  - A teacher can have one or more courses (aggregation)

#### Course
- **Attributes**
  - `courseCode`
  - `courseName`
- **Method**
  - `displayCourse()` – Displays course details

## Program Structure
- Implement proper inheritance relationships among `Person`, `Student`, and `Teacher`
- Implement aggregation between `Teacher` and `Course`
- Use constructors and the `super` keyword where applicable
- Contain all classes in a single file named `TeacherStudentAssignment.java`
- Include a main class with a simple implementation of a student and a teacher

## Files
- TeacherStudentAssignment.java – Contains all class definitions and the main program

## How to Run
Compile: `javac TeacherStudentAssignment.java`  
Run: `java TeacherStudentAssignment`

