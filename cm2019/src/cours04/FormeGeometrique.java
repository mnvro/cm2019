package cours04;

public abstract class FormeGeometrique {
	protected String uniteDeMesure = "m";
	public abstract double getAire();
	public String toString() {
		return "La figure a "+ getAire() + " " + uniteDeMesure + "²" + " de surface";
	}
}
