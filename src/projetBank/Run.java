package projetBank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Run {

	public static void main(String[] args) {
		Compte c1 = new Compte();
		Compte c2 = new Compte(202,20000);
		Compte c3 = new Compte(303,30000);
		Compte c4 = new Compte(404,40000);
		Compte c5 = new Compte(505,50000);
		Compte c6 = new Compte(606,60000);
		
		c1.setNumero(101);
		c1.setSolde(10000);
		
//		Compte[] taba = new Compte[5];
		List<Compte> taba = new ArrayList<Compte>();
		taba.add(c1);
//		taba.add(c2);
//		taba[0] = c2;
//		taba[1] = c5;
//		Compte[] tabb = {c1,c2,c3,c4,c5};
		List<Compte> tabb = new ArrayList<Compte>();
		tabb.add(c1);
		tabb.add(c2);
		tabb.add(c3);
		tabb.add(c4);
		tabb.add(c5);
		
		Client cl1 = new Client("ndiaye", "ami", 10, 111, taba);
		Client cl2 = new Client("sylla", "moh", 15, 222,tabb );
		Client cl3 = new Client();
		
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(cl1);
		System.out.println(cl2);
		
		c1.ajouter(5000);
		System.out.println(cl2);
		
		try{
			c2.retirer(300);
		}catch(BankException bk) {
		}
		System.out.println(cl1);
		
		
//		System.out.println("\ninfos sur le client cl2: ");
//		cl2.getComptes();
		
		
//		System.out.println("\ninfos sur le compte 202: " +cl1.getCompte(202));
		
		CompteASeuil cas1 =  new CompteASeuil(202,20000 , 3000);
		CompteASeuil cas2 =  new CompteASeuil(303,30000 , 4000);
		CompteASeuil cas3 =  new CompteASeuil(505,50000 , 5000);
		CompteASeuil cas4 =  new CompteASeuil(101,10000 , 1000);
		
		CompteRemunere cr1 = new CompteRemunere(202,20000 , 0.3);
		CompteRemunere cr2 =  new CompteRemunere(303,30000 , 0.4);
		CompteRemunere cr3 =  new CompteRemunere(505,50000 , 0.2);
		CompteRemunere cr4 =  new CompteRemunere(101,10000 , 0.8);		
		
		System.out.println("\nInfos sur le clien cl1: " +cl1.getComptes());
		cl1.ajouterCompte(cr2);
//		cl1.ajouterCompte(cr3);
		System.out.println("\nInfos sur le client cl1: " +cl1.getComptes());
		List<Compte> comptes = cl1.getComptes();

		CompteRemunere cr;
		System.out.println("\nListe compte");
		System.out.println( comptes );
		
	
		System.out.println("\n\n\n\n\nVoici la liste des comptes de cl1");
		System.out.println(cl1.getComptes());
		Compte c = new Compte();		
		ListIterator<Compte> lIter = cl1.getComptes().listIterator();
		while(lIter.hasNext()) {
			c =  lIter.next();
			if (c instanceof CompteRemunere) {
				System.out.println("****Corrigeons le solde du compte suivant*****");
				cr = (CompteRemunere)c;
				System.out.println("Le solde 0 de cr = "+cr.getSolde()+" son taux est de " +cr.getTaux());
				cr.verserInterets();
				System.out.println("Le nouveau solde de cr "+cr.getSolde());
				System.out.println("****Fin correction");
			}
		}
		System.out.println("\n\n\nPassons à l'exercice 08/10");
		CompteASeuilRemunere casr1 = new CompteASeuilRemunere(1, 1000, 0.1);
		CompteASeuilRemunere casr2 = new CompteASeuilRemunere(2, 2000, 0.2);
		CompteASeuilRemunere casr3 = new CompteASeuilRemunere(3, 3000, 0.3);
		CompteASeuilRemunere casr4 = new CompteASeuilRemunere(4, 4000, 0.4);
		cl1.ajouterCompte(casr1);
		cl1.ajouterCompte(casr2);
		cl1.ajouterCompte(casr3);
		System.out.println("\nPassons à la dernière partie");
		System.out.println(casr1.calculerInterets());
		
//		System.out.println(cl1.getComptes());
		c = null;
		lIter = cl1.getComptes().listIterator();
		while(lIter.hasNext()) {
			c =  lIter.next();
			if (c instanceof ICompteRemunere) {
//				System.out.println("Le solde 0 de cr = "+cr.getSolde()+" son taux est de " +cr.getTaux());
				((ICompteRemunere)c).verserInterets();
				System.out.println("Le nouveau solde de c "+c.getNumero()+" vaut " +c.getSolde());
			}
		}

//		for (int i = 0; i < comptes.length; i++) {							
//			if(comptes[i] instanceof CompteRemunere) {					
//				cr = (CompteRemunere)comptes[i];
//				System.out.println("Le solde 0 de cr = "+cr.getSolde()+" son taux est de " +cr.getTaux());
//				cr.verserInterets();
//				System.out.println("Le nouveau solde de cr "+cr.getSolde());
//			}
//
//		}
		// exo 08
//		CompteASeuilRemunere casr1 = new CompteASeuilRemunere(1, 1000, 0.1);
//		CompteASeuilRemunere casr2 = new CompteASeuilRemunere(2, 2000, 0.2);
//		CompteASeuilRemunere casr3 = new CompteASeuilRemunere(3, 3000, 0.3);
//		CompteASeuilRemunere casr4 = new CompteASeuilRemunere(4, 4000, 0.4);
//	 
//
//		cl1.ajouterCompte(casr1);
//		cl1.ajouterCompte(casr2);
//		cl1.ajouterCompte(casr3);
//		comptes = cl1.getComptes();
//		System.out.println("\nListe compte");
//		System.out.println( Arrays.toString(comptes) );
//		for (int i = 0; i < comptes.length; i++){
//			if (comptes[i] instanceof ICompteRemunere ){
//				cr = (CompteRemunere)comptes[i];
//				System.out.println("\nLe solde 0 de casr = "+cr.getSolde()+" son taux est de " +cr.getTaux());
//				cr.verserInterets();
//				System.out.println("Le nouveau solde de ascr "+cr.getSolde());
//			}
////			}
//		}

	}
}	
