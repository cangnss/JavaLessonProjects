package interfacesExample;

public class mudur implements calisan{
	
	double ucretSabiti;
	@Override
	public double ucret() {
		return ucretSabiti;
	}

	@Override
	public void calisanBolumu() {
		System.out.println("Y�netici");
	}

	@Override
	public void ucretBelirle(double ucretSabiti) {
		this.ucretSabiti = ucretSabiti;
	}

}
