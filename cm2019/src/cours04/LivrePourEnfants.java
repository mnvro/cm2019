package cours04;

import java.util.ArrayList;

public class LivrePourEnfants extends Livre {
	private String trancheAge;

	public LivrePourEnfants() {
	}

	public LivrePourEnfants(String titre, String auteur, int nbPages, String trancheAge) {
		super(titre, auteur, nbPages, "Livre pour enfant");
		this.trancheAge = trancheAge;
	}

	@Override
	public String toString() {
		return "LivrePourEnfants [trancheAge=" + trancheAge + ", titre=" + titre + ", auteur=" + auteur + ", nbPages="
				+ nbPages + ", categorie=" + categorie + "]";
	}
	
	public static void main(String[] args) {
		Livre livre1 = new Livre("L'étranger", "Albert Camus", 191, "Roman");
		Livre livre2 = new Livre("101 expériences de philosophie quotidienne", "Roger-Pol Droit", 259, "Philosophie");
		LivrePourEnfants livre3 = new LivrePourEnfants("T'choupi à l'école", "Thierry Courtin", 32, "0 à 2 ans");
		Livre livre4 = new Livre("Programmer en Java", "Claude Delannoy", 916, "Informatique");
		LivrePourEnfants livre5 = new LivrePourEnfants("La couleur des émotions", "Anna Llenas", 20, "3 à 5 ans");
		System.out.println(livre1);
		System.out.println(livre2);
		System.out.println(livre3);
		System.out.println(livre4);
		System.out.println(livre5);
		System.out.println("=========================");
		ArrayList<Livre> listeLivres = new ArrayList<Livre>();
		listeLivres.add(livre1);
		listeLivres.add(livre2);
		listeLivres.add(livre3);
		listeLivres.add(livre4);
		listeLivres.add(livre5);
		
		for (Livre livre : listeLivres) {
			System.out.println(livre);
		}
		
	}
	
	
}
