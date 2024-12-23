### **Default Methods**

**Default methods** allow you to add new methods to an interface without breaking the existing implementations of that interface. This ensures backward compatibility.

#### **Why Do We Need Default Methods?**

1. **Backward Compatibility**:
    
    - Before Java 8, if you added a new method to an interface, all implementing classes had to provide an implementation, which could break existing code.
    - With default methods, you can add new functionality to an interface without forcing all implementing classes to change.
2. **Code Reusability**:
    
    - You can provide a default implementation that multiple classes can inherit, reducing code duplication.
    - Classes can override the default implementation if needed.

```java  
interface Vehicle {  
    void move();  
  
    // Default method with implementation  
    default void fuelEfficiency() {  
        System.out.println("The vehicle has standard fuel efficiency.");  
    }  
}  
  
class Car implements Vehicle {  
    public void move() {  
        System.out.println("The car is moving.");  
    }  
  
    @Override  
    public void fuelEfficiency() {  
        System.out.println("The car has excellent fuel efficiency.");  
    }  
}  
  
class Bicycle implements Vehicle {  
    public void move() {  
        System.out.println("The bicycle is moving.");  
    }  
}  
  
public class S01_default_methods {  
    public static void main(String[] args) {  
        Vehicle car = new Car();  
        car.move();  
        car.fuelEfficiency();  
  
        Vehicle bike = new Bicycle();  
        bike.move();  
        bike.fuelEfficiency(); // Uses the default method because we did not implement it in Bicycle Class  
    }  
}
```

---

### **Static Methods**

**Static methods** in interfaces allow utility methods to be defined directly within the interface, making them related to the interface rather than any specific implementation.

#### **Why Do We Need Static Methods?**

1. **Utility Methods**:
    
    - Static methods are useful for defining helper or utility methods related to the interface.
    - These methods do not need to be tied to an object instance.
2. **Encapsulation of Behavior**:
    
    - Static methods let you encapsulate behavior specific to the interface within the interface itself, rather than relying on external utility classes.
3. **Organized Code**:
    
    - Keeps related functionality together, improving code organization and readability.


```java  
interface MathOperations {  
    static int add(int a, int b) {  
        return a + b;  
    }  
  
    static int multiply(int a, int b) {  
        return a * b;  
    }  
}  
  
public class S02_static_mehthods {  
    public static void main(String[] args) {  
        // Call static methods directly on the interface  
        int sum = MathOperations.add(5, 10);  
        int product = MathOperations.multiply(5, 10);  
  
        System.out.println("Sum: " + sum);  
        System.out.println("Product: " + product);  
    }  
}
```

---
### **Key Differences Between Default and Static Methods**

| Feature         | Default Methods                           | Static Methods                              |
| --------------- | ----------------------------------------- | ------------------------------------------- |
| **Purpose**     | Provide default implementation            | Provide utility or helper methods           |
| **Inheritance** | Can be inherited and overridden           | Cannot be inherited or overridden           |
| **Access**      | Accessed through an instance of the class | Accessed directly through the interface     |
| **Use Case**    | Add new functionality to interfaces       | Encapsulate helper methods in the interface |

---

### Conclusion

- **Default Methods**: Useful for evolving interfaces without breaking existing code.
- **Static Methods**: Provide a way to group related utility methods within the interface itself.