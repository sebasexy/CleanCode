
public class Course {
	
	private String courseName;
	private int courseSemester;
	
	public Course(String cName, int cSemester){
		this.courseName = cName;
		this.courseSemester = cSemester;
	}
	
	public String getCourseName(){
		return this.courseName;
	}
	
	public int getCourseSemester(){
		return this.courseSemester;
	}

	public static Course parse(String line){
		String[] parts = line.split(" ");
		Course course = new Course(parts[0], Integer.parseInt(parts[1]));
		return course;
	}
}
