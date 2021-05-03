package abstractExample2;

public abstract class Medya {
	public int cikis_yili;
	public String medya_basligi;
	public int satis_adedi;
	
	public abstract String isim(String ad);
	public abstract int yil(int year);
	public abstract int adet(int a);
}
