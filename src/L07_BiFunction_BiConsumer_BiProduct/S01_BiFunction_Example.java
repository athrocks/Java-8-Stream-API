package L07_BiFunction_BiConsumer_BiProduct;

import java.util.function.BiFunction;

class BiFuntionDemo implements BiFunction<Integer, Integer, Double> {

    @Override
    public Double apply(Integer integer, Integer integer2) {
        return (double) (integer*integer2);
    }
}

public class S01_BiFunction_Example {
    public static void main(String[] args) {

        // implementing interface then using
        BiFuntionDemo bf = new BiFuntionDemo();
        System.out.println(bf.apply(1, 2));


        // directly using BiFunction itself
        BiFunction<Double, Double, Double> biFunction = (a, b) -> a + b;
        System.out.println(biFunction.apply(5.0, 5.0));
    }
}
