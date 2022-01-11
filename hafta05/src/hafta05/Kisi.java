package hafta05;

public class Kisi {

	@Override
	public String toString() {
		return "Kisi [adSoyad=" + adSoyad + ", tcNo=" + tcNo + "]";
	}

	public String adSoyad;
	public int tcNo;
	
	
	
	public Kisi(String adSoyad, int tcNo) {
		super();
		this.adSoyad = adSoyad;
		this.tcNo = tcNo;
	}
	
	public void numaraYazdir() {
		
		System.out.println("Tc Kimlik No: "+tcNo);
	}
	
	
	
}
