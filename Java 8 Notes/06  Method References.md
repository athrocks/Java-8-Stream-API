
### 1. Method References

- Java provides a new feature called method reference in Java 8.

- Method reference is used to refer method of the functional interface. It is a compact and easy form of a lambda expression.

- Each time when you are using a lambda expression ***to just referring a method***, you can replace your lambda expression with a method reference.

```java
// Using lambda
Printable printableLambda = (String msg) -> System.out.println(msg);
printableLambda.print("Hello");

// Using Method References
Printable printable = System.out :: println;
printable.print("Hello");
```

---
### 2. Types of Method References

- There are four types of method references in Java:

1. Method reference to static method , its syntax is 

```java
Class :: StaticMethodName
```

2. Reference to an instance method of a particular object , the syntax is 

```java
Object :: instanceMethodName
```

3. Reference to an instance method of an arbitrary object of specific type, the syntax is 

```java
Class :: instanceMethodName
```

4. Reference to a constructor , its syntax is 

```java
ClassName :: new
```

---

#### 1. Method reference to static method 
- Example 1

```java
```java
public class S01_Static_Method_Reference {  
  
    public static void main(String[] args) {  
        // Lambda Expression  
        Function<Integer, Double> functionLambda = (a) -> Math.sqrt(a);  
        double ans = functionLambda.apply(5);  
        System.out.println("Square root of 5 is: " + ans);  
  
        // Method Reference  
        // Note:- sqrt is static method of Math Class.
        Function<Integer, Double> functionMethodReference = Math::sqrt;  
        double ans2 = functionMethodReference.apply(5);  
        System.out.println("Square root of 5 is: " + ans2);  
    }  
}
```

- Example 2

```java
public class S01_Static_Method_Reference {  
  
    // Static Method
    public static double multiplication(double a, double b){  
        return a*b;  
    }  
  
    public static void main(String[] args) {  
        // Lambda Expression  
        BiFunction<Double, Double, Double> biFunctionLambda = (a, b) -> (a * b);  
        double ans3 = biFunctionLambda.apply(5.0, 5.0);  
        System.out.println("Multiplication of 5 & 5 is: " + ans3);  
		
		// Method Referece
		BiFunction<Double, Double, Double> biFunctionMethodReference  
                = S01_Static_Method_Reference::multiplication;  
        biFunctionMethodReference.apply(5.0, 5.0);  
        System.out.println("Multiplication of 5 & 5 is: " + 
        biFunctionMethodReference.apply(5.0, 5.0));  
    }  
}
```

---
#### 2. Reference to an instance method of a particular object 

- Example 1

```java
package L03_Method_References;  
  
@FunctionalInterface  
interface Printable{  
    void print(String message);  
}  
  
public class S02_Instance_Of_Object_Method_Reference {  
  
    public void display(String msg){  
        msg = msg.toUpperCase();  
        System.out.println(msg);  
    }  
  
    public static void main(String[] args) {  
        S02_Instance_Of_Object_Method_Reference obj = new S02_Instance_Of_Object_Method_Reference();  
  
        // Note:- display method should have same (return) and (parameter) type as  
        // abstract method of Functional Interface  
        // lambda Expression        Printable printableLambda = (msg) -> obj.display(msg);  
        printableLambda.print("Hello World");  
  
        // Method Reference  
        Printable printableMethodReference = obj::display;  
        printableMethodReference.print("Hello World");  
  
    }  
}
```

----
#### 3. Reference to an instance method of an arbitrary object of specific type

- Example 1

```java
public class S04_Instance_Of_Arbitary_Object_Method_Reference {  
    public static void main(String[] args) {  
  
        // Lambda Expression  
        // here input is called arbitary object as we are calling method of parameter passed (input)        Function<String,String> stringFunctionLambda = (String input) -> input.toLowerCase();  
        String op1 = stringFunctionLambda.apply("Hello World");  
        System.out.println(op1);  
  
        // Method Referecnce  
        Function<String,String> stringFunctionMethodReference = String::toLowerCase;  
        String op2 = stringFunctionMethodReference.apply("Hello World");  
        System.out.println(op2);  
    }  
}
```


- Example 2

```java
public static void main(String[] args) {  
    String[] strArray = {"A","E","I","O","U","a","e","i","o","u"};  
	
	// lambda Reference  
    Arrays.sort(strArray, (s1,s2) -> s1.compareTo(s2));  
    
    // method Refrence  
    Arrays.sort(strArray, String::compareTo);  
}
```

---
#### 4. Reference to a constructor 

- Example 1

```java
public class S04_Constructor_Method_Reference {  
    public static void main(String[] args) {  
        List<String> fruits = new ArrayList<>();  
        fruits.add("Apple");  
        fruits.add("Banana");  
        fruits.add("Orange");  
        fruits.add("Pear");  
        fruits.add("Grape");  
  
        // lambda Expression  
        Function<List<String>, Set<String>> setFunction = 
					        (fruitList) -> new HashSet<>(fruitList);  
        System.out.println(setFunction.apply(fruits));  
  
        // Method Reference  
        Function<List<String>, Set<String>> setFunction2 = HashSet::new;  
        System.out.println(setFunction2.apply(fruits));  
  
    }  
}
```

---
