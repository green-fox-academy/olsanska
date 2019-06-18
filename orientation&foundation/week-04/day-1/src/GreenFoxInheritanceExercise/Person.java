package GreenFoxInheritanceExercise;

public class Person {
    protected String name;
    protected int age;
    protected String gender;

    public String introduce() {
        return "Hi, I'm " + name + ", a " + age + " year old " + gender + ".";
    }
/*
    public String getName() {
        return name;
    }
*/
    public String getGoal() {
        return "My goal is: Live for the moment!";
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }
}
