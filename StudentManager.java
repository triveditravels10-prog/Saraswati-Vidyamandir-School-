import java.util.ArrayList;

class Student {
    String name;
    String studentClass;
    String achievement;

    Student(String name, String studentClass, String achievement) {
        this.name = name;
        this.studentClass = studentClass;
        this.achievement = achievement;
    }

    void showDetails() {
        System.out.println(name + " | " + studentClass + " | " + achievement);
    }
}

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Rohan Kumar","10th","Topper in Math"));
        students.add(new Student("Anjali Singh","9th","Debate Champion"));

        for(Student s : students){
            s.showDetails();
        }
    }
}
