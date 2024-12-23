package L06_Java8_Stream_APIs;

import java.util.*;

public class S07_forEach {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("tom",22));
        peopleList.add(new Person("jack",23));
        peopleList.add(new Person("jane",24));
        peopleList.add(new Person("john",25));
        peopleList.add(new Person("jane",26));


        // Prior Java 8
        for (Person person : peopleList) {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }

        // forEach + Lambda
        peopleList.forEach((person) ->{
            System.out.println(person.getName());
            System.out.println(person.getAge());
        });

        // After Java 8
        // Streams with forEach
        peopleList.stream().forEach((person) -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        });

        System.out.println("-------------------------------------");

        Set<Person> peopleSet = new HashSet<>(peopleList);

        for (Person person : peopleList) {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }

        peopleSet.forEach((person) -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        });

        peopleSet.stream().forEach((person) -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        });

        System.out.println("-------------------------------------");

        Map<Integer,Person> peopleMap = new HashMap<>();
        peopleMap.put(1,new Person("tom",22));
        peopleMap.put(2,new Person("jack",23));
        peopleMap.put(3,new Person("jane",24));
        peopleMap.put(4,new Person("john",25));

        // for Loop
        for (Map.Entry<Integer, Person> entry : peopleMap.entrySet()) {
            System.out.println("Id:- " + entry.getKey());
            System.out.println("Name:- " + entry.getValue().getName());
            System.out.println("Age:- " + entry.getValue().getAge());
        }

        peopleMap.forEach((key, value) -> {
            System.out.println("Id:- " + key);
            System.out.println("Name:- " + value.getName());
            System.out.println("Age:- " + value.getAge());
        });
    }
}

class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
