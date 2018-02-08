
public class SolidSchool {
	
	private static GetCourses courses;
	private static StudentInfo student;
	private static Enrollment enroll;
	private static EnrollOutputInterface output;
	
	public static void main(String[] args) {
		courses = new GetCoursesFile();
		student = new StudentInfoConsole();
		// System.out.println(student.getStudent().getName());
		enroll = new EnrollmentConsole();
		enroll.enrollStudent(student.getStudent(), courses.getCourses());
		output = new EnrollmentOutput();
		System.out.println(output.report(student.getStudent()));
	}

}
