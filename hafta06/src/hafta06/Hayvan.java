package hafta06;

public abstract class Hayvan {
	
	public String ad;
	public int yas;
	
	
	public Hayvan(String ad, int yas) {
		super();
		this.ad = ad;
		this.yas = yas;
	}
	
	public void mesaj() {
		System.out.println("Merhaba Benim adım " +ad);
	}

	public abstract void ses(); //soyut
}
