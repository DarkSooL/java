package hafta04;

public class UniOgrenci extends Ogrenci{

		public String bolum;
		
	public UniOgrenci(String adSoyad, int no) {
		super(adSoyad, no); // üst sýnýf yapýlandýrýcýsýný çaðýrýyor

	
	}

	public UniOgrenci() {
		// TODO Auto-generated constructor stub
	}

	public UniOgrenci(String adSoyad, int no,String bolum) {
		super(adSoyad, no);
		this.bolum=bolum;
	
	}

	@Override //Metod ezme- örtme)s
	public void bilgiYazdir() {
		super.bilgiYazdir();
		System.out.println("Bölüm: "+ bolum);
	}
	
	
}
