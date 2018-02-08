import java.util.Scanner;

public class StudentInfoConsole implements StudentInfo{
	
	private Student student;
	private String name;
	private int semester;
	
	/** 
	 * studentInfo() - gets the information of the student from console
	 * 
	 */
	
	public StudentInfoConsole() {
		this.studentInfo();
	}

	@Override
	public void studentInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("----SCHEDULE-TEC----");
		System.out.println("Name:");
		this.name = scanner.nextLine();
		System.out.println("Semester:");
		this.semester = Integer.parseInt(scanner.nextLine());
		this.student = new Student(name, semester);
	}

	@Override
	public Student getStudent() {
		return this.student;
	}
}
