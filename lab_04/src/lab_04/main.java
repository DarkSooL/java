package lab_04;

public class main {

	public static void main(String[] args) {

		Urun urun = new Urun("Deuter","Trans Alpine 20 Sýrt Çantasý",1000,18);
		urun.bilgiYazdir();
		System.out.println("-------------------------");
		Televizyon tv = new Televizyon("LG","49UN73 Smart LED",10000,18,123,10);
		tv.bilgiYazdir();
	}

}
