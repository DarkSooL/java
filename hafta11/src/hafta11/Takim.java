package hafta11;

import java.util.List;

public class Takim  {
	

private String ad;
 private List<Mac> maclar;

 
 public Takim(String ad, List<Mac> maclar) {
	super();
	this.ad = ad;
	this.maclar = maclar;
}

 
 public void macEkle(Mac mac) {
	 
	 maclar.add(mac);
	 
 }
 
 public int puanHesapla() {
	 
	 int puan;
	 int  toplamPuan =0;
	
	 
	 
	return toplamPuan;
	 
	 
 }
 
 public int averajHesapla() {
	 int netAveraj =0;
	 
	 return netAveraj;
 } 
 
 
 
 @Override
	public String toString() {
		return  ad +"Puan:"+ puan +" "+" Averaj:"+averaj;
	}

	
	
	
	

}
