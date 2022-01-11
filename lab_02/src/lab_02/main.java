package lab_02;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Adýnýzý soyadýnýzý giriniz:");
		String adSoyad = sc.nextLine();
		System.out.println("Ýlk Yatýrým miktarýný giriniz:");
		double miktar;
		miktar = sc.nextInt();
		Hesap hesap = new Hesap(adSoyad, miktar);

		System.out.println("\nSeçim Yapýnýz 1-Para yatýrma 2-Para Çekme 3- Bakiye Görüntüle 4- Çýkýþ");
		int secim = sc.nextInt();

		while (secim != 4) {

			switch (secim) {

			case 1:
				System.out.println("Yatýrým miktarýný giriniz");
				miktar = sc.nextDouble();
				hesap.paraYatir(miktar);
				break;
			case 2:
				System.out.println("Çekim miktarýný giriniz");
				miktar = sc.nextDouble();
				hesap.paraCek(miktar);
				break;
			case 3:
				hesap.bakiyeGoruntule();

				break;
				
			}
			System.out.println("\nSeçim Yapýnýz 1-Para yatýrma 2-Para Çekme 3- Bakiye Görüntüle 4- Çýkýþ");
			secim = sc.nextInt();
		}
		System.out.println("Menüden Çýkýldý.");
		
	}
}
