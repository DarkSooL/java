package hafta03;

public class main2 {

	public static void main(String[] args) {

		Sekil sekil=new Sekil();
		System.out.println("Karenin çevresi"+sekil.cevreBul(5));
		System.out.println("Diktörgen çevresi"+sekil.cevreBul(5,10));
		System.out.println("Uçgen ÇEvresi"+sekil.cevreBul(3, 4, 5));
		System.out.println("Yamuk Çevresi"+sekil.cevreBul(3, 4, 5, 6));
		
		
		
	}

}
