package reCapDemo_Classes;

public class Calculator {
	public int Sum(int number1, int number2) {
		return number1 + number2;
	}
	public int Minus(int number1, int number2) {
		return number1 - number2;
	}
	public int Multiply(int number1, int number2) {
		return number1*number2;
	}
	public int Division(int number1,int number2) {
		if(number2==0) {
			System.out.println("Dividing cannot zero.");
		}
		return number1/number2;
	}
}
