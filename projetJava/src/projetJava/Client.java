package projetJava;

import java.util.ArrayList;

public class Client {
	private String nom;
	private String prenom;
	private String adresse;
	private int telephone;
	private ArrayList<Location> lesLocations;
	
	//Constructeur 
	public Client(String nom, String prenom, String adresse, int telephone,ArrayList<Location> lesLocations) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.lesLocations=lesLocations;
	}
	
	//Getters et Setters
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public ArrayList<Location> getLesLocations() {
		return lesLocations;
	}

	public void setLesLocations(ArrayList<Location> lesLocations) {
		this.lesLocations = lesLocations;
	}

}
