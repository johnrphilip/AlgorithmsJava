import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SensitiveInfoManager {
    private HashMap<Integer, String> idToNameMap;
    private List<Student> students;

    public SensitiveInfoManager() {
        idToNameMap = new HashMap<>();
        students = new ArrayList<>();
    }

    public void addNameForStudent(int id, String name) {
        idToNameMap.put(id, name);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAttendanceChecklist() {
        for (Student student : students) {
            String name = idToNameMap.get(student.getId());
            System.out.println("ID: " + student.getId() + ", Name: " + name + ", [ ] Present [ ] Absent");
        }
    }

    // Other methods to manage sensitive information as needed
}
