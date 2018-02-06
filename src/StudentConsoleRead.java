import java.util.List;
import java.util.Scanner;

public class StudentConsoleRead implements StudentReadInterface{

	@Override
	public Student getStudent() {
		Scanner scanner = new Scanner(System.in);
		Student student;
		System.out.println("----SCHEDULE-TEC----");
		System.out.println("Name: \n");
		String name = scanner.nextLine();
		System.out.println("Semester: \n");
		int semester = Integer.parseInt(scanner.nextLine());
		
		student = new Student(name, semester);
		
		return student;
	}
}
