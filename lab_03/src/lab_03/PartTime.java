package lab_03;

public class PartTime {
	private String adSoyad;
	private int saat;
	private int saatUcret;

	public PartTime(String adSoyad) {

		this(adSoyad,0);
		
	}

	public PartTime(String adSoyad,int saat) {
		
		this(adSoyad,saat,30);
	}

	public PartTime(String adSoyad,int saat, int saatUcret) {

			this.adSoyad=adSoyad;
			this.saat=saat;
			this.saatUcret=saatUcret;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void mesaiEkle(int mesai) {
		saat = saat+mesai;
	}
	
	public int ucretHesapla() {
		return saatUcret*saat;
		
		
	}
	public void bilgiYazdir() {
		System.out.println(+saat+"Saat Eklendi");
		System.out.println("Ad Soyad: " + adSoyad+"Çalýþtýðý saat ücreti"+saat);
	}
}
