package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava cok guzel";
		String yeniMesaj = mesaj.substring(0,2);//0 dahil 2 dahil deðil. Baþlangýç dahil, bitiþ dahil deðil.
		System.out.println(yeniMesaj);
		int sayi = topla(5,7);
		System.out.println(sayi);
		String sehirVer = sehirVer();
		System.out.println(sehirVer);
		int toplam = topla2(1,2,3,4,5,6,7,8,9,10);
		System.out.println(toplam);
	}
	
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	
	public static int topla(int sayi,int sayi2) {
		return sayi+sayi2;
	}
	
	public static int topla2(int... sayilar) {//... variable args deniyor.
		int result=0;
		for(int sayi:sayilar) {
			result += sayi;
		}
		return result;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
}
