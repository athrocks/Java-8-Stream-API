package L05_Default_and_Static_method_in_Interface;

interface MathOperations {
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}

public class S02_static_mehthods {
    public static void main(String[] args) {
        // Call static methods directly on the interface
        int sum = MathOperations.add(5, 10);
        int product = MathOperations.multiply(5, 10);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
