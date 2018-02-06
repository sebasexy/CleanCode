
public class Course {
	/*
	 * Variables declaration
	 */
	private String courseName;
	private int courseSemester;
	
	/*
	 * Constructor with parameters
	 */	
	public Course(String course, int semester){
		this.courseName = course;
		this.courseSemester = semester;
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
