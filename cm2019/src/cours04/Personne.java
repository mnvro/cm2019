package cours04;

public class Personne {
	protected String nom;
	private String prenom; // on mettra protected après
	protected Date dateNaissance;
	public Personne() {
	}
	public Personne(String nom, String prenom, Date dateNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	public String toString() {
		return "Nom : " + nom + " Prénom : " + prenom + " Date de naissance : " + dateNaissance.toString() ;
	}
}
