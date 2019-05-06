package examen2019.question2;

public class Personne implements Comparable<Personne> {
	private String nom;
	private String prenom;
	private Date dateNaissance;
	public Personne(String nom, String prenom, Date dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	
	public String toString() {
		return "Nom : "+nom+"\tPrénom : "+prenom+"\tné le "+dateNaissance;
	}

	@Override
	public int compareTo(Personne uneAutrePersonne) {
		return this.nom.compareTo(uneAutrePersonne.nom);
	}
	
}
