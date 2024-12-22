package L02_Functional_Interface;

@FunctionalInterface
public interface S01_My_Functional_Interface {
    void print(String message);

    default void println(String message) {
        System.out.println(message + "in default method");
    }

    static void printMethod(String message) {
        System.out.println(message + "in static method");
    }
}
