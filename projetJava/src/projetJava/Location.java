package projetJava;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Location {
	private Date dateDebut;
	private Date dateFin;
	private double montant;
	private ArrayList <Article> lesArticles;
	
	//Constructeur
	public Location(Date dateDebut, Date dateFin, double montant,
			ArrayList<Article> lesArticles) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.montant = montant;
		this.lesArticles = lesArticles;
	}
	
	//Getters et Setters
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public ArrayList<Article> getLesArticles() {
		return lesArticles;
	}
	public void setLesArticles(ArrayList<Article> lesArticles) {
		this.lesArticles = lesArticles;
	}
	
	//Calcul du montant de la location en fonction du prix par jour des articles et de la durée
	public void calculMontant(){
		double prix=0;
		long diff = this.dateDebut.getTime( ) - this.getDateFin().getTime( );
		for(Article article :this.lesArticles ){
			prix+=article.getPrixParJour()*diff;
		}
		this.setMontant(diff);
	}
	

}
