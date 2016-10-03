package projetJava;

public class PanneauLed extends Article{

	protected int nbPixels; // nombre de pixels en millions	
	
	// constructeur
	public PanneauLed(String reference, String marque, String intitule, 
			double prixParJour, int nbEnStock, int nbPixels) {
		super(reference, marque, intitule, prixParJour, nbEnStock);
		this.nbPixels = nbPixels;
		
	}

	// getters et setters
	public int getNbPixels() {
		return nbPixels;
	}
	public void setNbPixels(int nbPixels) {
		this.nbPixels = nbPixels;
	}

// fin classe
}
