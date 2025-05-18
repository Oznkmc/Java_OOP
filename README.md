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

## 🧬 Inheritance (Kalıtım)

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
