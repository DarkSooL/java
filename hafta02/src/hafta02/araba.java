package hafta02;

public class araba {

	
		public String marka;
		public String Renk;
		private int yil;
		
		
		
		//Yap�land�r�c� A��r� Y�kleme (Constructor Overloading)
		public araba(String marka, String Renk, int yil) {
			this.marka =marka;
			this.Renk=Renk;
			this.yil=yil;
		}
		
		//Yap�land�r�c� 2. versiyon
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
