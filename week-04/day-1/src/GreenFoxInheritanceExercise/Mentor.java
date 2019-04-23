package GreenFoxInheritanceExercise;

public class Mentor extends Person {

    String level;

    public String getGoal() {
        return "Educate brilliant junior software developers.";
    }

    public String introduce() {
        return "Hi, I'm " + name + ", a " + age + " year old " + gender + level + " mentor.";
    }

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        super();
        level = "intermediate";
    }
}
