package cours04;

import cours02.InvalidAgeException;

/**
 * The class person is used to calculate BMI
 * @author Giovanni  and Youssef
 *
 */
public class Person {

	private double weight  = 80 ;
	private double height =  1.72 ;
	private int age = 50;

	/**
	 * Calculate the people's BMI 
	 * @return the people's BMI
	 */
	public double getIMC() throws InvalidAgeException {
		if((age>=18)&&(age<=65))
			return weight / (height * height);
		throw new InvalidAgeException();
	}

	public Person() {
	}

	public String toString() {
		
		try {
			double imc = getIMC();
			String s = "weight = " + weight + " kg, height = " + height + " m, getIMC()=" + imc + "";
			
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
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * This constructor builds a person
	 * @param weight the person's weight in kg
	 * @param height the person's height in m
	 */
	public Person(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	}



	public static void main(String[] args) {

		
		try {
			Person p = new Person();
			p.age = 65;
			double imc = p.getIMC();
			System.out.println(p);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		try {
			Person p2 = new Person(80, 1.90);
			p2.age = 17;
			System.out.println(p2.getIMC());
			System.out.println(p2);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}




}