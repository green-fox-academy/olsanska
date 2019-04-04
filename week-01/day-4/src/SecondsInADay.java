public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int rHours = 24 - currentHours;
        int rMinutes = 60 - currentMinutes;
        int rSeconds = 60 - currentSeconds;

        int seconds = rSeconds + rMinutes * 60 + rHours * 60 * 60;
        System.out.println("Remaining seconds: " + seconds);



    }
}
