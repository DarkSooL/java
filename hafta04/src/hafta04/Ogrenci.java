package hafta04;

public class Ogrenci {
	
	public String adSoyad;
	public int no;
	
	public Ogrenci(String adSoyad, int no) {
		super();
		this.adSoyad = adSoyad;
		this.no = no;
	}

	public Ogrenci() {
		// TODO Auto-generated constructor stub
	}

	
	//Override (metot ezme- metot örtme)
	public void bilgiYazdir() {
		System.out.println("Ad Soyad: "+adSoyad);
		System.out.println("Numara: "+no);
	}
	
}
