package GreenFoxInheritanceExercise;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private String name;
    List<Student> studentList = new ArrayList<>();
    List<Mentor> mentorList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentorList.add(mentor);
    }

    public String info() {
        return "The " + name + " cohort has " + studentList.size() + " students and " + mentorList.size() + " mentors.";
    }

    public Cohort(String name) {
        this.name = name;
    }
}
