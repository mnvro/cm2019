package cours02;

public class Point {
	char lettre;
	double abscisse;
	double ordonnee;
//	public int rayon;
//	public static double dx = 8;
//	public static double dy = 7;

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
		return lettre+"(" + abscisse + ";" + ordonnee + ")";
	}
	public Point() {
	}
	
	public Point(char lettre, double abscisse, double ordonnee) {
		this.lettre = lettre;
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}
	public void translate(double dx, double dy) {
		abscisse += dx;
		ordonnee += dy;
	}
	public static void main(String[] args) {
		Point a = new Point();
		a.lettre = 'A';
		a.abscisse = 2;
		a.ordonnee = 3;
		System.out.println(a);
		Point b = new Point();
		b.lettre = 'B';
		System.out.println(b);
		a.translate(3, 2);
		b.translate(3,  2);
		System.out.println(a);
		System.out.println(b);
	}
	
	
	
}