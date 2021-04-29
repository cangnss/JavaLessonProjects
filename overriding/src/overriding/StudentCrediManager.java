package overriding;

public class StudentCrediManager extends BaseCrediManager{
	public double calculate(double price) {
		return price * 1.10;
	}
}
