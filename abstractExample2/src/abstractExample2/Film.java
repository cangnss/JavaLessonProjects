package abstractExample2;

public class Film extends Medya{
	
	public String ad;
	public int year;
	public int a;
	
	public Film(){
		System.out.println("Film");
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
		System.out.println("Film ad�: "+ad+"Film y�l�: "+year+"Film adedi: "+a);
	}

}
