package hafta03;

public class ogrenci {
	
	
	private String adSoyad;
	private int no;
	private String sehir;
	
	
	public ogrenci() {
		
	}
	
	//yap�land�r�c� 2. versiyon
	public ogrenci(String adSoyad,int no) {
		this(adSoyad,no,"Ankara");
		//this.adSoyad=adSoyad;
		//this.no=no;
		//this.sehir="Ankara";
	}
	
	
	
	//yap�land�r�c� 3. versiyon
	//Yap�lanc�d�r�c� A��r� y�kleme
	//(CONSTRUCTOR OVERLOADING)
	public ogrenci(String adSoyad,int no,String sehir) {
		
		this.adSoyad=adSoyad;
		this.no=no;
		this.sehir=sehir;
		
	}

}
