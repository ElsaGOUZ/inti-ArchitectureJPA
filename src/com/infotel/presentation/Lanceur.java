package com.infotel.presentation;

import com.infotel.metier.Adresse;

import com.infotel.metier.Client;
import com.infotel.metier.Employe;
import com.infotel.metier.Personne;
import com.infotel.service.Iservice;
import com.infotel.service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Iservice service = new ServiceImpl();
// Personne p = new Personne();
// p.setNom("MALABAR");
//p.setPrenom ("John");
//p.setAge(25);
//service.ajouterPersonne(p);

//		Employe e = new Employe();
//		e.setNom("ATANO");
//		e.setPrenom("Gael");
//		e.setSalaire(3000);
//	e.setAge(45);
//	service.ajouterPersonne(e);

//		Client c = new Client();
//	c.setNom("LEBARA");
//		c.setPrenom("Dora");
//		c.setAge(18);
//		c.setNumeroAdherent(33451);
//	service.ajouterPersonne(c);
//	}

      //GetPersonne(permet d'afficher juste ou afficher et supprimer ce qui met en getReference dans IdaoImpl)
//	  Personne p2= service.affichagePersonne(2);
//	  System.out.println(p2);
		
		//SUPPRIMER UNE PERSONNE
//		Personne p1 = new Personne();
//		p1 = service.getPersonne(8);
//		service.supprimerPersonne(p1);
//		
		//MISE A JOUR DE PERSONNE
		//Personne p3 = new Personne();
//		p3 = service.affichagePersonne(2);
//		p3.setAge(36);
//		p3.setNom("DOL");
//		service.modifierPersonne(p3);
	
//		// Lister personne
//		for (Personne p2 : service.findAllpersonnes()) {
//			System.out.println(p2);
//		}

		// Lister avec condition
//	for (Personne p1: service.rechercherParMC("ze")) {
//		System.out.println(p1);
	//}
		
//		//Jointure de personne à connexion
//		for(Personne pers:service.findAllPersonnesConnexion()) {
//			System.out.println(pers + " "+pers.getConnexion());
//		}
	
		//Jointure de personne à adresse (cela donne le toString de adresse)
//				for(Personne pers:service.findAllPersonnesAdresse()) {
//					System.out.println(pers + " "+pers.getAdresse());
//				}
		
	// Adresse
		
//	 Adresse a = new Adresse();
//	a.setNomRue("bld jean jaures");
//	a.setNumRue ("31");
//	a.setCp("94200");
//	a.setVille("Nogent");
//	service.ajouterAdresse(a);

		//GetAdresse(permet d'afficher juste ou afficher et supprimer ce qui met en getReference dans IdaoImpl)
//	  Adresse a3= service.affichageAdresse(3);
//	  System.out.println(a3);
//			
			//SUPPRIMER UNE ADRESSE
//		Adresse a3 = new Adresse();
//		a3 = service.getAdresse(3);
//		service.supprimerAdresse(a3);
//			
			//MISE A JOUR DE PERSONNE
//			Adresse a2 = new Adresse();
//	a2 = service.affichageAdresse(2);
//	 a2.setNomRue("bld jean jaures");
//     a2.setNumRue ("42");
//    service.modifierAdresse(a2);
		
//			// Lister Adresse
//			for (Adresse p2 : service.findAlladresses()) {
//			System.out.println(p2);
//			}

//			// Lister adresse avec condition
//		for (Adresse a1: service.rechercherParMC("ur")) {
//		System.out.println(a1);
//		}
		
       //Exemple opération d'ajouter une personne à une adresse en cascade 
//      Personne p= new Personne();
//      Adresse a = new Adresse();
//      a.setCp("37100");
//      a.setNomRue("Avenue de Danemark");
//      a.setNumRue("27");
//      a.setVille(("Lille");
//      p.setNom("BOZ");
//      p.setPrenom ("Larissa");
//      p.setAge(40);
//      p.setAdresse(a);
//      service.ajouterPersonne(p);
//      
      
	
	}
	}
