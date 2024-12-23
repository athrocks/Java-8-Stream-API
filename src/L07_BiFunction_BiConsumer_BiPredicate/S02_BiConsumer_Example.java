package L07_BiFunction_BiConsumer_BiPredicate;


import java.util.function.BiConsumer;

class BiConsumerDemo implements BiConsumer<Integer, Integer> {

    @Override
    public void accept(Integer integer, Integer integer2) {
        System.out.println(integer - integer2);
    }
}

public class S02_BiConsumer_Example {

    public static void main(String[] args) {
        // implementing interface then using
        BiConsumerDemo bc = new BiConsumerDemo();
        bc.accept(3, 2);

        // directly using BiConsumer itself
        BiConsumer<Double, Double> biConsumer = (a, b) -> System.out.println(a+b);
        biConsumer.accept(1.1, 2.2);
    }
}
