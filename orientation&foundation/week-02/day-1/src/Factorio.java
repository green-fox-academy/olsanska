public class Factorio {

        public static void main(String[] args) {

            System.out.println(Factorial(3));

        }

        public static int Factorial(int number) {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;
        }


}

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
// 10! = 3628800
