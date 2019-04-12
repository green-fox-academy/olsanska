import java.util.Scanner;
public class miletoKmBetty {
        public static void main(String[] args) {
            // Write a program that asks for an integer that is a distance in kilometers,
            // then it converts that value to miles and prints it
            Scanner scanner = new Scanner(System.in);
            System.out.println("write a number: ");
            int a = scanner.nextInt();

            System.out.println("your number in km = " + a * 0.621371192 + " miles");

        }
    }

