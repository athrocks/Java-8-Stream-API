
### Java Optional Class

- As a Java programmer, we are familiar with NullPointerException

- Java 8 has introduced a new Optional utility class in java.util package. This class can help in avoiding null checks and NullPointerException exceptions.

- You can view Optional as a single-value container that either contains a value or doesn't (it is then said to be "empty")

	![[Pasted image 20241221215848.png]]

---

### Before Optional Class

```java
class Employee{
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private Long phoneNo;
}
```

```java
Employee employee = getEmployee();

String email = employee.getEmail(); // if employee is null
String result = email.toLowerCase(); // null pointer exception

if(employee != null){

if(employee.getEmail() != null){
	String result = email.toLowerCase();
}

```

- In order to avoid null pointer exception we used to add null checks and lot of extra null checks code , Hence Optional<> introduced.

---

- Check [Optional Class Java Doc](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)

```java
public final class Optional<T> extends Object
```

- It is final Class which means you can not extend Optional Class.

---

```java

public class Optional_Demo {  
    public static void main(String[] args) {  
  
        Optional<Object> emptyOptional = Optional.empty();  
        System.out.println(emptyOptional); // Optional.empty  
        System.out.println(emptyOptional.isPresent()); // false  
        System.out.println(emptyOptional.isEmpty()); // true  
  
        String email = "atharva@abc.com";  
        emptyOptional = Optional.of(email);  
        System.out.println(emptyOptional); // Optional[atharva@abc.com]  
  
        email = null;  
        Optional<String> stringOptional = Optional.ofNullable(email);  
        System.out.println(stringOptional); // Optional.empty  
  
        email = "atharva@abc.com";  
        Optional<String> stringOptional2 = Optional.ofNullable(email);  
        System.out.println(stringOptional2); // Optional[atharva@abc.com]  
        System.out.println(stringOptional2.get()); // atharva@abc.com  
  
//        email = null;  
//        stringOptional2 = Optional.ofNullable(email);  
//        System.out.println(stringOptional2.get()); // throws "No value present" exception  
  
        email = null;  
        emptyOptional = Optional.empty();  
        if (emptyOptional.isPresent()) {  
            System.out.println(emptyOptional.get());  
        }else {  
            System.out.println("Empty Email"); // Empty Email  
        }  
  
        // getting default values from optional class object if no values provided  
        email = null;  
        stringOptional = Optional.ofNullable(email);  
        System.out.println(stringOptional.orElse("Default Value")); // Default Value  
  
        System.out.println(stringOptional.orElseGet(() -> "default Value through lambda")); // default Value through lambda  
  
        stringOptional.orElseThrow(() -> new IllegalArgumentException("email dose not exist"));  
  
    }  
}
```