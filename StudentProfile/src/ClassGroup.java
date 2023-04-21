import java.util.ArrayList;

public class ClassGroup {
    private ArrayList<Student> students;

    public ClassGroup() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}