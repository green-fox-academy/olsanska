package GreenFoxInheritanceExercise;

public class Student extends Person {

    public String previousOrganization;
    public int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        skippedDays = 0;
    }

    public Student() {
        super();
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }

    public String getGoal() {
        return "Be a junior software developer.";
    }

    public String introduce() {
        return "Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.";
    }

    public void skippedDays(int days) {
        this.skippedDays = days;
    }
}


