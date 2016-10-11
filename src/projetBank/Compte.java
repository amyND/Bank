package projetBank;

public class Compte {
	
	//attributs
	private int numero = 0 ;
	protected double solde = 0.0;
	
	//constructeurs
	public Compte(){
		System.out.println("Création d'un compte de numéro 0 a un solde de 0");
	}

	public Compte(int num, double lesolde){
		this.numero = num;
		this.solde = lesolde;
	}
	
	public void ajouter(double unMontant){
		System.out.println("\nAjout du montant "+ unMontant +" au solde "+this.solde );
		this.solde += unMontant;
	}
	
	public void retirer(double unMontant)  throws BankException{
		System.out.println("\nRetrait du montant "+ unMontant +" au solde "+this.solde );
		this.solde -= unMontant;
	}

	protected void setNumero(int num){
		this.numero = num;
	}
	protected void setSolde(double s){
		this.solde = s;
	}
	
	protected int getNumero(){
		return this.numero;
	}
	
	protected double getSolde(){
		return this.solde;
	}

//	@Override
//	public String toString() {
//		return "Compte [numero=" + numero + ", solde=" + solde + "]";
//	}
	@Override //plus rapide pour la concaténation que toString
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Compte [numero=");
		builder.append(numero);
		builder.append(", solde=");
		builder.append(solde);
		builder.append("]");
		return builder.toString();
	}
}
