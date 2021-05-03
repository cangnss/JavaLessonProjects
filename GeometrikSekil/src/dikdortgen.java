
public class dikdortgen extends GeometrikSekil{

	private double uzunKenar;
	private double kisaKenar;
	
	public void bilgi(double uzunKenar, double kisaKenar) {
		isimBelirle("Dikdörtgen nesnesi");
		this.uzunKenar = uzunKenar;
		this.kisaKenar = kisaKenar;
	}

	@Override
	public double alanHesap() {
		// TODO Auto-generated method stub
		return uzunKenar*kisaKenar;
	}

}
