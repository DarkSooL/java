package lab08;

public class Ders {



	public String kod;
	public String ad;
	public int akts;
	
	public Ders(String kod, String ad, int akts) {
		super();
		this.kod = kod;
		this.ad = ad;
		this.akts = akts;
	}
	@Override
	public String toString() {
		return  kod +" "  + ad + " " + akts  +" akts";
	}
}
