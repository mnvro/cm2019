package cours04;

public class Cercle extends FormeGeometrique {
	private double rayon;
	
	public double getAire() {
		return Math.PI * Math.pow(rayon, 2);
	}
	
	public static void main(String[] args) {
		Cercle cercle = new Cercle();
		cercle.rayon = 5;
		cercle.uniteDeMesure = "cm";
		System.out.println(cercle);
	}

}
