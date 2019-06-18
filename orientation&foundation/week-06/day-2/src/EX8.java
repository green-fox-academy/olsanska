import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EX8 {
    public static void main(String[] args) {
        List<Character> chars = Arrays.asList('H', 'e', 'l', 'l', 'o');
        String hello = chars.stream().map(n -> n.toString()).collect(Collectors.joining());
        System.out.println(hello);
    }
}
/*
Write a Stream Expression to concatenate a Character list to a string!
 */