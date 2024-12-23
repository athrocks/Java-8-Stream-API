package L07_BiFunction_BiConsumer_BiProduct;

import java.util.Objects;
import java.util.function.BiPredicate;

class BiPredicateDemo implements BiPredicate<Double, Double> {


    @Override
    public boolean test(Double aDouble, Double aDouble2) {
        if (aDouble - aDouble2 == 0) return true;
        else return false;
    }
}

public class S03_BiPredicate_Example {
    public static void main(String[] args) {
        // implementing interface then using
        BiPredicate<Double, Double> biPredicateDemo = new BiPredicateDemo();
        System.out.println(biPredicateDemo.test(2.5, 2.0));

        // directly using BiPredicate itself
        BiPredicate<Double, Double> biPredicateDemo2 = (a,b) -> a.equals(b);
        System.out.println(biPredicateDemo2.test(2.1, 2.1));
    }
}
