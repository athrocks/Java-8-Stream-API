
### Java 8 Stream API

- Stream represents a sequence of objects from a source, which supports aggregate operations.
- Java provides a new additional package in Java 8 called java.util.stream.
- This package consists of classes, interfaces, and an enum to allows functional-style operations on the elements. 
- You can use stream by importing [java.util.stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html) package in your programs.

---

### How Streams work?

![[Pasted image 20241222120753.png]]


#### 1. Create Stream from Source

```java
public class S01_Create_Stream_Object {  
    public static void main(String[] args) {  
  
        // create a stream  
        Stream<String> stream = Stream.of("A", "B", "C");  
        stream.forEach(System.out::println);  
  
        // create a stream of sources  
  
        // here collection is source        
        Collection<String> collection = 
	        Arrays.asList("Java", "JavaScript", "Spring");  
        Stream<String> stream2 = collection.stream();  
        stream2.forEach(System.out::println);  
  
        // here list is source  
        List<String> list = Arrays.asList("Hellow", "Doguah", "Kaisam");  
        Stream<String> stream3 = list.stream();  
        stream3.forEach(System.out::println);  
  
        // Stream from Arrays  
        String[] stringArray = {"Ayo", "Bhaiyo", "Chayo"};  
        Stream<String> stream4 = Arrays.stream(stringArray);  
        stream4.forEach(System.out::println);  
    }  
}
```

---

### 2. Filtering using Stream API

##### Product Class

```java
class Product{  
  
    private int id;  
    private String name;  
    private double price;  
  
    public Product() {  
    }  
  
    public Product(int id, String name, double price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public void setId(int id) {  
        this.id = id;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public double getPrice() {  
        return price;  
    }  
  
    public void setPrice(double price) {  
        this.price = price;  
    }  
  
    @Override  
    public String toString() {  
        return "Product{" +  
                "id=" + id +  
                ", name='" + name + '\'' +  
                ", price=" + price +  
                '}';  
    }  
}
```

#### getProducts() Method in main Class

```java
private static List<Product> getProducts() {  
        List<Product> products = new ArrayList<>();  
        products.add(new Product(1,"HP",4000));  
        products.add(new Product(2,"Dell",5000));  
        products.add(new Product(3,"Asus",6000));  
        products.add(new Product(4,"Mac Book",7000));  
  
        return products;  
    }  
```

---

#### Question :- Find products with price more that 5000.

##### a. Traditionally without Filter

```java
public class S02_Stream_Filter_Example {  
    public static void main(String[] args) {  
  
        // filter products with price more than 5000  
  
        // Traditionally        
        List<Product> productList = new ArrayList<>();  
  
        List<Product> products = getProducts();  
  
        for (Product product : products) {  
            if (product.getPrice() > 5000){  
                productList.add(product);  
            }  
        }  
        for (Product product : productList) {  
            System.out.println(product);  
        }  
  
    private static List<Product> getProducts() {  
        // get products method
    }  
}  
  
class Product{  
  // product Class
}
```

##### b. Using Filter

```java
public class S02_Stream_Filter_Example {  
    public static void main(String[] args) {  
  
        // filter products with price more than 5000    
        List<Product> products = getProducts();  
 
  
        // Using Filter Method  
		
		// Stream<Product> productMoreThan5000 
		//	 = products.stream()
		//			  .filter(prd -> prd.getPrice() > 5000);  
        
        // productMoreThan5000.forEach(prd -> System.out.println(prd));  
  
        products.stream()  
                .filter(prd -> prd.getPrice() > 5000)  
                .collect(Collectors.toList())  
                .forEach(System.out::println);  
    }  
  
    private static List<Product> getProducts() {  
		// getProducts() method 
    }  
}  

class Product{  
  // product Class
}
```

---

### 3. Sorting Method 

##### Contents :-

1. Sorting List of String objects in Ascending order using Stream API
2. Sorting List of String objects in Descending order using Stream API
3. Sorting List of Employee objects (By Salary) in Ascending order using Stre'am API
4. Sorting List of Employee objects (By Salary) in Descending order using Stream API

---

```java
public static void main(String[] args) {  
    List<String> fruits = new ArrayList<>();  
    fruits.add("Apple");  
    fruits.add("Banana");  
    fruits.add("Orange");  
    fruits.add("Pear");  
    fruits.add("Watermelon");  
  
  
    List<String> fruitsList = fruits.stream()  
            .sorted((op1,op2) -> op1.compareTo(op2))  
            .collect(Collectors.toList());  
    System.out.println(fruitsList);  
  
    // here lambda replaced with Method Reference  
    fruitsList = fruits.stream()  
            .sorted(Comparator.naturalOrder())  
            .collect(Collectors.toList());  
    System.out.println(fruitsList);  
  
    // by default Ascending  
    fruitsList = fruits.stream()  
            .sorted()  
            .collect(Collectors.toList());  
    System.out.println(fruitsList);  
  
    // Descending Order  
  
    fruitsList = fruits.stream()  
            .sorted((op1,op2) -> op2.compareTo(op1))  
            .collect(Collectors.toList());  
    System.out.println(fruitsList);  
    // here lambda replaced with Method Reference  
    fruitsList = fruits.stream()  
            .sorted(Comparator.reverseOrder())  
            .collect(Collectors.toList());  
    System.out.println(fruitsList);  
  
}
```


##### Sorting Employee on basis of Salary

#### Employee Class

```java
class Employee {  
  
    private int id;  
    private String name;  
    private int age;  
    private int salary;  
  
  
    public Employee() {  
    }  
  
    public Employee(int id, String name, int age, int salary) {  
        this.id = id;  
        this.name = name;  
        this.age = age;  
        this.salary = salary;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public void setId(int id) {  
        this.id = id;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public int getAge() {  
        return age;  
    }  
  
    public void setAge(int age) {  
        this.age = age;  
    }  
  
    public int getSalary() {  
        return salary;  
    }  
  
    public void setSalary(int salary) {  
        this.salary = salary;  
    }  
  
    @Override  
    public String toString() {  
        return "Employee{" +  
                "id=" + id +  
                ", name='" + name + '\'' +  
                ", age=" + age +  
                ", salary=" + salary +  
                '}';  
    }  
}
```


```java
List<Employee> employees = new ArrayList<>();  
employees.add(new Employee(1,"def",27,8000));  
employees.add(new Employee(2,"abc",21,3000));  
employees.add(new Employee(3,"jkl",18,2000));  
employees.add(new Employee(4,"ghi",20,4000));  
```
###### a. Ascending Order

```java
// sort Employees on basis of salary in ascending Order  
  
// anonymous implementation of Comparator  
List<Employee> employeesSortedList = employees.stream().sorted(new Comparator<Employee>() {  
    @Override  
    public int compare(Employee o1, Employee o2) {  
        return (int) o1.getSalary() - o2.getSalary();  
    }  
}).toList();  
  
employeesSortedList.forEach(System.out::println);  
```

```java 
// replace anonymous method by lambda expression  
employeesSortedList = employees.stream().sorted((o1, o2) -> (int) o1.getSalary() - o2.getSalary()).toList();  
employeesSortedList.forEach(System.out::println);  
  
```

```java
  
// better implementation  
employeesSortedList = employees.stream().sorted((o1, o2) -> Integer.compare(o1.getSalary(), o2.getSalary())).toList();  
employeesSortedList.forEach(System.out::println);  
```

```java
// or  
employeesSortedList = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary)).toList();  
employeesSortedList.forEach(System.out::println);  
```

###### b. Descending Order

```java
// sort Employees on basis of salary in descending Order  
  
// anonymous implementation of Comparator  
employeesSortedList = employees.stream().sorted(new Comparator<Employee>() {  
    @Override  
    public int compare(Employee o1, Employee o2) {  
        return (int) o2.getSalary() - o1.getSalary();  
    }  
}).toList();  
  
employeesSortedList.forEach(System.out::println);  
```

```java
// replace anonymous method by lambda expression  
employeesSortedList = employees.stream().sorted((o1, o2) -> (int) o2.getSalary() - o1.getSalary()).toList();  
employeesSortedList.forEach(System.out::println);  
```

```java
  
// better implementation  
employeesSortedList = employees.stream().sorted((o1, o2) -> Integer.compare(o2.getSalary(), o1.getSalary())).toList();  
employeesSortedList.forEach(System.out::println);  
```
  
```java
// or  
employeesSortedList = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).toList();  
employeesSortedList.forEach(System.out::println);  
```

----

### 4. Mapping Methods

```java
public static void main(String[] args) {  
  
    List<String> alpha = Arrays.asList("a", "b","c","d");  
  
    //  Before Java8  
    List<String> alphaUpper = new ArrayList<>();  
    for (String s : alpha) {  
        alphaUpper.add(s.toUpperCase());  
    }  
    System.out.println(alpha); //[a, b, c, d]  
    System.out.println(alphaUpper); //[A, B, C, D]  
  
    // After Java 8    
    List<String> collect = alpha.stream().map(String :: 
    toUpperCase).toList();  
    System.out.println(collect); //[A, B, C, D]  
  
    // Streams apply to any data type.    
    List<Integer> num = Arrays.asList(1,2,3,4,5);  
    List<Integer> collect1 = num.stream().map(n -> n*2).toList();  
    System.out.println(collect1); //[2, 4, 6, 8, 10]  
}
```

----

Mapping User to UserDTO

###### User Class
```java
class User{  
    private int id;  
    private String username;  
    private String password;  
    private String email;  
  
    public User() {  
    }  
  
    public User(int id, String username, String password, String email) {  
        this.id = id;  
        this.username = username;  
        this.password = password;  
        this.email = email;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public void setId(int id) {  
        this.id = id;  
    }  
  
    public String getUsername() {  
        return username;  
    }  
  
    public void setUsername(String username) {  
        this.username = username;  
    }  
  
    public String getPassword() {  
        return password;  
    }  
  
    public void setPassword(String password) {  
        this.password = password;  
    }  
  
    public String getEmail() {  
        return email;  
    }  
  
    public void setEmail(String email) {  
        this.email = email;  
    }  
  
    @Override  
    public String toString() {  
        return "User{" +  
                "id=" + id +  
                ", username='" + username + '\'' +  
                ", password='" + password + '\'' +  
                ", email='" + email + '\'' +  
                '}';  
    }  
}
```

###### UserDTO Class
```java
class UserDTO{  
    private int id;  
    private String username;  
    private String email;  
  
    public UserDTO() {  
    }  
  
    public UserDTO(int id, String username, String email) {  
        this.id = id;  
        this.username = username;  
        this.email = email;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public void setId(int id) {  
        this.id = id;  
    }  
  
    public String getUsername() {  
        return username;  
    }  
  
    public void setUsername(String username) {  
        this.username = username;  
    }  
  
    public String getEmail() {  
        return email;  
    }  
  
    public void setEmail(String email) {  
        this.email = email;  
    }  
  
    @Override  
    public String toString() {  
        return "User{" +  
                "id=" + id +  
                ", username='" + username + '\'' +  
                ", email='" + email + '\'' +  
                '}';  
    }  
}
```

###### Main method
```java
public class Main {  
    public static void main(String[] args) {  
        // Mapping User to UsrDTO  
        List<User> users = new ArrayList<User>();  
        users.add(new User(1, "Ramesh", "secrete123", "ramesh@gmail.com"));  
        users.add(new User(2, "Tony", "secrete456", "tony@gmail.com"));  
        users.add(new User(3, "Tom", "secrete789", "tom@gmail:com"));  
  
        // Traditionally  
  
        List<UserDTO> userDTO = new ArrayList<UserDTO>();  
  
        for (User user : users){  
            userDTO.add(new UserDTO(user.getId(),user.getUsername(),user.getEmail()));  
        }  
  
        for (UserDTO userdto : userDTO){  
            System.out.println(userdto);  
        }  

  
        // Using Java 8 Map method  
        users.stream().map(new Function<User, UserDTO>() {  
            @Override  
            public UserDTO apply(User user) {  
                return 
                new UserDTO(user.getId(),user.getUsername(),user.getEmail());  
            }  
        }).toList().forEach(System.out::println);  
  
        // Using Lambda expression instead  
        users.stream()  
                .map((User user) ->  
                    new UserDTO(user.getId(),user.getUsername(),user.getEmail()))  
                .toList()  
                .forEach(System.out::println);  
  
    }  
}
```

---

### 5. findFirst() & findAny() Methods

```java
public static void main(String[] args) {  
    List<Integer> list = Arrays.asList(1, 2, 4, 6);  
  
    Optional<Integer> element = list.stream().findFirst();  
  
    if (element.isPresent()){  
        System.out.println(element.get());  
    }else {  
        System.out.println("Stream is empty");  
    }  
  
    list.stream().findAny();  
  
    if (element.isPresent()){  
        System.out.println(element.get());  
    }else {  
        System.out.println("Stream is empty");  
    }  
  
}
```

---

### 6. count() , min() & max() methods

```java
public static void main(String[] args) {  
    Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);  
  
    long cnt = stream.count();  
    System.out.println(cnt);  
  
  
    Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7,8,9);  
    Integer integer = stream1.min(Comparator.comparing(Integer :: valueOf)).get();  
    System.out.println("Min => " + integer);  
  
    Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7,8,9);  
    Integer max = stream2.max(Comparator.comparing(Integer :: valueOf)).get();  
    System.out.println("MAX => "+ max);  
}
```

---

### 7. forEach() method

```java

```