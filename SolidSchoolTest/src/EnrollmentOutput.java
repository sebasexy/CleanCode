
public class EnrollmentOutput implements EnrollOutputInterface{

	@Override
	public String report(Student student) {
		StringBuilder builder = new StringBuilder();
		builder.append("-----Enrollment " + student.getName() + "-----\n");
		for(Course c : student.getCourses()){
			builder.append(c.getCourseName() + "\n");
		}
		return builder.toString();
	}

}
