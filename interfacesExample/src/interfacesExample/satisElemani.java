package interfacesExample;

public class satisElemani implements calisan{
	double ucretSabiti;
	double komisyon;
	final double komisyonOran = 0.3;
	@Override
	public double ucret() {
		return ((ucretSabiti*oran)+komisyon);
	}

	@Override
	public void calisanBolumu() {
		System.out.println("Satýþ elemaný");
	}

	@Override
	public void ucretBelirle(double ucretSabiti) {
		 this.ucretSabiti = ucretSabiti;
	}
	
	public void satisKomisyonuBelirle(int adet){
		komisyon = adet*komisyonOran;
	}

}
