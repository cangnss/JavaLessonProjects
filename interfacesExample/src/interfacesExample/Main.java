package interfacesExample;

public class Main {

	public static void main(String[] args) {
		
		//i��i ile ilgili bilgiler
		isci ucretliCalisan = new isci();
		ucretliCalisan.calisanBolumu();
		ucretliCalisan.ucretBelirle(865.70);
		System.out.println("Maa��: "+ ucretliCalisan.ucret());
		
		
		//m�d�r ile ilgili bilgiler
		mudur yonetici = new mudur();
		yonetici.calisanBolumu();
		yonetici.ucretBelirle(5519.81);
		System.out.println("Maa��: "+ yonetici.ucret());
		
		//satis elemani ile ilgili bilgiler
		satisElemani pazarlama = new satisElemani();
		pazarlama.calisanBolumu();
		pazarlama.ucretBelirle(978.75);
		pazarlama.satisKomisyonuBelirle(250);
		System.out.println("Komisyon: "+pazarlama.komisyon);
		System.out.println("Maa��: "+ pazarlama.ucret());
		
	}

}
