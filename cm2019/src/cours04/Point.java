package cours04;

public class Point {
	private double abscisse;
	private double ordonnee;
	public Point(double abscisse, double ordonnee) {
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}
	 public String toString() {
		 return "("+abscisse+","+ordonnee+")";
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
	 
}
