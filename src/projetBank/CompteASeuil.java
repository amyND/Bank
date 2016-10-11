package projetBank;

public class CompteASeuil extends Compte implements ICompteASeuil {
	
	//attributs
	protected double seuil = 0.0;
	
	//constructeurs
	public CompteASeuil() {
		System.out.println("Création d'un compte à seuil");
	}
	public CompteASeuil(int num, double lesolde, double seuil) {
		super(num, lesolde);
		this.seuil = seuil;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder
			.append("CompteASeuil [seuil=").append(seuil)
			.append("]");
		
		return builder.toString();
	}
	public double getSeuil() {
		return seuil;
	}
	public void setSeuil(double seuil) {
		this.seuil = seuil;
	}
	
	
	public void retirer (double uneValeur) throws BankException {
		double nouveauSolde = 0;
		nouveauSolde = this.solde - uneValeur;
		
		if (nouveauSolde < this.seuil){
			throw new BankException();
		}else {
			super.retirer(uneValeur);
		}
	}

}
