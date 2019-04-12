import java.util.Scanner;
public class animalslegsBetty {
        public static void main(String[] args) {
            // Write a program that asks for two integers
            // The first represents the number of chickens the farmer has
            // The second represents the number of pigs owned by the farmer
            // It should print how many legs all the animals have

            Scanner scanner = new Scanner(System.in);

            System.out.println("write the number of chickens on the farm" );
            int chickens = scanner.nextInt();
            System.out.println("write the number of pigs on the farm" );
            int pigs = scanner.nextInt();

            System.out.println(chickens * 2 + pigs * 4);



        }
    }

