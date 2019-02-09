package cours03;

import cours02.Point;

/**
 * La classe Cercle permet de représenter des cercles
 * L'unité par défaut est le mètre
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
	 * Cette méthode permet de calculer le périmètre du cercle
	 * @return le périmètre du cercle en mètres
	 */
	public double getPerimetre() {
		return 2 * Math.PI * rayon;
	}
	
	/**
	 * Ce constructeur contruit un cercel
	 * @param centre le centre du cercle sur le repère orthonormé
	 * @param rayon le rayon du cercle en mètre
	 */
	public Cercle(Point centre, double rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}
	
	public String toString() {
		String s = "Cercle de centre "+centre.toString()+" et de rayon "+rayon+ " mètres et son aire = "+getAire() + " m²";
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
