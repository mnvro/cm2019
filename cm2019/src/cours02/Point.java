package cours02;

public class Point {
	private double abscisse;
	private double ordonnee;

	public Point() {
	}
	public Point(double abscisse, double ordonnee) {
		super();
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}
	public double getAbscisse() {
		return abscisse;
	}
	public void setAbscisse(double abscisse) {
		this.abscisse = abscisse;
	}
	public double getOrdonnee() {
		return ordonnee;
	}
	public void setOrdonnee(double ordonnee) {
		this.ordonnee = ordonnee;
	}
	public String toString() {
		return "Point [abscisse=" + abscisse + ", ordonnee=" + ordonnee + "]";
	}

	public void translation (double dx,double dy){
		abscisse += dx; // abscisse = abscisse + dx
		ordonnee += dy;
	}

}
