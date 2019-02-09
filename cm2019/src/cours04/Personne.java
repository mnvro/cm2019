package cours04;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Personne implements Comparable<Personne> {
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
	@Override
	public int compareTo(Personne uneAutrePersonne) {
		//return this.nom.compareToIgnoreCase(uneAutrePersonne.nom);
		return -this.dateNaissance.compareTo(uneAutrePersonne.dateNaissance);
	}
	public static void main(String[] args) {
		Personne tabPersonn[] = new Personne[8];
		tabPersonn[0] = new Personne("Vroman","MN",new Date("30/12/1969"));
		tabPersonn[1]= new Personne("ERRAHMOUNI","Oussama",new Date ("19/12/1990"));
		tabPersonn[2] = new Personne("Thomas","Kevin",new Date ("22/5/1995"));
		tabPersonn[3] = new Personne("Cala","Rexhep",new Date("17/4/1976"));
		tabPersonn[4] = new Personne("AAAA","Jean-luc",new Date("22/9/1984"));
		tabPersonn[5] = new Personne("Collette","Dylan",new Date ("30/4/1997"));
		tabPersonn[6] = new Personne("Munkula Dekamay","Billy", new Date("30/5/1989"));
		tabPersonn[7] = new Personne("Chiva", "Giovanni", new Date("10/3/1993"));
		for (Personne personne : tabPersonn) {
			System.out.println(personne);
		}
		Arrays.sort(tabPersonn);					// sort permet de trier un tableau de Comparables
		System.out.println("===============");
		for (Personne personne : tabPersonn) {
			System.out.println(personne);
		}
	}
}
