import java.util.List;

public class CourseConsoleWrite implements SubjectsWriteInterface{

	@Override
	public String report(List<Course> subjects) {
		StringBuilder builder = new StringBuilder();
		builder.append("Which subject would you like to enroll? \n");
		
		for(int i = 0; i < subjects.size(); i++){
			builder.append(subjects.get(i).getCourseName() + "\n");
		}
		builder.append("Subject:\n");
		return builder.toString();
	}
}
