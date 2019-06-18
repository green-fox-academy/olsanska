public class PrimeNumbers {
    public static void main(String[] args) {

        int a = 1;
        for (int b = a; b <= 100; b++) {
            if (b % 5 == 0 & b % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (b % 3 == 0) {
                System.out.println("Fizz");
            } else if (b % 5 == 0) {
                System.out.println("Buzz");
            } else
                {
                System.out.println(b);
            }
        }

    }
}
