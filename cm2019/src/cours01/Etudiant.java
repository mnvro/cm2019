package cours01;

public class Etudiant {
	
	private String nom;
	private String prenom;
	private int num;
	
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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prénom=" + prenom + ", num=" + num + "]";
	}

	public static void main(String[] args) {
		Etudiant etu1 = new Etudiant();
		etu1.nom = "Castiaux";
		etu1.prenom = "Julien";
		etu1.num = 42;
		
		Etudiant etu2 = new Etudiant();
		etu2.nom = "Dupont";
		etu2.prenom = "Jérémy";
		etu2.num = 3;
	}
	
	
}
