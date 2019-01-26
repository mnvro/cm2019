package cours02;


public class Personne {

	private double weight  = 80 ;
	private double height =  1.72 ;

	public double getIMC() {
		return weight / (height * height);
	}

	public Personne() {
	}

	public String toString() {
		String s = "weight = " + weight + " kg, height = " + height + " m, getIMC()=" + getIMC() + "";
		double imc = getIMC();
		if(imc<18) {
			s +=" vous étes trop maigre";
		}
		if(18<imc && 24>imc){
			s += " vous étes normal";
		}
		if(24<imc && 29>imc){ 
			s+=" vous étes en surpoids";
		}
		return s;
	}

	public Personne(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	}



	public static void main(String[] args) {

		Personne p = new Personne();
		double imc = p.getIMC();
		System.out.println(p);

	}




}