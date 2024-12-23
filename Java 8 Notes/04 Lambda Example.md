
## 1. Without Lambda Expression Example

```java
package L01_lamda;  
  
interface Shape {  
    void draw();  
}  
  
class Circle implements Shape{  
    @Override  
    public void draw() {  
        System.out.println("Circle Class Draw method");  
    }  
}  
  
class Square implements Shape{  
    @Override  
    public void draw() {  
        System.out.println("Square Class Draw method");  
    }  
}  
  
class Rectangle implements Shape{  
    @Override  
    public void draw() {  
        System.out.println("Rectangle Class Draw method");  
    }  
}  
  
  
public class Without_Lambda_Example {  
    public static void main(String[] args) {  
        Rectangle rectangle = new Rectangle();  
        rectangle.draw();  
  
        Square square = new Square();  
        square.draw();  
  
        Circle circle = new Circle();  
        circle.draw();  
    }  
}
```

```output
Rectangular Class Draw method
Square Class Draw method
Circle Class Draw method
```

---
## 2. Using Lambda Expression Example

```java
public interface Shape {  
    void draw();  
}
```

```java
public class Lambda_Example {  
	public static void main(String[] args) {  
	    String str = "hello world";  
		
		// Shape trapezium = () -> {
		//     System.out.println("Trapezium Draw method");
	    // }
	    
	    // if one line body then curly bracket also not needed
		Shape trapezium = () -> System.out.println("Trapezium Draw method");
		trapezium.draw();  
	}
}
```

```output
Trapezium Draw method
```

- See we did not need to create classes using lambda expression we brought same result.

---

## 3.Lambda Expression as Parameter

```java
public class Lambda_Example {  
    public static void main(String[] args) {  
        String str = "hello world";  
        
        Shape trapezium = () -> System.out.println("Trapezium Draw method");  
        
        print(trapezium); // Lambda Method as parameter
    }  
    
    private static void print(Shape shape) {  
        shape.draw();  
    }  
}
```

#### OR

```java
public class Lambda_Example {  
    public static void main(String[] args) {  
        String str = "hello world";  
        
        print(() -> System.out.println("Trapezium draw method")); 
    }  
    
    private static void print(Shape shape) {  
        shape.draw();  
    }  
}
```

---

## 4. Passing parameters to Lambda Expression

#### a. Traditional Way without using Lambda

```java
interface Addable{  
    int add(int a,int b);  
}  
  
class Add implements Addable{  
    @Override  
    public int add(int a, int b) {  
        return a+b;  
    }  
}  
  
public class S04_Parameter_To_Lambda {  
    public static void main(String[] args) {  
        Add obj = new Add();  
        int result = obj.add(1,2);
        System.out.println("Addition of a & b returns: " + result);  
    }  
}
```

```output
Addition of a & b returns: 3
```
#### b. Using Lambda

```java
interface Addable{  
    int addMethod(int a,int b);  
}  
  
public class S04_Parameter_To_Lambda {  
    public static void main(String[] args) {  
  
//        Addable add = (int a,int b) -> {  
//            return a+b;  
//        };  
  
//        Addable add = (int a,int b) -> (a+b);  
        Addable add = (a,b) -> (a+b);  
        int result = add.addMethod(1,2);
        System.out.println("Addition of a & b returns: " + result);  
    }  
}
```

```output
Addition of a & b returns: 3
```

---

## 5. Lambda Expression to implement Runnable Interface

#### a. Without Lambda Expression

```java
class ThreadDemo implements Runnable {  
  
    @Override  
    public void run() {  
        System.out.println("run Method called....");  
    }  
}  
  
public class S05_Runnable_Lambda_Example {  
    public static void main(String[] args) {  
        Thread thread = new Thread(new ThreadDemo());  
        thread.start();  
    }  
}
```

```output
run Method called....
```

#### b. With Lambda Expression

```java
public class S05_Runnable_Lambda_Example {  
    public static void main(String[] args) {  
        
        Runnable r = () -> {  
            System.out.println("run method called using lambda.....");  
        };  
        
        Thread t1 = new Thread(r);  
        
        t1.start();  
    }  
}
```

##### OR

```java
public class S05_Runnable_Lambda_Example {  
    public static void main(String[] args) {  
        
        Thread t1 = new Thread(() -> System.out.println("run method called using 
        lambda"));  
        
        t1.start();  
    }  
}
```

```output
run method called using lambda.....
```

Note:- Behind the scenes Runnable interface is functional interface with one abstract run() method.

---

## 6. 