# Lab Exercise - Coffee Shop Rewards System

## Purpose
Develop a Java-based Coffee Shop Rewards System to simulate a real-world scenario and practice:

- Default and parameterized constructors  
- Proper use of the `this` keyword  
- Static variables and static methods  
- Object-Oriented Programming (OOP) principles  

## Scenario
You are a junior Java developer for **BeanBrew Coffee Shop**, a cafe that wants to automate its customer rewards system.

Each customer earns points for every purchase. When a customer reaches **100 points**, they can redeem a free drink.  
The shop also needs to keep track of the **total number of registered customers**.

## Program Requirements

### Class: Customer
- **Instance Variables**
  - `String name`
  - `int points`

- **Static Variable**
  - `static int totalCustomers`

- **Instance Methods**
  - `addPoints()`
  - `redeemReward()`
  - `displayCustomerInfo()`
  - `displayTotalCustomers()`

- **Static Method**
  - `getAllowedRewardsRedemption(Customer customer)` – Determines how many free rewards a customer can redeem

### Class: CoffeeShop (Main Class)
- Create multiple `Customer` objects using both default and parameterized constructors  
- Simulate customer purchases by adding points through multiple transactions  
- Redeem rewards for customers based on accumulated points  
- Display customer information and total number of customers using static methods  
- Register new customers and update the total customer count  

## Files
- Customer.java – Defines customer attributes, constructors, and reward-related methods  
- CoffeeShop.java – Main program that manages customers and simulates transactions  

## How to Run
Compile: `javac Customer.java CoffeeShop.java`  
Run: `java CoffeeShop`

