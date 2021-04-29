package methodOverloading;

public class Main {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		System.out.println(calculator.Sum(5, 6));
		System.out.println(calculator.Sum(3, 4, 5));
	}

}
