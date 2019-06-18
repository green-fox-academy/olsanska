import java.util.Scanner;
public class OddEvenBetty {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.
        // even = sudé
        // odd = liché
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("This number is even ");
        } else {

            System.out.println("This number is odd ");

        }

    }

}
