public class CodingHours {
    public static void main(String[] args) {

// An average Green Fox attendee codes 6 hours daily
// The semester is 17 weeks long
//
// Print how many hours is spent with coding in a semester by an attendee,
// if the attendee only codes on workdays.
//
// Print the percentage of the coding hours in the semester if the average
// work hours weekly is 52


        int hours = 5 * 6 * 17;
        System.out.println("hours spent with coding in a semester: " + hours);

        double workHours = 52 * 17;
        System.out.println("Hours spent here: " + workHours);
        double codeHours = ((hours / workHours) * 100);
        System.out.println("the percentage of the coding hours in the semester: " + codeHours + "%");
    }
}
