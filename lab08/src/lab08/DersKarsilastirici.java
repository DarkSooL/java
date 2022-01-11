package lab08;

import java.util.Comparator;

public class DersKarsilastirici implements Comparator <Ders> {

	@Override
	public int compare(Ders ders1, Ders ders2) {

		if(ders1.akts<ders2.akts) {
			
			return -1;
			
		}else if(ders2.akts < ders1.akts) {
			
			return 1;
		}
		else
		return 0;
	}
	
	

}
