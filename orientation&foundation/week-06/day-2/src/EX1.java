import java.util.Arrays;
import java.util.List;

public class EX1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    }
}
/*

EX1
Write a Stream Expression to get the even numbers from the following list:

List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

 */