package projetJava;

import java.util.Set;

public class Objectif extends Article {
	private Set listeModeleAppareil; 

	//Constructeur
	public Objectif(String reference, String marque, String intitule,
			double prixParJour, int nbEnStock, Set listeModeleAppareil) {
		super(reference, marque, intitule, prixParJour, nbEnStock);
		this.listeModeleAppareil=listeModeleAppareil;
		
	}
	
	//Getters et Setters
	public Set getListeModeleAppareil() {
		return listeModeleAppareil;
	}

	public void setListeModeleAppareil(Set listeModeleAppareil) {
		this.listeModeleAppareil = listeModeleAppareil;
	}

}
