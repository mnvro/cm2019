package cours04;

public class Livre {
	protected String titre;
	protected String auteur;
	protected int nbPages;
	protected String categorie;
	
	public Livre() {
	}

	public Livre(String titre, String auteur, int nbPages, String categorie) {
		this.titre = titre;
		this.auteur = auteur;
		this.nbPages = nbPages;
		this.categorie = categorie;
	}

	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + ", nbPages=" + nbPages + ", categorie=" + categorie
				+ "]";
	}
	
}
