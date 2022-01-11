package hafta04;

public class SporAraba extends Araba {
	
	public boolean nos;
	
	public SporAraba(String marka , String renk, int yil, boolean nos) {
		super(marka,renk,yil);
		this.nos=nos;
	}
	
	public double fiyatHesapla(int bazFiyat, int yuzdeOtv) {
		double fiyat = super.fiyatHesapla(bazFiyat,yuzdeOtv);
		if(nos) {

			fiyat+=10000;
		
		}
		return fiyat;
	}

}
