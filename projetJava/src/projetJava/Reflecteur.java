package projetJava;

import java.util.Map;

public class Reflecteur extends Article {
	
	protected Map<Integer,Integer> taille; // <longueur,largeur> en cm
	
	public Reflecteur(String reference, String marque, String intitule,
			double prixParJour, int nbEnStock, Map<Integer,Integer> taille) {
		super(reference, marque, intitule, prixParJour, nbEnStock);
		this.taille = taille;
	}
	
	// getter et setter
	public Map<Integer, Integer> getTaille() {
		return taille;
	}
	public void setTaille(Map<Integer, Integer> taille) {
		this.taille = taille;
	}

		
// fin classe
}
