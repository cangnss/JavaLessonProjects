package abstractExample1;
import java.util.Scanner;
public class Basketbolcu extends Sporcu{
	private String clup;
	private double salary;
	private int ranking;
	Scanner girdi = new Scanner(System.in);

	public Basketbolcu() {
		System.out.println("Basketbolcu");
	}
	
	public void bilgiAl() {
		this.clup = girdi.next();
		this.salary = girdi.nextDouble();
		this.ranking = girdi.nextInt();
		yazdir();

	}
	public void yazdir() {
		System.out.println("Kulüp: "+clup+"Maaþý: "+salary+"Sýralamasý: "+ranking);
	}
	
	


}
