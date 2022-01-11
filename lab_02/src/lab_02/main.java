package lab_02;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ad�n�z� soyad�n�z� giriniz:");
		String adSoyad = sc.nextLine();
		System.out.println("�lk Yat�r�m miktar�n� giriniz:");
		double miktar;
		miktar = sc.nextInt();
		Hesap hesap = new Hesap(adSoyad, miktar);

		System.out.println("\nSe�im Yap�n�z 1-Para yat�rma 2-Para �ekme 3- Bakiye G�r�nt�le 4- ��k��");
		int secim = sc.nextInt();

		while (secim != 4) {

			switch (secim) {

			case 1:
				System.out.println("Yat�r�m miktar�n� giriniz");
				miktar = sc.nextDouble();
				hesap.paraYatir(miktar);
				break;
			case 2:
				System.out.println("�ekim miktar�n� giriniz");
				miktar = sc.nextDouble();
				hesap.paraCek(miktar);
				break;
			case 3:
				hesap.bakiyeGoruntule();

				break;
				
			}
			System.out.println("\nSe�im Yap�n�z 1-Para yat�rma 2-Para �ekme 3- Bakiye G�r�nt�le 4- ��k��");
			secim = sc.nextInt();
		}
		System.out.println("Men�den ��k�ld�.");
		
	}
}
