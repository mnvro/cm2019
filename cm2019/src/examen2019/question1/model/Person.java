package examen2019.question1.model;

public class Person {
	private double height;
	private double mass;
	public double getBMI() {
		return mass/Math.pow(height, 2);
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getMass() {
		return mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	
}
