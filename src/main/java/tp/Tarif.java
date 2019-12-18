package tp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Tarif {
	private Porte entree;
	private Porte sortie;
	private LocalDateTime dateValidite;
	private BigDecimal prix;
	
	public Tarif(Porte entree, Porte sortie, BigDecimal prix) {
		super();
		this.entree = entree;
		this.sortie = sortie;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Tarif [entree=" + entree + ", sortie=" + sortie + ", dateValidite=" + dateValidite + ", prix=" + prix
				+ "]";
	}

	public Porte getEntree() {
		return entree;
	}

	public void setEntree(Porte entree) {
		this.entree = entree;
	}

	public Porte getSortie() {
		return sortie;
	}

	public void setSortie(Porte sortie) {
		this.sortie = sortie;
	}

	public LocalDateTime getDateValidite() {
		return dateValidite;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateValidite == null) ? 0 : dateValidite.hashCode());
		result = prime * result + ((entree == null) ? 0 : entree.hashCode());
		result = prime * result + ((prix == null) ? 0 : prix.hashCode());
		result = prime * result + ((sortie == null) ? 0 : sortie.hashCode());
		return result;
	}



	public void setDateValidite(LocalDateTime dateValidite) {
		this.dateValidite = dateValidite;
	}

	public BigDecimal getPrix() {
		return prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}
}
