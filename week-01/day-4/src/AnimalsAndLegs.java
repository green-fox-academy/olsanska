import java.util.Scanner;
public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chickens the farm has?");
        int a = scanner.nextInt();
        System.out.println("How many pigs are owned by the farmer?");
        int b = scanner.nextInt();

        int c = a * 2;
        int d = b * 4;
        int e = c + d;
        System.out.println("There are " + e + " legs.");
    }
}
