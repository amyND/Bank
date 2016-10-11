package projetBank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;



public class Client {

	//attributs
	protected String nom;
	protected String prenom;
	protected int age = 0;
	protected int numero = 0;
//	protected Compte[] tab = new Compte[5];
	protected List<Compte> tab = new ArrayList<Compte>();
	//constructeur 
	public Client(){
		System.out.println("Creation du client null");
		for (int i=0; i<5; i++){
			this.tab.add(null);
		}
	}
	
	public Client(String nom, String prenom, int age, int numero,List<Compte> tab) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.numero = numero;
		if (tab.size() > 5){
			System.out.println("Trop de comptes!!!");		
			System.exit(0);
		}
		this.tab = tab;
	}
	
	//méthodes
	public void ajouterCompte(Compte unCompte){
		if (this.tab.size() < 5){
			this.tab.add(unCompte);			
		}
		else {
			System.out.println("Taille du tab = " +this.tab.size()+ ", donc, impossible de rajouter le compte "+unCompte);
		}
		
//		for(int i =0; i<this.tab.length; i++) {
//			
//			if(this.tab[i] ==  unCompte){
//				break;
//			}
//			
//			if(this.tab[i] == null){
//				System.out.println("***");
//				this.tab[i] = unCompte;
//				break;
//			}
//		}
		
	}
	
	public Compte getCompte (int numeroCompte) {
		
		Compte c = new Compte();
		
		ListIterator<Compte> lIter = this.tab.listIterator();
		while(lIter.hasNext()) {
			c =  lIter.next();
			if (c.getNumero() == numeroCompte) {
				System.out.println("Compte trouvé !");
				break;
			}
		}
			return c;
		}
	
//		int i = 0;
//		Compte c = new Compte();
//		while (i < this.tab.length){
//			if (numeroCompte == tab[i].getNumero()){
//				c = tab[i];	
//				break;
//			}
//			else{
//				i++;
//			}
//			
//		}
//		return c;
//	}
	
	public List<Compte> getComptes() {
		for(Compte c:tab) {
			System.out.println(c);
		}
		return this.tab;
			
		}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Compte> getTab() {
		return tab;
	}

	public void setTab(List<Compte> tab) {
		this.tab = tab;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", age=");
		builder.append(age);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", tab=");
		builder.append(tab);
		builder.append("]");
		return builder.toString();
	}

	
	
}
