import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        String isUp = "Lamuerta"
                .chars()
                .filter((c) -> Character.isUpperCase(c))
                .collect(StringBuilder::new, // supplier
                        StringBuilder::appendCodePoint, // accumulator
                        StringBuilder::append) // combiner
                .toString();
        System.out.println(isUp);
    }
}
/*
Write a Stream Expression to find the uppercase characters in a string!
 */