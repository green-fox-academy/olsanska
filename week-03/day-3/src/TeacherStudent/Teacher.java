package TeacherStudent;

public class Teacher {
    public Teacher(){

    }

    public String teach(Student student){
        return student.learn();
    }

    public String answer(){
        return "Sending help";
    }
}
