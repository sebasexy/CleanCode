
public class Student {
	
	private String name;
	private int semester;
	
	public Student(String name, int semester){
		this.name = name;
		this.semester = semester;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getSemester(){
		return this.semester;
	}

}
