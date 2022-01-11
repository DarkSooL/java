package lab08;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {

		Ogrenci ogr1=new Ogrenci("Ahmet Yýlmaz",336,"BÝLP",new ArrayList<Ders>());
		
		ogr1.dersEkle(new Ders("BÝLP210","Mobil Uygulamalar I",5));
		ogr1.dersEkle(new Ders("BÝLP102","C Programlama",5));
		ogr1.dersEkle(new Ders("GSB101","Resim",1));
		ogr1.dersEkle(new Ders("TURK101","TurkDili I",3));
		ogr1.dersCikar(1);
		ogr1.dersleriSiralaYazdir();



		
	}

}
