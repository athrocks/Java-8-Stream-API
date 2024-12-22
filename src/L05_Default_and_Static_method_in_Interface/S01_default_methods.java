package L05_Default_and_Static_method_in_Interface;

interface Vehicle {
    void move();

    // Default method with implementation
    default void fuelEfficiency() {
        System.out.println("The vehicle has standard fuel efficiency.");
    }
}

class Car implements Vehicle {
    public void move() {
        System.out.println("The car is moving.");
    }

    @Override
    public void fuelEfficiency() {
        System.out.println("The car has excellent fuel efficiency.");
    }
}

class Bicycle implements Vehicle {
    public void move() {
        System.out.println("The bicycle is moving.");
    }
}

public class S01_default_methods {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.move();
        car.fuelEfficiency();

        Vehicle bike = new Bicycle();
        bike.move();
        bike.fuelEfficiency(); // Uses the default method because we did not implement it in Bicycle Class
    }
}
