package tp;

import java.util.Comparator;

public class OrdrePorteComparator implements Comparator<Porte>{

	public int compare(Porte o1, Porte o2) {
		return o1.getNumeroDePorte()-o2.getNumeroDePorte();
		
	}


}
