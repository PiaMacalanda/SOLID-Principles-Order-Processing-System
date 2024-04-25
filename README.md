# SOLID-Principles-Order-Processing-System

This repository contains the Java code for the OOP SOLID Principles Lab Assignment#6. The codebase demonstrates the application of SOLID principles to create a flexible and maintainable object-oriented program.

## SOLID Principles
The SOLID principles are a set of design principles in object-oriented programming that enable developers to build more understandable, flexible, and maintainable software. The principles applied in this project are:

- **S**: Single Responsibility Principle (SRP)
- **O**: Open/Closed Principle (OCP)
- **L**: Liskov Substitution Principle (LSP)
- **I**: Interface Segregation Principle (ISP)
- **D**: Dependency Inversion Principle (DIP)

Each class and interface in this program adheres to these principles, ensuring that the code is robust and ready for future extensions.

## Project Structure
The program is structured into several Java files, each representing a single responsibility and concept within the application:

- `Order.java`: Interface for order-related actions.
- `Invoice.java`: Interface for invoice-related actions.
- `Notification.java`: Interface for notification-related actions.
- `OrderAction.java`: Implementation of the `Order` interface.
- `InvoiceAction.java`: Implementation of the `Invoice` interface.
- `EmailNotification.java`: Implementation of the `Notification` interface.
- `OrderTest.java`: Main class that orchestrates the order processing flow.

## Setup and Execution
To run the project, ensure you have Java installed on your system. Compile the Java files using `javac` and then run the `OrderTest` class:

```bash
javac Order.java Invoice.java Notification.java OrderAction.java InvoiceAction.java EmailNotification.java OrderTest.java
java OrderTest

## Credits

This project is part of Sir Jerry Esperanza's lab assignment 6, focusing on the implementation of SOLID principles to an order processing system in an object-oriented programming paradigm.

## Programmer's Name

- [Pia V. Macalanda]
