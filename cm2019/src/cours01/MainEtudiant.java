package cours01;

public class MainEtudiant {
	public static void main(String[] args) {
		Etudiant etu1 = new Etudiant();
		etu1.setNom ("Castiaux");
		etu1.setPrenom ("Julien");
		etu1.setNum (42);
		System.out.println(etu1);
		
		Etudiant etu2 = new Etudiant();
		etu2.setNom ("Dupont");
		etu2.setPrenom ("Jérémy");
		etu2.setNum (3);
		System.out.println(etu2);
	}
	

}
