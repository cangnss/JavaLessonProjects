package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		/*TeacherCrediCalculator teacherCredi = new TeacherCrediCalculator();
		teacherCredi.Calculate();*/
		
		CrediUI crediUi = new CrediUI();
		crediUi.CrediCalculate(new SoldierCrediCalculator());
	}

}
