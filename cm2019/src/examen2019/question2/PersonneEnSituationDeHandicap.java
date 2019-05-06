package examen2019.question2;

public class PersonneEnSituationDeHandicap extends Personne {
	private String typeDeHandicap;
	public PersonneEnSituationDeHandicap(String nom, String prenom, Date dateNaissance, String typeDeHandicap) {
		super(nom, prenom, dateNaissance);
		this.typeDeHandicap = typeDeHandicap;
	}
	public String toString() {
		return super.toString()+"\tType de handicap : "+typeDeHandicap;
	}
}
