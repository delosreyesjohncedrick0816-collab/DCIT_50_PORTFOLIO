# Laboratory Finals Exam - Java Swing To-Do List Application

## Purpose
Develop a Java Swing–based To-Do List application to help students organize and track their school tasks while applying:

- Object-Oriented Programming (OOP) principles  
- Abstraction and inheritance  
- Encapsulation and data validation  
- MVC-style separation (model, controller, ui)  
- Java Swing components for GUI development  

## Problem Statement
Students often manage their school tasks using notes or messages, which can become disorganized and hard to track.

To solve this problem, a **Java Swing To-Do List application** is developed that allows users to:
- View tasks in a table  
- Add new tasks using a separate form window  
- Monitor task status  

The system is designed to be modular, organized, and easy to extend in the future.

## Project Structure

- **model** – Contains task-related classes  
- **controller** – Handles task operations and business logic  
- **ui** – Contains all Swing-based user interface windows  

## Program Requirements

### Abstract Class: AbstractTask (model)
- **Attributes**
  - `taskId`
  - `taskName`
  - `taskDescription`

- **Constructors**
  - Default constructor  
  - Parameterized constructor to initialize all attributes  

- **Methods**
  - Abstract getter and setter for `status`  
  - Concrete getters and setters for other attributes  

### Subclasses: Task and TimedTask (model)

#### Task
- **Additional Attribute**
  - `status`
- **Allowed Status Values**
  - `DONE`
  - `ONGOING`
  - `NOT STARTED`
- Overrides abstract status getter and setter from `AbstractTask`

#### TimedTask
- **Additional Attribute**
  - `estimatedMinutes`
- Applies proper encapsulation
- Inherits from the `Task` class

### Controller Class: TaskManager (controller)
- Manages all task-related operations:
  - Create tasks  
  - Update tasks  
  - Remove tasks  
  - View tasks  
- Stores and retrieves task data for the UI  

### Main Application Window (ui)
- Uses `JTable` to display the task list with columns:
  - Task ID  
  - Task Name  
  - Task Description  
  - Status  

- Includes an **Add Task** button:
  - Opens the task input form window  
  - Ensures only one instance of the form window is active at a time  

- Table data is populated using data from `TaskManager`

### Task Input Form Window (ui)
- Input fields:
  - Task ID – Text field (not editable, auto-generated)
  - Task Name – Text field
  - Task Description – Text area
  - Status – Combo box (Not Started, Ongoing, Completed)

- Includes a **Save Task** button:
  - Creates a `Task` object  
  - Passes it to `TaskManager`  
  - Closes the form window  
  - Refreshes the JTable in the main window  

- Handles all input validation before saving  
- Uses **Java Swing components only**

### Main Class
- Instantiates the `TaskManager`
- Passes the instance to the UI classes

## Files
- model/AbstractTask.java – Abstract parent class for tasks  
- model/Task.java – Concrete task implementation  
- model/TimedTask.java – Task with time estimation  
- controller/TaskManager.java – Handles task operations  
- ui/MainWindow.java – Main task viewer window  
- ui/TaskForm.java – Task input form window  
- Main.java – Application entry point  

## How to Run
Compile: `javac **/*.java`  
Run: `java Main`

