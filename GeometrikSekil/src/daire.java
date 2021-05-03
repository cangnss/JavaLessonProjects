
public class daire extends GeometrikSekil{
	
	private double yariCap;
	private double pi = Math.PI;
	
	public void bilgi(double yariCap) {
		isimBelirle("Daire nesnesi");
		this.yariCap = yariCap;
	}

	@Override
	public double alanHesap() {
		return pi*Math.sqrt(yariCap);
	}
}
