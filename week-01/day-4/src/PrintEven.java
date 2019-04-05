public class PrintEven {
    public static void main(String[] args) {
        // Create a program that prints all the even numbers between 0 and 500

        int limit = 500;

        System.out.println("Printing Even numbers between 1 and " + limit);

        for (int i = 1; i <= limit; i++) {


            if (i % 2 == 0) {
                System.out.print(i + " ");
            }


        }
    }
}
