# Java 8 Features Overview

This repository contains examples and explanations for the major features introduced in Java 8, organized into separate modules for better understanding.

## Folder Structure and Features

### L01_Lambda_Expression
This module introduces lambda expressions, enabling concise syntax for representing functional interfaces and anonymous methods. Lambda expressions simplify the development of functional programming constructs in Java.

### L02_Functional_Interface
Focuses on functional interfaces, which are interfaces with a single abstract method. Includes the `@FunctionalInterface` annotation and explains their critical role in enabling lambda expressions.

### L03_Method_References
Covers method references, which are a shorthand notation for lambdas to refer to methods or constructors. Includes examples of:
- Static method references (`ClassName::staticMethod`)
- Instance method references (`instance::instanceMethod`)
- Constructor references (`ClassName::new`)

### L04_Optional_Class
Explains the `Optional` class, a container object used to handle potential null values gracefully. Demonstrates methods like `orElse`, `isPresent`, and `ifPresent` to avoid `NullPointerException`.

### L05_Default_and_Static_method_in_Interface
Details how Java 8 allows interfaces to include:
- **Default methods**: Methods with a default implementation.
- **Static methods**: Utility methods that can be called without an instance of the interface.

### L06_Java8_Stream_APIs
Explores the powerful Stream API for processing collections and sequences of data in a functional style. Includes examples of:
- Intermediate operations like `filter`, `map`, and `sorted`.
- Terminal operations like `collect`, `forEach`, and `reduce`.

### L07_BiFunction_BiConsumer_BiPredicate  
Explores the utility of `BiFunction`, `BiConsumer`, and `BiPredicate` functional interfaces for handling operations involving two inputs. Includes examples of:  
- **`BiFunction`**: For applying a function to two arguments and producing a result.  
- **`BiConsumer`**: For performing an operation that accepts two arguments but returns no result.  
- **`BiPredicate`**: For evaluating a condition with two arguments and returning a boolean.  

## How to Use This Repository
Each folder contains:
- **Code Examples**: Demonstrates how to implement and use the feature in real-world scenarios.
- **Documentation**: Provides detailed explanations of the concepts and their applications.

---

Explore these features to harness the full potential of Java 8 for writing modern, concise, and efficient code.
