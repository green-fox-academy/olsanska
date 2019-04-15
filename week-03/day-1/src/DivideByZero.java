public class DivideByZero {
    public static void main(String[] args){
        int a = 0;
        try {
            divideByZero(a);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        }
    }
    public static void divideByZero(int number) {
    int result = 10 / number;
    System.out.println(result);
    }
}

// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
