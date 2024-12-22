package L03_Method_References;

import java.util.Arrays;
import java.util.function.Function;

public class S03_Instance_Of_Arbitary_Object_Method_Reference {
    public static void main(String[] args) {

        // Lambda Expression
        // here input is called arbitary object as we are calling method of parameter passed (input)
        Function<String,String> stringFunctionLambda = (String input) -> input.toLowerCase();
        String op1 = stringFunctionLambda.apply("Hello World");
        System.out.println(op1);

        // Method Referecnce
        Function<String,String> stringFunctionMethodReference = String::toLowerCase;
        String op2 = stringFunctionMethodReference.apply("Hello World");
        System.out.println(op2);

        // Example 2
        String[] strArray = {"A","E","I","O","U","a","e","i","o","u"};

        // lambda Reference
        Arrays.sort(strArray, (s1,s2) -> s1.compareTo(s2));

        // method Refrence
        Arrays.sort(strArray, String::compareTo);

    }
}
