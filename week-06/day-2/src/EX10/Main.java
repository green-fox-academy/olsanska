package EX10;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Fox> foxes = Arrays.asList(
                new Fox("Jo", "pink", 20),
                new Fox("Bo","green", 12),
                new Fox("Fo", "green", 10),
                new Fox("Ro", "lilac", 50),
                new Fox("Zo", "blue", 25));

        foxes.stream()
                .filter(n -> n.color.equals("green"))
                .map(n -> n.getName())
                .forEach(System.out::println);
    }
}
/*
Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:

Write a Stream Expression to find the foxes with green color!
Write a Stream Expression to find the foxes with green color, and age less then 5 years!
Write a Stream Expression to find the frequency of foxes by color!
 */