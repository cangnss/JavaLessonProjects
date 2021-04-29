package overriding;

public class Main {

	public static void main(String[] args) {
		/*TeacherCrediManager teacherCrediManager = new TeacherCrediManager();
		System.out.println(teacherCrediManager.calculate(1000));*/
		
		BaseCrediManager[] baseManagers = new BaseCrediManager[] {new TeacherCrediManager(),new FarmingCrediManager(),new StudentCrediManager()};
		for(BaseCrediManager baseManager : baseManagers) {
			System.out.println(baseManager.calculate(1000));
		}
	}

}
