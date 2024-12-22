package L02_Functional_Interface;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class S05_Supplier_Interface_Inbuilt {

    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier = () -> {
            return LocalDateTime.now();
        };
        LocalDateTime timeNow = supplier.get();
        System.out.println(timeNow);
    }
}
