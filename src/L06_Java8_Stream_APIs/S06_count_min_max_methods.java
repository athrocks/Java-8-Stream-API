package L06_Java8_Stream_APIs;

import java.util.Comparator;
import java.util.stream.Stream;

public class S06_count_min_max_methods {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);

        long cnt = stream.count();
        System.out.println(cnt);


        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7,8,9);
        Integer integer = stream1.min(Comparator.comparing(Integer :: valueOf)).get();
        System.out.println("Min => " + integer);

        Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7,8,9);
        Integer max = stream2.max(Comparator.comparing(Integer :: valueOf)).get();
        System.out.println("MAX => "+ max);
    }
}
