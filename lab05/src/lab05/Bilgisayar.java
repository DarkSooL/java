package lab05;

public class Bilgisayar extends Cihaz {

	
	@Override
	public void kapat() {
		System.out.println("Bilgisayar kapan�yor");
		System.out.println("Kapanana Kadar Bekleyiniz.");
	}

	@Override
	public void baslat() {
		System.out.println("Bilgisayar Ba�lat�l�yor");
	}

	@Override
	public void modelbilgi() {
		super.modelbilgi();
	}

	public Bilgisayar(int yil) {
		super(yil);
	}


}
