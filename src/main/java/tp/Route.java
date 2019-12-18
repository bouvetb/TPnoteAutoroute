package tp;

import java.util.ArrayList;
import java.util.List;

public class Route {
	List<Porte> portes;

	public Route() {
		super();
		this.portes = new ArrayList<Porte>();
	}
	
	public void addPorte(Porte p) {
		this.portes.add(p);
	}

	@Override
	public String toString() {
		return "Route [portes=" + portes + "]";
	}
	
}
