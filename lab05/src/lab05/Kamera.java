package lab05;

public class Kamera extends Cihaz {
	
	@Override
	public void kapat() {
		System.out.println("Kamera kapan�yor");
	}

	@Override
	public void baslat() {
		System.out.println("Kamera A��l�yor");

	}

	@Override
	public void modelbilgi() {
		super.modelbilgi();
	}

	public Kamera(int yil) {
		super(yil);
	}
	

}
