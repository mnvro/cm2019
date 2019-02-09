package cours04;

public class Etudiant extends Personne {
	private int num;
	public Etudiant() {
		super();
	}
	public Etudiant(String nom, String prenom, Date dateNaissance, int num) {
		super(nom, prenom, dateNaissance);
		this.num = num;
	}	
	public String toString() {
		return super.toString() + " Numéro : " + num;
	}
	public static void main(String[] args) {
		Date date = new Date ("30/5/1989");
		Personne p = new Personne("Chiva","Giovanni", new Date("10/3/1993"));
		Etudiant etu = new Etudiant("Collette","Dylan",new Date("30/4/1997"),5);
		System.out.println("Date = " + date);
		System.out.println("Personne = " + p);
		System.out.println("Etudiant = " + etu);
	}
}
