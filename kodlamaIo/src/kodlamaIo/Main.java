package kodlamaIo;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1, "Ali Can","Güneþ","cgunes52@gmail.com","123456789","cangunes.jpg");
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Ýhsan");
		instructor.setLastName("Güneþ");
		instructor.setPassword("520652");
		instructor.setImage("ihsangunes.jpg");
		instructor.setInstructorLesson("Math");
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Cem");
		student.setLastName("Güneþ");
		student.setPassword("cemgunes123");
		student.setImage("cemgunes.jpg");
		student.setJoinedCourse("Math");
		student.setClassName("11D");
		
		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		instructorManager.add();
		instructorManager.list();
		instructorManager.instructorInfo();//this function is only available in instructorManager.
		studentManager.studentList();//this function is only available in studentManager.
		
		UserUI userUi = new UserUI();
		userUi.displayUI(instructorManager);
		
	}

}
