package hafta05;

public class Ogrenci extends Kisi {

	@Override
	public String toString() {
		return "Ogrenci [ogrenciNo=" + ogrenciNo + "]";
	}




	public int ogrenciNo;
	 

 

	public Ogrenci(String adSoyad, int tcNo, int ogrenciNo) {
		super(adSoyad, tcNo);
		this.ogrenciNo = ogrenciNo;
	}




	@Override
	public void numaraYazdir() {

		System.out.println("Ögrenci No:"+ogrenciNo);
		
	}

}
