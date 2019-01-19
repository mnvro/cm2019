package cours01;

public class Date {
	private int jour;
	private String mois;
	private int annee;
	
	public static void main(String[] args) {
		Date anniversaire = new Date();
		anniversaire.jour = 30;
		anniversaire.mois = "mai";
		anniversaire.annee = 1989;
	}
	public Date(int jour, String mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	public Date() {
	}
	

}
