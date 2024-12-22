package L03_Method_References;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class S04_Constructor_Method_Reference {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pear");
        fruits.add("Grape");

        // lambda Expression
        Function<List<String>, Set<String>> setFunction = (fruitList) -> new HashSet<>(fruitList);
        System.out.println(setFunction.apply(fruits));

        // Method Reference
        Function<List<String>, Set<String>> setFunction2 = HashSet::new;
        System.out.println(setFunction2.apply(fruits));

    }
}
