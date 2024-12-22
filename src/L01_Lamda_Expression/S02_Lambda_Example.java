package L01_Lamda_Expression;

public class S02_Lambda_Example {
    public static void main(String[] args) {
        String str = "hello world";

        Shape trapezium = () -> System.out.println("Trapezium Draw method");
        trapezium.draw();
    }
}
