package lab7;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {

		Ogrenci ogr1=new Ogrenci("Ahmet Yýlmaz",85,"Bilp", new ArrayList<String>());
		Ogrenci ogr2=new Ogrenci("Nilay Kaya",336,"Bilp", new ArrayList<String>());

		ogr1.dersEkle("Bilp201");
		ogr1.dersEkle("Bilp203");
		ogr1.dersleriYazdir();
		System.out.println();
		String cikarilanDers = ogr1.dersCikar(0);
		System.out.println("Çýkarýlan Ders: "+ cikarilanDers);
		ogr1.dersleriYazdir();
		System.out.println();
		
		ogr2.dersEkle("Bilp205");
		ogr2.dersEkle("Bilp210");
		ogr2.dersEkle("Bilp213");
		ogr1.dersleriYazdir();

		
		

	}

}
