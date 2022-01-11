package lab_04;

public class Televizyon extends Urun {

	@Override
	public void bilgiYazdir() {

		super.bilgiYazdir();
		System.out.println("Ekraný: "+ ekran);
	}

	
	public double fiyatHesapla() {

		return temelFiyat+temelFiyat * yuzdeKdv /100 + yuzdeTrtPayi* temelFiyat/100 ;
	}

	public int ekran;
	public int yuzdeTrtPayi;
	
	public Televizyon(String marka, String model,double temelFiyat,int yuzdeKdv,int ekran, int yuzdeTrtPayi) {
		super(marka,model,temelFiyat,yuzdeKdv);
		this.ekran = ekran;
		this.yuzdeTrtPayi = yuzdeTrtPayi;
	}
	
	
	
	
}
