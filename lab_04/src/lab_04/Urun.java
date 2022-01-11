package lab_04;

public class Urun {

	public String marka;
	public String model;
	public double temelFiyat;
	public int yuzdeKdv;
	
	public Urun(String marka, String model, double temelFiyat, int yuzdeKdv) {

		this.marka = marka;
		this.model = model;
		this.temelFiyat = temelFiyat;
		this.yuzdeKdv = yuzdeKdv;
	}
	
	public void bilgiYazdir() {
		
		System.out.println("�r�n Bilgileri:");
		System.out.println("Markas�:"+marka);
		System.out.println("Modeli: "+model);
		System.out.println("Temel Fiyat: "+temelFiyat);
		System.out.println("Son fiyat: "+fiyatHesapla());
		
	}
	
	public double fiyatHesapla() {
		return temelFiyat+temelFiyat * yuzdeKdv/100;

	}
	
}
