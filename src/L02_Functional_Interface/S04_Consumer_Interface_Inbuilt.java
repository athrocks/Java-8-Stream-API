package L02_Functional_Interface;

import java.util.function.Consumer;

public class S04_Consumer_Interface_Inbuilt {

    public static void main(String[] args) {
        Consumer<String> consumer = (String message) -> {
            System.out.println("Consumer Interface.... Message is: " + message);
        };
        consumer.accept("Hello World");
    }
}
