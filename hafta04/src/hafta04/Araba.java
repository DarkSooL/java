package hafta04;

public class Araba {
	
	public String renk;
	public String marka;
	public int yil;
	
	public Araba(String marka, String renk,int yil) {
		this.marka=marka;
		this.renk=renk;
		this.yil=yil;
	}
	public double fiyatHesapla(int bazFiyat, int yuzdeOtv) {
		return bazFiyat+bazFiyat * yuzdeOtv/100;
	}
}
