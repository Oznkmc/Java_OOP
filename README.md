# 🧠 Object-Oriented Programming (OOP)

Welcome to the world of **Object-Oriented Programming**, where code becomes more organized, modular, and closer to how we understand the real world.

---

## 📦 Objects and Classes

Objects and classes are fundamental building blocks of object-oriented programming (OOP). A **class** serves as a blueprint that defines the **attributes (data/fields)** and **behaviors (methods)** that objects of that type can have. In most programming languages, classes are defined using the `class` keyword.

In OOP, real-world entities are modeled as **objects**. For example, a **phone**, **computer**, **car**, or **animal** can all be considered objects. Each object is an instance of a class and inherits its properties and behaviors.

### 📝 Summary

- **Class**: A blueprint for creating objects.
- **Object**: An instance of a class with actual data and behavior.

This structure allows software to be more **modular**, **readable**, and **reusable**, making it easier to develop and maintain complex applications.

## 🔧 Constructor

A **constructor** is a special method that is automatically executed when a new object is created from a class. Its primary role is to initialize the object's properties with initial values, either default or user-provided.

Constructors ensure that an object starts its life in a valid and predictable state. They are defined differently depending on the programming language, but their core purpose remains the same.

### 🛠️ Key Characteristics

- Invoked automatically upon object creation.
- Used to assign values to the object's fields.
- Has the same name as the class in some languages.
- Does not return a value.
- Can be overloaded in some languages to allow multiple ways of initializing an object.

### ✅ Summary

Constructors are essential for setting up an object properly from the moment it is instantiated. If no constructor is explicitly defined, many languages provide a default constructor automatically.

## 🧬 Inheritance

Inheritance is a fundamental concept in object-oriented programming (OOP) that allows one class (child/subclass) to inherit properties and behaviors from another class (parent/superclass). This promotes **code reuse**, **modularity**, and a **hierarchical class structure**.

In this example, a general `Product` class is defined with common attributes like `id`, `name`, `price`, and `brand`. Two subclasses, `Electronics` and `Clothing`, inherit from `Product` and add their own specific properties.

### 👨‍👩‍👧 Class Structure Overview

- **`Product`**: Base class containing shared product attributes and a `getDetails()` method to display them.
- **`Electronics`**: Inherits from `Product` and adds `warrantyPeriod` and `powerUsage`.
- **`Clothing`**: Inherits from `Product` and adds `size`, `fabricType`, and `gender`.

### 🔁 Method Overriding

Both subclasses override the `getDetails()` method to:
1. Reuse the base method (`super.getDetails()`).
2. Extend the output with their own specific attributes.

### ⚙️ Constructor Chaining with `super()`

Each subclass constructor calls the `Product` constructor using the `super(...)` keyword to ensure base class attributes are initialized properly, then assigns its own fields.

### 🧪 Execution Flow

In the `main` method:
- An `Electronics` object is created.
- Its `getDetails()` method is called, which:
  - Calls the base `getDetails()` to print general product info.
  - Then prints electronics-specific info.

This demonstrates how subclass objects can contain both **inherited** and **specialized** behaviors.

## 🔁 Polymorphism

Polymorphism is a core principle of object-oriented programming that allows objects of different classes to be treated through a common interface. It enables methods to behave differently based on the actual object's class that invokes them, promoting flexibility and extensibility in software design.

This dynamic method dispatch supports writing more maintainable and scalable code by allowing new object types to be integrated with minimal changes to existing codebases. Polymorphism also facilitates adherence to key design principles such as the Open/Closed Principle, making systems easier to extend without modifying existing code.

> ✅ **Key Benefits**
> - Enables method overriding to tailor behavior in subclasses  
> - Supports runtime determination of the appropriate method to invoke  
> - Enhances code flexibility, maintainability, and scalability  
> - Promotes loose coupling and easier code extension

## 💳 Interface

This example shows how to use an **interface** to define a common contract for different payment methods.

### Interface: `PaymentMethod`
- Declares two methods: `pay(double amount)` and `refund(double amount)`
- Specifies *what* operations a payment method must support, but not *how*

### Implementations:
- **CreditCardPayment**: Implements payment and refund via credit card
- **PayPalPayment**: Implements payment and refund via PayPal account

### Why use interfaces here?
- **Abstraction:** Hide implementation details behind a common interface  
- **Flexibility:** Easily add new payment methods without changing existing code  
- **Polymorphism:** Treat different payment types uniformly through the same interface

This design promotes clean, scalable, and maintainable code.

## 📄 Abstract Classes

Abstract classes are used to define a common base for other classes. They can include both fully implemented methods and abstract methods (without a body).

### Key Points:
- Declared with the `abstract` keyword
- Cannot be instantiated directly
- May contain abstract methods that must be implemented by subclasses
- Can contain concrete (fully defined) methods

Abstract classes provide a **template** for other classes, enforcing certain methods to be defined while allowing shared functionality.

### Why use abstract classes?
- To define a common structure for related classes
- To enforce implementation of specific behavior in subclasses
- To reuse code across multiple related classes

This encourages **code consistency** and **reusability** in object-oriented design.

