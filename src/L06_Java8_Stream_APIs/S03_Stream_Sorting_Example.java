package L06_Java8_Stream_APIs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class S03_Stream_Sorting_Example {
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

        System.out.println("*****************************************");


        // here lambda replaced with Method Reference
        fruitsList = fruits.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(fruitsList);

        System.out.println("*****************************************");


        // by default Ascending
        fruitsList = fruits.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(fruitsList);

        System.out.println("*****************************************");


        // Descending Order

        fruitsList = fruits.stream()
                .sorted((op1,op2) -> op2.compareTo(op1))
                .collect(Collectors.toList());
        System.out.println(fruitsList);

        System.out.println("*****************************************");

        // here lambda replaced with Method Reference
        fruitsList = fruits.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(fruitsList);

        System.out.println("--------------------------------------------------");


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"def",27,8000));
        employees.add(new Employee(2,"abc",21,3000));
        employees.add(new Employee(3,"jkl",18,2000));
        employees.add(new Employee(4,"ghi",20,4000));

        // sort Employees on basis of salary in ascending Order

        // anonymous implementation of Comparator
        List<Employee> employeesSortedList = employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) o1.getSalary() - o2.getSalary();
            }
        }).toList();

        employeesSortedList.forEach(System.out::println);

        System.out.println("*****************************************");

        // replace anonymous method by lambda expression
        employeesSortedList = employees.stream().sorted((o1, o2) -> (int) o1.getSalary() - o2.getSalary()).toList();
        employeesSortedList.forEach(System.out::println);

        System.out.println("*****************************************");

        // better implementation
        employeesSortedList = employees.stream().sorted((o1, o2) -> Integer.compare(o1.getSalary(), o2.getSalary())).toList();
        employeesSortedList.forEach(System.out::println);

        System.out.println("*****************************************");

        // or
        employeesSortedList = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary)).toList();
        employeesSortedList.forEach(System.out::println);


        System.out.println("--------------------------------------------------");

        // sort Employees on basis of salary in descending Order

        // anonymous implementation of Comparator
        employeesSortedList = employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) o2.getSalary() - o1.getSalary();
            }
        }).toList();

        employeesSortedList.forEach(System.out::println);

        System.out.println("*****************************************");

        // replace anonymous method by lambda expression
        employeesSortedList = employees.stream().sorted((o1, o2) -> (int) o2.getSalary() - o1.getSalary()).toList();
        employeesSortedList.forEach(System.out::println);

        System.out.println("*****************************************");

        // better implementation
        employeesSortedList = employees.stream().sorted((o1, o2) -> Integer.compare(o2.getSalary(), o1.getSalary())).toList();
        employeesSortedList.forEach(System.out::println);

        System.out.println("*****************************************");

        // or
        employeesSortedList = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).toList();
        employeesSortedList.forEach(System.out::println);

        System.out.println("--------------------------------------------------");

    }
}

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
