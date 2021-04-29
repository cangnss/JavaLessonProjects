package classes;

public class Main {

	public static void main(String[] args) {
		//class are reference type.
		
		//if there is unused memory, it is deleted by garbage collector. 
		CustomerManager customerManager;//CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2; // both of variables shows same heaps.
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//value
		int number1 = 10;
		int number2 = 20;
		number2 = number1;
		number1 = 30;
		System.out.println(number2);
		
		//reference, arrays are reference type. 
		int[] numbers1 = new int[] {1,2,3};
		int[] numbers2 = new int[] {4,5,6};
		numbers2 = numbers1;
		numbers1[0] = 10;
		System.out.println(numbers2[0]);
	}

}


