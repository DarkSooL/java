package lab05;

public class Kamera extends Cihaz {
	
	@Override
	public void kapat() {
		System.out.println("Kamera kapanýyor");
	}

	@Override
	public void baslat() {
		System.out.println("Kamera Açýlýyor");

	}

	@Override
	public void modelbilgi() {
		super.modelbilgi();
	}

	public Kamera(int yil) {
		super(yil);
	}
	

}
