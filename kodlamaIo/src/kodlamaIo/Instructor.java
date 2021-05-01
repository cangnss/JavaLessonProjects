package kodlamaIo;

public class Instructor extends User{
	
	private int id;
	String instructorLesson;
	
	public Instructor() {
		System.out.println("Instrucor's constructor executed.");
	}
	public Instructor(int id, String instructorLesson){
		this.id = id;
		this.instructorLesson = instructorLesson;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getInstructorLesson() {
		return instructorLesson;
	}
	public void setInstructorLesson(String instructorLesson) {
		this.instructorLesson = instructorLesson;
	}
}
