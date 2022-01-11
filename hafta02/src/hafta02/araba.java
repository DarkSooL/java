package hafta02;

public class araba {

	
		public String marka;
		public String Renk;
		private int yil;
		
		
		
		//Yapýlandýrýcý Aþýrý Yükleme (Constructor Overloading)
		public araba(String marka, String Renk, int yil) {
			this.marka =marka;
			this.Renk=Renk;
			this.yil=yil;
		}
		
		//Yapýlandýrýcý 2. versiyon
		public araba() {
			
		}


		public void setyil(int yil) {
			this.yil=yil;
		}
		public void setmarka(String marka) {
			this.marka=marka;
		}
		public void setRenk(String Renk) {
			this.Renk=Renk;
		}
		
		public int getyil() {
			return yil;
		}
		public String getRenk() {
			return Renk;
			
		}
		public String getmarka() {
			return marka;
		}
		
}
