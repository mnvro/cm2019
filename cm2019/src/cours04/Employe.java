package cours04;

public class Employe extends Personne {
	private double salaire;

	public Employe() {
		super();
	}

	public Employe(String nom, String prenom, Date dateNaissance, double salaire) {
		super(nom, prenom, dateNaissance);
		this.salaire = salaire;
	}
	
	public String toString() {
		return super.toString() + " Salaire = " + salaire + " Euros";
	}
	public static void main(String[] args) {
		Employe employe = new Employe("Munkula Dekamay", "Billy", new Date (30,5,1989), 4000 );
		System.out.println("Employé = " + employe);
	}
}
