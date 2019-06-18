import java.util.Map;
import java.util.stream.Collectors;

public class EX9 {
    public static void main(String[] args) {
     String text = "hello";
        Map<Character, Long> characterFrequency = text.chars()  // creates an IntStream
                .mapToObj(c -> (char) c) // converts the IntStream to Stream<Character>
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(characterFrequency);
    }
}
/*
Write a Stream Expression to find the frequency of characters in a given string!
 */
