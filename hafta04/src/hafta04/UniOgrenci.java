package hafta04;

public class UniOgrenci extends Ogrenci{

		public String bolum;
		
	public UniOgrenci(String adSoyad, int no) {
		super(adSoyad, no); // �st s�n�f yap�land�r�c�s�n� �a��r�yor

	
	}

	public UniOgrenci() {
		// TODO Auto-generated constructor stub
	}

	public UniOgrenci(String adSoyad, int no,String bolum) {
		super(adSoyad, no);
		this.bolum=bolum;
	
	}

	@Override //Metod ezme- �rtme)s
	public void bilgiYazdir() {
		super.bilgiYazdir();
		System.out.println("B�l�m: "+ bolum);
	}
	
	
}
