import java.util.List;
import java.util.Scanner;

public class EnrollmentConsole implements Enrollment{
	
	private Student student;
	private List<Course> courses;
	private EnrollOutputInterface output;
	private String response;
	private String report;
	
	public EnrollmentConsole() {
		this.response = "";
		this.output = new EnrollmentOutput();
	}
	
	@Override
	public void enrollStudent(Student s, List<Course> courseList) {
		this.student = s;
		this.courses = courseList;
		Scanner scanner = new Scanner(System.in);
		while(!(response.equals("Exit"))){
			String rpt = this.report();
			System.out.println(rpt);			
			response = scanner.nextLine();
			for(Course c : courseList){
				if(c.getCourseName().equals(response)){
					String result = this.enrollLogic(s, c);
					System.out.println(result);
				}
			}
		}
		this.output.report(this.student);
	}

	@Override
	public String report(){
		StringBuilder builder = new StringBuilder();
		builder.append("Which subject would you like to enroll? \n");
		for(int i = 0; i < courses.size(); i++){
			builder.append(courses.get(i).getCourseName() + "\n");
		}
		builder.append("Subject:\n");
		return builder.toString();
	}
	
	@Override
	public List<Course> getCourses() {
		return this.courses;
	}

	@Override
	public String enrollLogic(Student s, Course c) {
		String response = "";
		if(s.getSememester() >= c.getCourseSemester()){
			response = "Done. good luck on your " + c.getCourseName() + " course\n";
			s.addCourse(c);
		}else{
			response = "Oh no, you can't enroll to " + c.getCourseName() + " until " + c.getCourseSemester() + " semester\n";
		}		
		return response;
	}
}
