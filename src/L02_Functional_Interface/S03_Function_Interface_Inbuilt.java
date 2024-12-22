package L02_Functional_Interface;

import java.util.function.Function;

//class FunctionImpl implements Function<String, Integer> {
//    @Override
//    public Integer apply(String str) {
//        return str.length();
//    }
//}

public class S03_Function_Interface_Inbuilt {

    public static void main(String[] args) {

        Function<String,Integer> function = (String str) -> {
            return str.length();
        };

        int answer = function.apply("Hello");
        System.out.println(answer);
    }
}
