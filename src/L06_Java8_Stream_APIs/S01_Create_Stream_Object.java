package L06_Java8_Stream_APIs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class S01_Create_Stream_Object {
    public static void main(String[] args) {

        // create a stream
        Stream<String> stream = Stream.of("A", "B", "C");
        stream.forEach(System.out::println);

        // create a stream of sources

        // here collection is source
        Collection<String> collection = Arrays.asList("Java", "JavaScript", "Spring");
        Stream<String> stream2 = collection.stream();
        stream2.forEach(System.out::println);

        // here list is source
        List<String> list = Arrays.asList("Hellow", "Doguah", "Kaisam");
        Stream<String> stream3 = list.stream();
        stream3.forEach(System.out::println);

        // Stream from Arrays
        String[] stringArray = {"Ayo", "Bhaiyo", "Chayo"};
        Stream<String> stream4 = Arrays.stream(stringArray);
        stream4.forEach(System.out::println);
    }
}
