package L04_Optional_Class;

import java.util.Optional;
import java.util.function.Supplier;

public class Optional_Demo {
    public static void main(String[] args) {

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional); // Optional.empty
        System.out.println(emptyOptional.isPresent()); // false
        System.out.println(emptyOptional.isEmpty()); // true

        String email = "atharva@abc.com";
        emptyOptional = Optional.of(email);
        System.out.println(emptyOptional); // Optional[atharva@abc.com]

        email = null;
        Optional<String> stringOptional = Optional.ofNullable(email);
        System.out.println(stringOptional); // Optional.empty

        email = "atharva@abc.com";
        Optional<String> stringOptional2 = Optional.ofNullable(email);
        System.out.println(stringOptional2); // Optional[atharva@abc.com]
        System.out.println(stringOptional2.get()); // atharva@abc.com

//        email = null;
//        stringOptional2 = Optional.ofNullable(email);
//        System.out.println(stringOptional2.get()); // throws "No value present" exception

        email = null;
        emptyOptional = Optional.empty();
        if (emptyOptional.isPresent()) {
            System.out.println(emptyOptional.get());
        }else {
            System.out.println("Empty Email"); // Empty Email
        }

        // getting default values from optional class object if no values provided
        email = null;
        stringOptional = Optional.ofNullable(email);
        System.out.println(stringOptional.orElse("Default Value")); // Default Value

        System.out.println(stringOptional.orElseGet(() -> "default Value through lambda")); // default Value through lambda

        stringOptional.orElseThrow(() -> new IllegalArgumentException("email dose not exist"));

    }
}
