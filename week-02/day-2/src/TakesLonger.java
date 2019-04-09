public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
        String splitter = "you";
        String[] splitted = quote.split(splitter);
        splitted[0] = splitted[0] + "always takes longer than ";
        String newRes = "";
        for (int i = 0; i < splitted.length; i++) {
            newRes += splitted[i];
            if (i != splitted.length - 1) {
                newRes += splitter;
            }
        }
        System.out.println(newRes);
    }
}

