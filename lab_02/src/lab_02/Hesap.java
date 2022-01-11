package lab_02;

public class Hesap {
		
		private String adSoyad;
		double bakiye;
		
		public Hesap (String adSoyad,double bakiye) {
			this.adSoyad=adSoyad;
			this.bakiye=bakiye;
			System.out.println("Hesabınız Oluşturuldu.\t");
		}
		
		public void paraYatir(double miktar) {
		
			bakiye= bakiye+miktar;
			bakiyeGoruntule();
			
		}
		public void paraCek(double miktar) {
			if(miktar <bakiye) {
				bakiye-=miktar;
			} else {
				System.out.println("Miktar Bakiyeden Yüksektir Bakiyenin tamamı çekildi");
				bakiye=0;
			}
		}
		
		public void bakiyeGoruntule() {
			System.out.println("Bakiyenizde:"+bakiye +"TL vardır.");
			
		}
}
