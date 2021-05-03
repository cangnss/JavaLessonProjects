package abstractExample2;

public class Muzik extends Medya{
	
	public String ad;
	public int year;
	public int a;
	
	public Muzik(){
		System.out.println("Müzik");
	}
	
	@Override
	public String isim(String ad) {
		return this.ad = ad;
	}

	@Override
	public int yil(int year) {
		return this.year = year;
	}

	@Override
	public int adet(int a) {
		return this.a = a;
	}
	
	public void yazdir() {
		System.out.println("Müzik adı:\n"+ad+"\nMüzik yılı:"+year+"\nMüzik adedi: "+a);
	}
}
