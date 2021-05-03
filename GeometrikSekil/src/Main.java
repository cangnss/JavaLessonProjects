
public class Main {

	public static void main(String[] args) {

		daire daireNesnesi = new daire();
		dikdortgen dikdortgenNesnesi = new dikdortgen();
		ucgen ucgenNesnesi = new ucgen();
		
		daireNesnesi.bilgi(5.0);
		System.out.println(daireNesnesi.isimGetir() + ":");
		System.out.println(daireNesnesi.alanHesap());
		
	}

}
