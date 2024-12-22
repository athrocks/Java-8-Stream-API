package L01_Lamda_Expression;

interface Shape {
    void draw();
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle Class Draw method");
    }
}

class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square Class Draw method");
    }
}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle Class Draw method");
    }
}


public class S01_Without_Lambda_Example {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Square square = new Square();
        square.draw();

        Circle circle = new Circle();
        circle.draw();
    }
}
