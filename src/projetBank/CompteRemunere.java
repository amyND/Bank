package projetBank;

public class CompteRemunere extends Compte implements ICompteRemunere {
	//attributs
	protected double taux;
	
	//constructeurs
	public  CompteRemunere() {
		System.out.println("Création d'un compte rémunéré");
		if (this.taux<0) {
			this.taux = 0;
		}
		else if(this.taux > 1){
			this.taux = 1;
		}
	}
	
	public CompteRemunere(int num, double lesolde, double taux) {
		super(num, lesolde);
		this.taux = taux;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder
			.append("CompteRemunere [taux=").append(taux)
			.append("]");
		
		return builder.toString();
	}
	
	public double calculerInterets() {
		return this.taux*this.solde;
	}

	public void verserInterets() {
		this.solde += this.calculerInterets();
		
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	

}
