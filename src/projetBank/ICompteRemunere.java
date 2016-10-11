package projetBank;

public interface ICompteRemunere {  // en java8, ajouter mot clef default ce ki signifie ke la redefinition nest pas obligatoire
	public double calculerInterets();
	public void verserInterets();
	public double getTaux();
	public void setTaux(double unTaux);
}
