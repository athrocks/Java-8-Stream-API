

## Contents 

1. What is functional Interface with an example -->  refer to [[02 Functional Interfaces (Intro)]]
2. How to define functional interface using `@FunctionalInterface` annotation ? 
3. How to use Lambda expression to implement functional interface ?
4. We will see some predefined functional interfaces with examples
5. Runnable functional interface example

---

## @FunctionalInterface

2.  How to define functional interface using ``@FunctionalInterface`` annotation ? 

An interface with only one abstract method qualifies as a functional interface even if it's not explicitly annotated with `@FunctionalInterface`. However, the `@FunctionalInterface` annotation serves specific purposes that can be beneficial:

1. **Compiler Enforcement**
2. Documentation and Clarity
3. and more.....

The `@FunctionalInterface` annotation ensures that the interface adheres to the functional interface contract. If you accidentally add a second abstract method to the interface, the compiler will throw an error. This helps prevent inadvertent changes that would break its functional interface nature.

```java
@FunctionalInterface  
public interface S01_My_Functional_Interface {  
    void print(String message);  
	
	void myMethod(); // ----> will give error if one more abstract method added
	//                        because of @FunctionalInterface
}
```

- Functional interface can have any number of default, static methods but can contain only  
one abstract method.   

```java
@FunctionalInterface  
public interface S01_My_Functional_Interface {  
    void print(String message);  
  
    default void println(String message) {  
        System.out.println(message + "in default method");  
    }  
  
    static void printMethod(String message) {  
        System.out.println(message + "in static method");  
    }  
}
```

---

3. How to use Lambda expression to implement functional interface ? 

```java
@FunctionalInterface  
interface Shape{  
    void draw();  
}  
  
public class S02_Lambda_Example {  
  
    public static void main(String[] args) {  
        Shape Circle = () -> System.out.println("Circle draw method called");  
        Circle.draw();  
    }  
  
}
```

---

## Predefined Functional Interfaces

### Function Functional Interface

- Search [java.util.function](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html) on web browser
- In there click on [Function Interface](https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html)
#### a. Without using Lambda
```java
import java.util.function.Function;  
  
class FunctionImpl implements Function<String, Integer> {  
    @Override  
    public Integer apply(String str) {  
        return str.length();  
    }  
}  
  
public class S03_Function_Interface_Inbuilt {  
  
    public static void main(String[] args) {  
        Function<String,Integer> function = new FunctionImpl();  
        int answer = function.apply("Hello");  
        System.out.println(answer);  
    }  
}
```

```output
5
```

#### b. using Lambda

- No need for building new class to implement Function<T,R>.

```java
public static void main(String[] args) {  
  
    Function<String,Integer> function = (String str) -> {  
        return str.length();  
    };  
  
    int answer = function.apply("Hello");  
    System.out.println(answer);  
}
```

```output
5
```

---

### Consumer Functional Interface

- Search [java.util.function](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html) on web browser
- In there click on [Consumer Interface](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)

#### Using Lambda

```java
public class S04_Consumer_Interface_Inbuilt {  
  
    public static void main(String[] args) {  
        Consumer<String> consumer = (String message) -> {  
            System.out.println("Consumer Interface.... Message is: " + message);  
        };  
        consumer.accept("Hello World");  
    }  
}
```

---

### Supplier Functional Interface

- Search [java.util.function](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html) on web browser
- In there click on [Supplier Interface](https://docs.oracle.com/javase/8/docs/api/java/util/function/Supplier.html)

#### Using Lambda

```java
public class S05_Supplier_Interface_Inbuilt {  
  
    public static void main(String[] args) {  
        Supplier<LocalDateTime> supplier = () -> {  
            return LocalDateTime.now();  
        };  
        LocalDateTime timeNow = supplier.get();  
        System.out.println(timeNow);  
    }  
}
```

---

### Runnable Functional Interface

```java
public class S06_Runnable_Interface_Inbuilt {  
    public static void main(String[] args) {  
        Runnable r = () -> {  
            System.out.println("run method called");  
        };  
  
        Thread t1 = new Thread(r);  
        t1.start();  
    }  
}
```