public class FizzBuzz {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.

        int a = 1;
        for (int b = a; b <= 100; b++) {
            if (b % 5 == 0 & b % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (b % 3 == 0) {
                System.out.println("Fizz");
            } else if (b % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(b);
            }
        }
        for (int b = a; b <= 100; b++) {
            String output = "";
            if (b % 3 == 0) {
                output = "Fizz";
            }
            if (b % 5 == 0) {
                output += "Buzz";
            }
            if (output.length() == 0) {
                output = "" + b;
            }
            System.out.println(output);
        }
    }
}





