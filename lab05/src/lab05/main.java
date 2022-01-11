package lab05;

public class main {

	public static void main(String[] args) {

		Kamera kamera =new Kamera(2015);
		kamera.modelbilgi();
		kamera.baslat();
		kamera.kapat();
		
		Bilgisayar b = new Bilgisayar(2019);
		b.modelbilgi();
		b.baslat();
		b.kapat();

	
	}

}
