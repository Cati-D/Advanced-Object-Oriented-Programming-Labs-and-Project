package streamsource;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Stream;

public class Ex1 {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 4, 6, 7, 8, 22, 33, 44);

        //using iteration
        for (int i : intList) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //using steam()
        Stream<Integer> s1 = intList.stream();
        s1.filter(i -> i%2 == 0).forEach(System.out::println);

        //empty
        long count = streamOf(new HashSet<>()).count();
        System.out.println(count);

        //bulder()
        Stream<String> streamWithBuilder = Stream.<String>builder().add("aa").add("aab").add("aabc").build();
        Optional<String> opt = streamWithBuilder
                .filter(s -> s.startsWith("a"))
                .max(Comparator.comparingInt(String::length));
        System.out.println(opt);

    }

    public static Stream<String> streamOf(Set<String> set) {
        return set == null || set.isEmpty() ? Stream.empty() : set.stream();
    }
}
