import java.util.List;

public interface Enrollment {

	public List<Course> getCourses();
	public void enrollStudent(Student s, List<Course> c);
	public String report();
	public String enrollLogic(Student s, Course c);
}
