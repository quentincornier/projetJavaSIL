package projetJava;

public class Micro extends Article{
	
	protected boolean sansFil;

	// constructeur
	public Micro(String reference, String marque, String intitule,
			double prixParJour, int nbEnStock, boolean sansFil) {
		super(reference, marque, intitule, prixParJour, nbEnStock);
		this.sansFil = sansFil;
	}

	// getter et setter
	public boolean isSansFil() {
		return sansFil;
	}
	public void setSansFil(boolean sansFil) {
		this.sansFil = sansFil;
	}
	
// fin classe	
}
