import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    // Create a new student
	    Student student = Student.createNewStudent(scanner);

	    // Add an assignment
	    student.addAssignment(scanner);
	}
}