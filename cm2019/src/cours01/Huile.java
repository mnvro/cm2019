package cours01;

public class Huile{

	private String nom;
	private int volume;
	private double prix;	
	
	public Huile(String nom, int volume, double prix) {
		this.nom = nom;
		this.volume = volume;
		this.prix = prix;
	}
	
	public Huile() {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String toString() {
		return "Huile [nom=" + nom + ", volume=" + volume + "ml, prix=" + prix + "€]";
	}

	public static void main(String[] args){

		Huile huile1 = new Huile();
		huile1.nom= "orange sanguine";
		huile1.volume = 10;
		huile1.prix = 2.2;
		System.out.println(huile1);

		Huile huile2 = new Huile();
		huile2.nom= "eucalyptus radié";
		huile2.volume = 30;
		huile2.prix = 5.9;
		System.out.println(huile2);

	}

}
