**Behavioral Design Patterns in Java**



**📌 Project Overview**

This project demonstrates the implementation of Behavioral Design Patterns in Java.
Behavioral patterns focus on how objects interact, communicate, and share responsibilities, helping build systems that are flexible, maintainable, and loosely coupled.

The project includes four commonly used behavioral patterns:

* Chain of Responsibility
* Command
* Observer
* Strategy



Each pattern is implemented in its own package with:

* Clearly separated roles (interfaces, concrete classes)
* A runnable Demo class to showcase behavior



**Project structure:**



BehavioralPatterns/
└── src/
└── main/
└── java/
└── behavioral/
├── chain/
│   ├── Handler.java
│   ├── AuthenticationHandler.java
│   ├── AuthorizationHandler.java
│   ├── LoggingHandler.java
│   └── ChainDemo.java
│
├── command/
│   ├── Command.java
│   ├── TextEditor.java
│   ├── PasteCommand.java
│   ├── Button.java
│   └── CommandDemo.java
│
├── observer/
│   ├── Observer.java
│   ├── Customer.java
│   ├── Store.java
│   └── ObserverDemo.java
│
├── strategy/
│   ├── PaymentStrategy.java
│   ├── CreditCardPayment.java
│   ├── PayPalPayment.java
│   ├── PaymentContext.java
│   └── StrategyDemo.java



**🔗 1. Chain of Responsibility Pattern**



**What It Is**

The Chain of Responsibility pattern allows a request to pass through a chain of handlers, where each handler decides whether to:

* Process the request
* Pass it to the next handler



**Why It’s Used**

* Avoids tightly coupling sender and receiver
* Allows dynamic ordering of processing steps
* Easy to add/remove handlers



**How It Works Here**



Request flow:

Authentication → Authorization → Logging

Each handler checks part of the request and forwards it if valid.



**Real-World Examples**

* Security filters (e.g., Spring Security)
* Request validation pipelines
* Technical support escalation systems



**🧠 2. Command Pattern**
**What It Is**



The Command pattern encapsulates a request as an object, allowing it to be:

* Passed around
* Stored
* Executed later
* Extended with undo/redo functionality



**Why It’s Used**

* Decouples the invoker from the receiver
* Makes actions reusable and configurable



**How It Works Here**

* Command interface defines execute()
* PasteCommand represents a paste action
* Button triggers the command
* TextEditor performs the actual work



**Real-World Examples**

* GUI button actions
* Task scheduling
* Undo/redo operations



**👀 3. Observer Pattern**



**What It Is**

The Observer pattern defines a one-to-many relationship where multiple observers are notified when the subject’s state changes.



**Why It’s Used**

* Promotes loose coupling
* Supports event-driven systems
* Observers can be added or removed dynamically



**How It Works Here**

* Store acts as the subject
* Customer objects are observers
* When the store updates, all customers are notified



**Real-World Examples**

* Event listeners in GUI frameworks
* Stock market notifications
* Messaging and notification systems



**💳 4. Strategy Pattern**



**What It Is**

The Strategy pattern defines a family of algorithms and allows selecting one at runtime.



**Why It’s Used**

* Eliminates conditional logic (if/else)
* Follows Open/Closed Principle
* Makes algorithms interchangeable



**How It Works Here**

* PaymentStrategy defines payment behavior
* CreditCardPayment and PayPalPayment are concrete strategies
* PaymentContext selects and executes a strategy at runtime



**Real-World Examples**

* Payment systems
* Sorting algorithms
* Compression strategies
