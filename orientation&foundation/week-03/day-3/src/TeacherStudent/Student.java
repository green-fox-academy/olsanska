package TeacherStudent;

public class Student {
    public Student(){
    }

    public String learn(){
        return "Receiving help";
    }

    public String question(Teacher teacher){
        String quest = "Send help?";
        return teacher.answer();
    }
}
