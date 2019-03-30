package cours09.modele;

import java.util.ArrayList;

public class Livre {
	private String titre, auteur;
	private int nbPages;
	
	private static ArrayList<Livre> listeLivres = new ArrayList<Livre>();

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNbPages() {
		return nbPages;
	}

	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	public static ArrayList<Livre> getListeLivres() {
		return listeLivres;
	}

	public static void setListeLivres(ArrayList<Livre> listeLivres) {
		Livre.listeLivres = listeLivres;
	}

	public Livre(String titre, String auteur, int nbPages) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.nbPages = nbPages;
		listeLivres.add(this);
	}

	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + ", nbPages=" + nbPages + "]\n";
	}
	
	

}
