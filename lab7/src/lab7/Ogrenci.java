package lab7;

import java.util.List;

public class Ogrenci {

	public String adSoyad;
	public int numara;
	public String bolum;
	public List <String> dersler;
	
	public Ogrenci(String adSoyad, int numara, String bolum,List <String> dersler  ) {
		super();
		this.adSoyad=adSoyad;
		this.numara=numara;
		this.bolum=bolum;
		this.dersler=dersler;
		
	}
	public void dersEkle(String dersAdi) {
		dersler.add(dersAdi);
		
	}

	public void dersleriYazdir() {
		System.out.println(adSoyad+" Ýçin Dersler");
		for ( String ders : dersler) {
			System.out.println(ders);
		}
		
	}

	public String dersCikar(int index) {


		
		return dersler.remove(index);
	}

}
