package cours04;

public class Carre extends FormeGeometrique implements Transformable{
	private Point sommetSuperieurGauche;
	private double cote;
	public double getAire() {
		return cote*cote;
	}
	public String toString() {
		return "Le carré a un cote de " + cote + " " + uniteDeMesure + " " + super.toString();
	}
	public static void main(String[] args) {
		Carre carre = new Carre();
		carre.cote = 5;
		System.out.println(carre);
		
	}

	public void agrandit(double facteur) {
		cote *= facteur;
	}
	@Override
	public void deplace(double deltaX, double deltaY) {
		sommetSuperieurGauche.setAbscisse(sommetSuperieurGauche.getAbscisse() +deltaX);
		sommetSuperieurGauche.setOrdonnee(sommetSuperieurGauche.getOrdonnee() +deltaY);
		
	}
}
