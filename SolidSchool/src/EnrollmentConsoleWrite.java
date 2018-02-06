import java.util.List;

public class EnrollmentConsoleWrite implements StudentWriteInterface {

	@Override
	public String report(Student student, List<Course> courses) {
		StringBuilder builder = new StringBuilder();
		builder.append("----- Enrollment " + student.getName() + " -----");
		for(Course c : courses){
			builder.append(c.getCourseName());
		}
		return builder.toString();
	}
	

}
