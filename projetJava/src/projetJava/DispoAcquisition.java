package projetJava;
import java.util.Map;

public class DispoAcquisition extends Article {

	protected String typObjectif;
	protected int nbPixels; //en millions
	protected Map<Integer,Integer> resolution; // ex : 1920x1080
	
	// constructeur
	public DispoAcquisition(String reference, String marque, String intitule,
			double prixParJour, int nbEnStock, String typObjectif, int nbPixels, Map<Integer,Integer> resolution) {
		super(reference, marque, intitule, prixParJour, nbEnStock);
		this.nbPixels = nbPixels;
		this.typObjectif = typObjectif;
		this.resolution = resolution;
	}

	// getters et setters
	public String getTypObjectif() {
		return typObjectif;
	}
	public void setTypObjectif(String typObjectif) {
		this.typObjectif = typObjectif;
	}
	public int getNbPixels() {
		return nbPixels;
	}
	public void setNbPixels(int nbPixels) {
		this.nbPixels = nbPixels;
	}
	public Map<Integer, Integer> getResolution() {
		return resolution;
	}
	public void setResolution(Map<Integer, Integer> resolution) {
		this.resolution = resolution;
	}
	
}
