package examen2019.question2;

public class Accompagnateur extends Personne {
	private String numGSM;
	public Accompagnateur(String nom, String prenom, Date dateNaissance, String numGSM) {
		super(nom, prenom, dateNaissance);
		this.numGSM = numGSM;
	}
	
	public String toString() {
		return super.toString()+ "\tNuméro de GSM : "+numGSM;
	}

}
