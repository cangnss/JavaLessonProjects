package interfacesExample;

public class isci implements calisan{
	double ucretSabiti;
	
	@Override
	public double ucret() {//calisan ücretini döndüren metod
		return ucretSabiti*oran;
	}

	@Override
	public void calisanBolumu() {//calisan bölümünü ekrana yazdýran metod
		System.out.println("Ucretli calisan");
	}

	@Override
	public void ucretBelirle(double ucretSabiti) {//calisan ücretini belirtmek için kullanýlacak metod
		this.ucretSabiti = ucretSabiti;
	}
	
}
