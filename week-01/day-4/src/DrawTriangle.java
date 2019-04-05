import java.util.Scanner;
public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number: ");
        int a = scanner.nextInt();
        String star = "*";
        String secondStar = "*";
        for (int b = 1; b <= a; b++) {
            System.out.println(star);
            for (int c = 0; c <= a; c++) {

                System.out.println(secondStar);
        }
            }
        }
    }
