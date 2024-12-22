package L06_Java8_Stream_APIs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S04_Stream_Mapping_Example1 {
    public static void main(String[] args) {

        List<String> alpha = Arrays.asList("a", "b","c","d");

        //  Before Java8
        List<String> alphaUpper = new ArrayList<>();
        for (String s : alpha) {
            alphaUpper.add(s.toUpperCase());
        }
        System.out.println(alpha); //[a, b, c, d]
        System.out.println(alphaUpper); //[A, B, C, D]

        // After Java 8
        List<String> collect = alpha.stream().map(String :: toUpperCase).toList();
        System.out.println(collect); //[A, B, C, D]

        // Streams apply to any data type.
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n*2).toList();
        System.out.println(collect1); //[2, 4, 6, 8, 10]
    }
}
