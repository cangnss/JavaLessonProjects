package interfacesExample;

public class isci implements calisan{
	double ucretSabiti;
	
	@Override
	public double ucret() {//calisan �cretini d�nd�ren metod
		return ucretSabiti*oran;
	}

	@Override
	public void calisanBolumu() {//calisan b�l�m�n� ekrana yazd�ran metod
		System.out.println("Ucretli calisan");
	}

	@Override
	public void ucretBelirle(double ucretSabiti) {//calisan �cretini belirtmek i�in kullan�lacak metod
		this.ucretSabiti = ucretSabiti;
	}
	
}
