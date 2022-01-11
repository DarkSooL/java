package lab08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ogrenci {
	public String adSoyad;
	public int numara;
	public String bolum;
	public List<Ders> dersler;
	
	public Ogrenci(String adSoyad, int numara, String bolum,ArrayList<Ders> arrayList  ) {
		super();
		this.adSoyad=adSoyad;
		this.numara=numara;
		this.bolum=bolum;
		this.dersler=arrayList;
		
	}
	
	public void dersEkle(Ders dersAdi) {
		dersler.add(dersAdi);
		
	}
	
	public void dersCikar(int index) {
		
		dersler.remove(index);
	
	}
	public void dersleriSiralaYazdir() {
		
		System.out.println(adSoyad+" Ýçin Dersler");
		Collections.sort(dersler,new DersKarsilastirici());
		
		for ( Ders ders : dersler) {
			System.out.println(ders);
		}
		
	}
	public void dersleriTemizle() {
		
		dersler.clear();
	}
	}


