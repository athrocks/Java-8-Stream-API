
1. Functional interfaces were introduced in Java 8  

2. An Interface that contains exactly one abstract method is known as a functional interface. 

```java
Interface MyFunctionalInterface {        
	public void execute();  // -----> abstract method   
}     
```

3. abstract method -> a method which don't have any implementation,  
   any method in interface is by default abstract method.

4. You create a class which implements the interface then we override the method  
   to implement abstract method.

5. Functional interface can have any number of default, static methods but can contain only  
   one abstract method.   
   
```java
Interface MyFunctionalInterface {        
	public void execute();        
	
	publiC default void print(String text) {            
		System.out.primtin(text);        
	}  
	
	public static void print(String text, PrintWriter writer) {       
		writer.write(text);        
	}  
}
```