package cours01;

public class MainEtatEtudiant {
	
	public static void main(String[] args) {
		
		EtatEtudiant actif = new EtatEtudiant("Jean");
		System.out.println(actif);

		EtatEtudiant repos = new EtatEtudiant("Billy");
		System.out.println(repos);
		
	}

}
