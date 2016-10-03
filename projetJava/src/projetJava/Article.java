package projetJava;

public class Article {
	
	protected String reference;
	protected String marque;
	protected String intitule;
	protected double prixParJour;
	protected int nbEnStock;
	
	// constructeur
	public Article(String reference, String marque, String intitule, double prixParJour, int nbEnStock) {
		this.reference = reference;
		this.marque = marque;
		this.intitule = intitule;
		this.prixParJour = prixParJour;
		this.nbEnStock = nbEnStock;
	}

	// getters et setters
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public double getPrixParJour() {
		return prixParJour;
	}
	public void setPrixParJour(double prixParJour) {
		this.prixParJour = prixParJour;
	}
	public int getNbEnStock() {
		return nbEnStock;
	}
	public void setNbEnStock(int nbEnStock) {
		this.nbEnStock = nbEnStock;
	}
	
	
	
	
// fin classe	
}
