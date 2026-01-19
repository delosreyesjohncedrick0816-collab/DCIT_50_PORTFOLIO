# Laboratory Activity - Smart Home Control System

## Purpose
Develop a Java-based Smart Home Control System to model different smart devices and demonstrate advanced Object-Oriented Programming concepts such as:

- Method overriding in subclasses  
- Polymorphism using parent-type references  
- Runtime polymorphism through dynamic binding  
- Using arrays or lists of a parent type to store different child objects  
- Encapsulation and controlled access to attributes  

## Problem Scenario
You are hired as a junior Java developer by **Smartify PH**, a tech startup that builds smart home systems.

Your task is to design a simplified **Smart Home Management System** that models different devices inside a home and their interactions, including how they behave when powered on or off.

## Activity Requirements

### Device Behavior
- A home can contain multiple devices that can be turned **ON** or **OFF**
- Each device can determine and display its current power status
- When a device is powered ON, it should display the status of its specific attributes

### Devices to Implement
- **Air Conditioner**
  - Can display and adjust fan speed and temperature
- **Lamp Shade**
  - Can display and adjust brightness and light color
- **Television**
  - Can display and adjust channel and volume
- **Microwave Oven**
  - Can display and adjust timer and temperature

### Object-Oriented Design Rules
- Each device must implement its own way of checking power status
- All attributes must use **encapsulation**
- Every setter method should display the device’s updated status after changes
- Method overriding must be used to demonstrate different behaviors per device

## Main Program Requirements
- Create the following device instances:
  - One air conditioner with default values (fan speed = 3, temperature = 24)
  - Two lamp shades:
    - One with 100% brightness and yellow light
    - One created by copying the first lamp shade
  - One television with channel set to 1 and volume at 10%
  - One microwave oven with default values

- Implement a **static method** at the device level that:
  - Accepts a list or array of devices
  - Turns all devices ON or OFF based on the parameter passed
  - Works without creating an instance of the device class

- Implement another **static method** at the device level that:
  - Counts and returns the number of devices currently powered ON

## Files
- Device.java – Base class for all smart devices  
- AirConditioner.java – Represents an air conditioner device  
- LampShade.java – Represents a lamp shade device  
- Television.java – Represents a television device  
- Microwave.java – Represents a microwave oven device  
- Main.java – Main program that creates and manages all devices  

## How to Run
Compile: `javac *.java`  
Run: `java Main`

