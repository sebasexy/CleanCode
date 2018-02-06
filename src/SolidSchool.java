import java.util.ArrayList;
import java.util.List;

public class SolidSchool {
	
	private static SubjectsWriteInterface writer;
	private static SubjectsReadInterface reader;
	private static StudentReadInterface sReader;
	private static StudentWriteInterface sWriter;
	private static List<Course> courses;
	
	public static void main(String[] args){
		Course c1 = new Course("Math", 5);
		Course c2 = new Course("POO", 2);
		Course c3 = new Course("Architecture", 7);
		
		courses = new ArrayList<>();
		sReader = new StudentConsoleRead();
		
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
	
		sReader.getStudent();
		writer = new CourseConsoleWrite();
		
		System.out.println(writer.report(courses));
	}
}
