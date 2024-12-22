package L06_Java8_Stream_APIs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class S05_findFirst_and_findAny_methods {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList( 2, 1, 6, 3);

        Optional<Integer> element = list.stream().findFirst();

        if (element.isPresent()){
            System.out.println(element.get());
        }else {
            System.out.println("Stream is empty");
        }

        list.stream().findAny();

        if (element.isPresent()){
            System.out.println(element.get());
        }else {
            System.out.println("Stream is empty");
        }

    }
}
