package streamsource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex3 {

    public static void main(String[] args) {

        IntStream streamOfChars = "abcdefghijklm".chars();
        streamOfChars.forEach(x -> System.out.println((char) x));

        Stream<String> streamOfStrings = Pattern.compile(", ").splitAsStream("a, b, c, d, r, y");
        Stream<String> streamOfLines = null;
        Path path = Paths.get("src\\streamsource\\Ex3.java");
        try {
           streamOfLines = Files.lines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        streamOfLines.forEach(System.out::println);

    }
}
