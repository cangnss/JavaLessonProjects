
public class ucgen extends GeometrikSekil{
	
	private double yukseklik;
	private double taban;
	
	public void bilgi(double yukseklik,double taban) {
		isimBelirle("Üçgen nesnesi");
		this.yukseklik = yukseklik;
		this.taban = taban;
	}
	
	@Override
	public double alanHesap() {
		// TODO Auto-generated method stub
		return (taban*yukseklik)/2;
	}

}
