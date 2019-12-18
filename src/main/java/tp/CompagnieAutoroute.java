package tp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CompagnieAutoroute {
	private List<Route> routes;
	private List<Tarif> tarifs;
	public CompagnieAutoroute() {
		super();
		this.routes = new ArrayList<Route>();
		this.tarifs = new ArrayList<Tarif>();
		
	}
	
	private Tarif getTarifCalculé(Porte p1,Porte p2) {
		Tarif t = new Tarif(p1, p2, new BigDecimal(0));
		for(Tarif tr : tarifs) {
			if(tr.getEntree().getNumeroDePorte() >= p1.getNumeroDePorte() && tr.getSortie().getNumeroDePorte()<=p2.getNumeroDePorte()) {
				t.setPrix(t.getPrix().add(tr.getPrix()));
			}
		}
		this.tarifs.add(t);
		return t;
	}
	private Tarif getTarifExacte(Porte p1,Porte p2) {
		Tarif t = new Tarif(p1, p2, new BigDecimal(0));
		for(Tarif tl : tarifs) {
			if(tl.getEntree().equals(p1) && tl.getSortie().equals(p2)) {
				t= tl;
			}
		}
		
		return t;
	}
	public void ajouterTarif(Tarif t) {
		this.tarifs.add(t);
	}
	public void ajouterRoute(Route r) {
		this.routes.add(r);
	}
	public BigDecimal obtenirTarif(Porte p1,Porte p2) {
		if(!getTarifExacte(p1, p2).getPrix().equals(new BigDecimal(0))) {
			return getTarifExacte(p1, p2).getPrix();
		}else {
			return getTarifCalculé(p1, p2).getPrix();
		}
	}
	
}
