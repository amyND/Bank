package projetBank;

public class CompteASeuilRemunere extends CompteRemunere implements ICompteRemunere{
	
	//constructeurs
	public CompteASeuilRemunere (int num, double lesolde, double taux ) {
		super(num, lesolde, taux);
	}

	@Override
	public String toString() {
		return "CompteASeuilRemunere [taux=" + taux + ", solde=" + solde + ", toString()=" + super.toString()
				+ ", calculerInterets()=" + calculerInterets() + ", getTaux()=" + getTaux() + ", getNumero()="
				+ getNumero() + ", getSolde()=" + getSolde() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	

}
