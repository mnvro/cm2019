package cours02;

public class EtatEtudiant {
	private String nom;

	public EtatEtudiant() {
	}

	public EtatEtudiant(String nom) {
		super();
		this.nom = nom;
	}

	public void travaille() {
		System.out.println(nom + " se met au travail");
	}

	public void seRepose() {
		System.out.println(nom +" se repose");
	}


	public static void main(String[] args) {
		EtatEtudiant et1 = new EtatEtudiant("Jean");
		et1.travaille();

		EtatEtudiant et2 = new EtatEtudiant("Billy");
		et2.seRepose();
	}


	@Override
	public String toString() {
		return "EtatEtudiant [nom=" + nom + "]";
	}

}
