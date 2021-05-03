package abstractExample1;
import java.util.Scanner;

public class Futbolcu extends Sporcu{
	private String clup;
	private double salary;
	private int ranking;
	Scanner girdi = new Scanner(System.in);

	public Futbolcu() {
		System.out.println("Futbolcu");
	}
	@Override
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
