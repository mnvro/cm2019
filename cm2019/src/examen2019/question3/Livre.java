package examen2019.question3;

import java.io.Serializable;

public class Livre implements Serializable {
	private String titre;
	private String auteur;
	private int nbPages;
	public Livre(String titre, String auteur, int nbPages) {
		this.titre = titre;
		this.auteur = auteur;
		this.nbPages = nbPages;
	}
	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + ", nbPages=" + nbPages + "]";
	}
	
}
