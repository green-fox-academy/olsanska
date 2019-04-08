public class Sum {

    public static void main(String[] args) {

        System.out.println(sum(10));

    }

    public static int sum(int numbers) {
        int result = 0;
        for (int i = 0; i <= numbers; i++) {
            result += i;
        }
        return result;
    }

}

// Create the usual class wrapper and main method on your own.
// Write a function called `sum` that returns the sum of numbers from zero to the given parameter