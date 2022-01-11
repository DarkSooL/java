package hafta03;

public class Sekil {
	// kare ve eþkenar
	public double cevreBul(double a) {
		return 4*a;
		
	}
	//dikdörtgen pareler kenar
	public double cevreBul(double a,double b) {
		return 2*(a+b);
	}
	//uçgen
	
	public double cevreBul(double a,double b,double c) {
		return a+b+c;
		
	}
	
	public double cevreBul(double a,double b,double c,double d) {
		
		return a+b+c+d;
	}

}
