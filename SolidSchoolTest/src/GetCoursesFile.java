import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GetCoursesFile implements GetCourses{
	
	private List<Course> courses;
	
	public GetCoursesFile() {
		courses = new ArrayList<>();
		this.retrieveCourses();
	}

	@Override
	public void retrieveCourses() {
		try{
			JFileChooser chooser = new JFileChooser();
			int returnVal = chooser.showOpenDialog(null);
			if(returnVal == JFileChooser.APPROVE_OPTION){
				try{
					BufferedReader br = new BufferedReader(new FileReader(chooser.getSelectedFile().getPath()));
					String line;
					while((line = br.readLine()) != null){
						String[] split = line.split(" ");
						String name = split[0];
						int semester = Integer.parseInt(split[1]);
						Course c = new Course(name, semester);
						courses.add(c);
					}
					br.close();
				}
				catch (Exception  e){
					System.out.println(e);
				}
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
	}

	@Override
	public List<Course> getCourses() {
		return this.courses;
	}

}
