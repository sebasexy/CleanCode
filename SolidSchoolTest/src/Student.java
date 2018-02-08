import java.util.ArrayList;
import java.util.List;

public class Student {

	private String name;
	private int semester;
	private List<Course> enrolledCourses;
	
	public Student(String name, int semester){
		this.name = name;
		this.semester = semester;
		this.enrolledCourses = new ArrayList<>();
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	
	public int getSememester(){
		return this.semester;
	}
	
	public void setSemester(int semester){
		this.semester = semester;
	}
	
	public List<Course> getCourses(){
		return this.enrolledCourses;
	}
	
	public void addCourse(Course c){
		this.enrolledCourses.add(c);
	}
}
