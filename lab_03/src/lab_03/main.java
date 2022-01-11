package lab_03;

public class main {

	public static void main(String[] args) {

		PartTime pt1= new PartTime("Ali Yýlmaz");
		pt1.bilgiYazdir();
		PartTime pt2= new PartTime("Ahmnet Demir",5);
		pt2.bilgiYazdir();
		PartTime pt3 = new PartTime("Mehmet Kaya",5,50);
		pt3.bilgiYazdir();
		
		pt1.mesaiEkle(2);
		pt1.bilgiYazdir();
		System.out.println(pt1.getAdSoyad()+"Ýçin Mesai Ücreti:"+pt1.ucretHesapla()+" TL");
		
	}

}
