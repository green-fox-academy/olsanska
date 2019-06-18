public class GreatestCommonDivisor {
    public static void main(String[] args) {

        int first = 315;
        int second = 30;
        int divisor = 0;

        if (first < second){
            divisor = first;
        } else {
            divisor = second;
        }

        System.out.println(GCD(first, second, divisor));

    }

    public static int GCD(int first, int second, int divisor){
        if ( first % divisor == 0 && second % divisor == 0){
            return divisor;
        }
        return GCD(first, second, divisor - 1);
    }
}

//Find the greatest common divisor of two numbers using recursion.