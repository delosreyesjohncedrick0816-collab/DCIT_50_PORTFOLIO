# Laboratory Activity - Abstraction and Encapsulation in Java

## Purpose
Develop a Java-based Order Management System to demonstrate proper software design while practicing:

- Abstraction using abstract classes and interfaces  
- Encapsulation using access modifiers and controlled data access  
- Enums for representing fixed system states  
- Package organization for logical class separation  
- Managing and traversing collections using ArrayList and Iterator  

## Problem Scenario
You are tasked with developing a simple **Order Management System** for a small online store.

The system allows the creation and management of different types of orders while ensuring that order data is protected and accessed safely.

The design emphasizes:
- Clear abstraction of order behavior  
- Proper encapsulation of order data  
- Safe management of multiple orders  

## Requirements

### Task 1: Project Structure Using Packages
Create the following packages:
- `com.store.order`
- `com.store.payment`
- `com.store.main`

Each package must contain classes related only to its responsibility.

### Task 2: Enum for Order Status
In the `com.store.order` package, create an enum named `OrderStatus` with the following values:
- `PENDING`
- `PAID`
- `SHIPPED`
- `CANCELLED`

This enum represents the current state of an order.

### Task 3: Abstract Class Order
In the `com.store.order` package, create an abstract class `Order` with:
- **Private Fields**
  - `orderId`
  - `amount`
  - `status`
- A constructor that initializes `orderId` and `amount`, and sets status to `PENDING`
- An abstract method `processOrder()`
- A concrete method `getOrderSummary()` that returns a short description of the order

### Task 4: Payment Interface
In the `com.store.payment` package, create an interface `Payable` with:
- Method `pay()`

This interface serves as a contract for payment-related behavior.

### Task 5: Concrete Class with Encapsulation
Create a class `OnlineOrder` that:
- Extends `Order`
- Implements `Payable`
- Overrides `processOrder()` to indicate order processing
- Implements `pay()` to update order status to `PAID`

All fields must remain private and accessed only through methods.

### Task 6: Encapsulation Using Getters and Validation
- Add getters for all private fields in `Order`
- Add a setter for `amount` that:
  - Prevents negative values
  - Updates the amount only if valid

### Task 7: Managing Orders Using ArrayList
In the `com.store.main` package, create a class `OrderApp` with a `main` method.
- Create an `ArrayList<Order>` to store multiple orders
- Add at least three `OnlineOrder` objects
- Do not directly access the internal structure of the collection

### Task 8: Traversing Orders Using Iterator
Using an `Iterator<Order>`:
- Display the summary of each order
- Identify and remove orders with status `CANCELLED`
- Avoid using index-based access

## Files
- com/store/order/Order.java – Abstract order class  
- com/store/order/OrderStatus.java – Enum representing order states  
- com/store/order/OnlineOrder.java – Concrete order implementation  
- com/store/payment/Payable.java – Payment interface  
- com/store/main/OrderApp.java – Main application class  

## How to Run
Compile: `javac com/store/**/*.java`  
Run: `java com.store.main.OrderApp`


