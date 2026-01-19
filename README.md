# Midterm Laboratory Exam - Smart Home Management System

## Purpose
Design and implement a simplified Java-based Smart Home Management System to model smart devices and their interactions while practicing:

- Inheritance and method overriding  
- Constructor overloading  
- Static variables and methods  
- Polymorphism using arrays of objects  
- Object-Oriented Programming (OOP) principles  

## Scenario
You are hired as a junior Java developer by **Smartify PH**, a tech startup that builds smart home systems.

Your task is to design a simplified **Smart Home Management System** that models different devices and their interactions, including lights and thermostats.

## Program Requirements

### Base Class: Device
- **Attributes**
  - `deviceName`
  - `status` (accepts only `ON` or `OFF`)
  - `location`

- **Constructors**
  - Default constructor  
  - Parameterized constructor to initialize all attributes  

- **Methods**
  - `turnOn()`  
  - `turnOff()`  
  - `displayInfo()`  

- **Static Members**
  - `static int deviceCount` – Tracks the total number of devices created  
  - `showDeviceCount()` – Displays the total device count  

### Subclass: LightBulb
- **Additional Attributes**
  - `brightnessLevel` (0–100)  
  - `color`

- **Methods**
  - Override `displayInfo()` to include brightness and color  
  - `adjustBrightness(int level)` – Updates brightness level  

- **Constructor Overloading**
  - Constructor with full parameters  
  - Constructor with only `deviceName` and `location`  
    - Sets brightness to `50`  
    - Sets color to `"Warm White"`  

### Subclass: Thermostat
- **Additional Attributes**
  - `temperature` (in Celsius)  
  - `mode` (e.g., cooling, heating)

- **Methods**
  - Override `displayInfo()` to include temperature and mode  
  - Overloaded `setTemperature()`:
    - Accepts `double temperature`  
    - Accepts `double temperature` and `String mode`  

## Main Program Requirements
- Create:
  - One `LightBulb` object  
  - Two `Thermostat` objects  
- Store all devices in an array of `Device`
- Use a loop to iterate through the array and display device information  

## Additional Class: SmartHomeController
- Accepts an array of `Device` objects during initialization  
- Provides methods to:
  - Turn all devices **ON**  
  - Turn all devices **OFF**  

## Files
- Device.java – Base class for all smart devices  
- LightBulb.java – Subclass representing smart light bulbs  
- Thermostat.java – Subclass representing thermostats  
- SmartHomeController.java – Controls all devices in the system  
- Main.java – Main program that initializes and manages the smart home  

## How to Run
Compile: `javac *.java`  
Run: `java Main`

