package cours03;

import cours02.Point;

/**
 * La classe Cercle permet de repr�senter des cercles
 * L'unit� par d�faut est le m�tre
 * @author mnv
 *
 */
public class Cercle {
	private Point centre;
	private double rayon;
	
	public void agrandit(double facteur) {
		rayon *= facteur;
	}
	
	public double getAire() {
		return Math.PI * rayon * rayon;
	}
	
	/**
	 * Cette m�thode permet de calculer le p�rim�tre du cercle
	 * @return le p�rim�tre du cercle en m�tres
	 */
	public double getPerimetre() {
		return 2 * Math.PI * rayon;
	}
	
	/**
	 * Ce constructeur contruit un cercel
	 * @param centre le centre du cercle sur le rep�re orthonorm�
	 * @param rayon le rayon du cercle en m�tre
	 */
	public Cercle(Point centre, double rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}
	
	public String toString() {
		String s = "Cercle de centre "+centre.toString()+" et de rayon "+rayon+ " m�tres et son aire = "+getAire() + " m�";
		return s;
	}
	public Cercle() {
	}
	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(new Point('C',2,2), 5);
		System.out.println(cercle1);
		cercle1.agrandit(0.5);
		System.out.println(cercle1);
	}


}
