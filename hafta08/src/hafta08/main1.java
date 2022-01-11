package hafta08;

public class main1 {

	public static void main(String[] args) {

		Okcu okcu=new Okcu();
		Savasci savasci=new Savasci();
		saldirTest(okcu);
		saldirTest(savasci);
		
	}
	public static void saldýrTest(Karakter karakter) {
		
	}

	public static void saldirTest(Okcu okcu) {
		okcu.saldir();
	}
	public static void saldirTest(Savasci savasci) {
		savasci.saldir();
	}
	
}
