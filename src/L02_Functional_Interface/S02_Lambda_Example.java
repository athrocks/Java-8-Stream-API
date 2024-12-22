package L02_Functional_Interface;

@FunctionalInterface
interface Shape{
    void draw();
}

public class S02_Lambda_Example {

    public static void main(String[] args) {
        Shape Circle = () -> System.out.println("Circle draw method called");
        Circle.draw();
    }

}
