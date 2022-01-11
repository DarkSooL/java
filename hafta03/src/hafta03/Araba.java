package hafta03;

public class Araba {

	private String marka;
	private int yil;
	private String renk;
	
	public Araba(String marka,int yil) {
		
		this(marka, yil,"Beyaz");
		//this.marka=marka;
		//this.yil=yil;
		//this.renk=("Beyaz");
	}
	
	public Araba(String marka,int yil,String renk) {
		this.marka=marka;
		this.yil=yil;
		this.renk=renk;
	}


}
