package L01_Lamda_Expression;

public class S03_Lambda_As_Parameter {
    public static void main(String[] args) {
        String str = "hello world";

    //  Shape trapezium = () -> System.out.println("Trapezium Draw method");
    //  print(trapezium);

        print(() -> System.out.println("Trapezium draw method"));
    }

    private static void print(Shape shape) {
        shape.draw();
    }
}