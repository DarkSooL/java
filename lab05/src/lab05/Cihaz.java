package lab05;

public abstract class Cihaz {
	
	public int yil;

	public Cihaz(int yil) {
		super();
		this.yil = yil;
	}
	public abstract void kapat();
	public abstract void baslat();
	
	public void modelbilgi() {
		System.out.println("Cihazýn Modeli :"+yil);
	}

}
