package kodlamaIo;

public class Student extends User{
	private int id;
	private String joinedCourse;
	private String className;
	
	public Student() {}
	
	public Student(int id, String joinedCourse, String className) {
		this.id = id;
		this.joinedCourse = joinedCourse;
		this.className = className;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getJoinedCourse() {
		return joinedCourse;
	}
	public void setJoinedCourse(String joinedCourse) {
		this.joinedCourse = joinedCourse;
	}
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
}
