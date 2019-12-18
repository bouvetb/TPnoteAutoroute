package tp;

public class Porte {
	private int numeroDePorte;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroDePorte;
		return result;
	}

	public boolean equals(Porte obj) {
		if(obj.numeroDePorte == this.numeroDePorte) {
			return true;
		}else {
			return false;
		}
	}

	public int getNumeroDePorte() {
		return numeroDePorte;
	}

	public void setNumeroDePorte(int numeroDePorte) {
		this.numeroDePorte = numeroDePorte;
	}

	@Override
	public String toString() {
		return "Porte [numeroDePorte=" + numeroDePorte + "]";
	}

	public Porte(int numeroDePorte) {
		super();
		this.numeroDePorte = numeroDePorte;
	}
}
