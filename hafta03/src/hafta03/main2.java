package hafta03;

public class main2 {

	public static void main(String[] args) {

		Sekil sekil=new Sekil();
		System.out.println("Karenin �evresi"+sekil.cevreBul(5));
		System.out.println("Dikt�rgen �evresi"+sekil.cevreBul(5,10));
		System.out.println("U�gen �Evresi"+sekil.cevreBul(3, 4, 5));
		System.out.println("Yamuk �evresi"+sekil.cevreBul(3, 4, 5, 6));
		
		
		
	}

}
