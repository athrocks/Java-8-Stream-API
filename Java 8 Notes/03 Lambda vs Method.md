
  
1. Method is always belongs to class or object in Java where as Lambda does not  
   belongs to any class or object

2. Method has the main parts:  
    - Name    
    - Parameter list    
    - Body    
    - Return Type  

```java
public static void print(String text, PrintWriter writer) {       
	writer.write(text);        
}  

// print ---> Name
// (String text, PrintWriter writer)  ---> Parameter List
// writer.write(text); ---> Body
// void ---> return type
```

3. Lambda expression in Java has these main parts:  
    - No Name 
    - As Lambda is an anonymous function so no need to have a name    
    - Parameter list   
    - Body 
    - This is the main part of the function   
    - No Return Type 
    - You don't need mention the return type in the lambda    expression. 
    - The Java 8+ compiler is infer the return type by checking the code.  
```java
Addable withLambdaD = (int a,int b) -> (a+b); 

// (int a,int b) ---> Parameter List
// (a+b) ---> Body
```

4. Lambda Expression Syntax

```java

() -> {}

// () ----> Lamda Input Parameters
// -> ---->  Arrow (Denoting Lambda)
// {} ----> Lambda Body
```

