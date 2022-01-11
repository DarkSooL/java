package hafta05;

public class Personel extends Kisi{
	
	

	@Override
	public String toString() {
		return "Personel [sicilNo=" + sicilNo + "]";
	}

	public int sicilNo;

	public Personel(String adSoyad, int tcNo, int sicilNo) {
		super(adSoyad, tcNo);
		this.sicilNo = sicilNo;
	}
	
	@Override
	public void numaraYazdir() {
		System.out.println("Sicil No : "+sicilNo);
	}

}
