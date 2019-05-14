import java.util.Arrays;
import java.util.List;

public class EX2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        numbers.stream().filter(x -> x > 0)
                .map(x -> (int)Math.pow(x, 2)).forEach(System.out::println);
    }
}
/*
Write a Stream Expression to get the squared value of the positive numbers from the following list:

List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
 */