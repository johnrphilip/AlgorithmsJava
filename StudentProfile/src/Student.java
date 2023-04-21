import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {
    private static int lastAssignedId = 0;

    private int id;
    private String name;
    private String contactInfo;
    private LocalDate startDate;
    private HashMap<String, String> attendance;
    private Map<String, Map<String, Integer>> englishTestScores;
    private Map<String, Map<String, Object>> assignments;
  

    public Student(String name, String contactInfo) {
        this.id = ++lastAssignedId;
        this.name = name;
        this.contactInfo = contactInfo;
        this.startDate = LocalDate.now();
        this.attendance = new HashMap<>();
        this.englishTestScores = new HashMap<>();
        this.assignments = new HashMap<>();
       
    }

    // ... Other methods ...

    



    // Getter methods
    public int getId() {
        return id;
    }

    public Map<String, Map<String, Integer>> getEnglishTestScores() {
        return englishTestScores;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    // Methods to add test scores
    public boolean addEnglishTestScore(String testName, int score) {
        String currentDate = getCurrentDateString();
        if (isValidScore(score) && testName != null && !testName.trim().isEmpty()) {
            Map<String, Integer> testEntry = new HashMap<>();
            testEntry.put(testName, score);
            this.englishTestScores.put(currentDate, testEntry);
            return true;
        }
        return false;
    }


    public boolean addAssignment(Scanner scanner) {
        System.out.print("Enter the assignment name: ");
        String assignmentName = scanner.nextLine();

        System.out.print("Enter the date of the assignment (YYYY-MM-DD): ");
        String assignmentDateString = scanner.nextLine();
        LocalDate assignmentDate = LocalDate.parse(assignmentDateString);

        System.out.print("Enter the value for the assignment: ");
        String assignmentValue = scanner.nextLine();

        if (assignmentName != null && !assignmentName.trim().isEmpty() && assignmentValue != null && !assignmentValue.trim().isEmpty()) {
            String currentDate = getCurrentDateString();
            Map<String, Object> assignmentInfo = new HashMap<>();
            assignmentInfo.put("assignmentName", assignmentName);
            assignmentInfo.put("assignmentDate", assignmentDate);
            assignmentInfo.put("assignmentValue", assignmentValue);
            assignmentInfo.put("currentDate", LocalDate.now());

            if (!this.assignments.containsKey(assignmentName)) {
                this.assignments.put(assignmentName, new HashMap<>());
            }
            Map<String, Object> assignmentMap = this.assignments.get(assignmentName);
            assignmentMap.put(assignmentDateString, assignmentInfo);

            return true;
        }
        return false;
    }

    
    //method for attendance
    
    public boolean addAttendance(String status) {
        String currentDate = getCurrentDateString();
        if (isValidAttendanceStatus(status)) {
            this.attendance.put(currentDate, status);
            return true;
        }
        return false;
    }
    
    //helper methods
    private String getCurrentDateString() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return currentDate.format(dateFormatter);
    }

    
    //Data validation methods
    private boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }
    
    private boolean isValidAttendanceStatus(String status) {
        return status != null && (status.equalsIgnoreCase("Present") || status.equalsIgnoreCase("Absent"));
    }
    
    
    //create new student method
    public static Student createNewStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student contact info: ");
        String contactInfo = scanner.nextLine();

        return new Student(name, contactInfo);
    }

}


