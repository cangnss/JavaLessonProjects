package abstractExample2;

public class Main {

	public static void main(String[] args) {
		Muzik muzik = new Muzik();
		muzik.isim("Ýþte kuzu kuzu");
		muzik.yil(2000);
		muzik.adet(1);
		muzik.yazdir();
		
		Film film = new Film();
		film.isim("LOTR");
		film.yil(2001);
		film.adet(3);
		film.yazdir();
		
	}

}
