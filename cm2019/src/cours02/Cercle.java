package cours02;

public class Cercle {
	private Point centre;
	private double rayon;
	
	public Cercle(Point centre, double rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}

	public Cercle() {
	}
	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(new Point('C',2,2), 5);
		
	}


}
