package L03_Method_References;

import java.util.function.BiFunction;
import java.util.function.Function;

public class S01_Static_Method_Reference {

    public static double multiplication(double a, double b){
        return a*b;
    }

    public static void main(String[] args) {
        // Lambda Expression
        Function<Integer, Double> functionLambda = (a) -> Math.sqrt(a);
        double ans = functionLambda.apply(5);
        System.out.println("Square root of 5 is: " + ans);

        // Method Reference
        Function<Integer, Double> functionMethodReference = Math::sqrt;
        double ans2 = functionMethodReference.apply(5);
        System.out.println("Square root of 5 is: " + ans2);


        // Lambda Expression
        BiFunction<Double, Double, Double> biFunctionLambda = (a, b) -> (a * b);
        double ans3 = biFunctionLambda.apply(5.0, 5.0);
        System.out.println("Multiplication of 5 & 5 is: " + ans3);

        BiFunction<Double, Double, Double> biFunctionMethodReference
                = S01_Static_Method_Reference::multiplication;
        biFunctionMethodReference.apply(5.0, 5.0);
        System.out.println("Multiplication of 5 & 5 is: " + biFunctionMethodReference.apply(5.0, 5.0));
    }
}
