package cours09.modele;

import java.util.ArrayList;

public class Joueur {
	private String nom, prenom;
	private int num;
	private static int nbJoueurs = 0;
	private static ArrayList<Joueur> listeJoueurs = new ArrayList<Joueur>();

	public static ArrayList<Joueur> getListeJoueurs() {
		return listeJoueurs;
	}
	public static void setListeJoueurs(ArrayList<Joueur> listeJoueurs) {
		Joueur.listeJoueurs = listeJoueurs;
	}
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
	
	public Joueur(String nom, String prenom) {
		super();
		num = nbJoueurs++;
		this.nom = nom;
		this.prenom = prenom;
		listeJoueurs.add(this);
	}
	public Joueur() {
	}
	
	public static void ajouterJoueur(Joueur joueur) {
		listeJoueurs.add(joueur);
	}
	@Override
	public String toString() {
		return "Joueur [nom=" + nom + ", prenom=" + prenom + ", num=" + num + "]\n";
	}
	
	
	
	
}
