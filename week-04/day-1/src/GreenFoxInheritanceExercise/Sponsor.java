package GreenFoxInheritanceExercise;

public class Sponsor extends Person {

    String company;
    int hiredStudents;

    public String introduce() {
        return "Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.";
    }

    public void hire() {
        hiredStudents += 1;
    }

    public String getGoal() {
        return "Hire brilliant junior software developers.";
    }

    public Sponsor(String name, int age, String gender, String company) {
        hiredStudents = 0;
    }

    public Sponsor() {
        super();
        company = "Google";
        hiredStudents = 0;
    }
}
