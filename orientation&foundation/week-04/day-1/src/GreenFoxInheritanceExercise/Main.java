package GreenFoxInheritanceExercise;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
        people.add(jane);
        Student student = new Student();
        people.add(student);
        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
        people.add(gandhi);
        Mentor mentor = new Mentor();
        people.add(mentor);
        Sponsor sponsor = new Sponsor();
        people.add(sponsor);
        Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
        people.add(elon);

        student.skippedDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }

        for (int i = 0; i < 3; i++) {
            sponsor.hire();
        }

        for(Person person : people) {
            person.introduce();
            person.getGoal();
        }

        Cohort awesome = new Cohort("AWESOME");
        awesome.addStudent(student);
        awesome.addMentor(mentor);
        awesome.addMentor(gandhi);
        awesome.info();

        for (Person person : people) {
            System.out.println(person.introduce());
        }

        System.out.println("----------------------------------------");

        Student john = new Student("John", 20, "male", "BME");
        System.out.println(john.introduce());
        Student johnTheClone = john.clone();
        System.out.println(johnTheClone.introduce());


    }
}
