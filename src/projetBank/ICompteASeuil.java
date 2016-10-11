package projetBank;

public interface ICompteASeuil {
	public void retirer(double uneValeur) throws BankException;
	public double getSeuil();
	public void setSeuil(double unSeuil);
}
