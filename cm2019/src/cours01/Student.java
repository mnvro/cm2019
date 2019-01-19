package cours01;

import javax.swing.JOptionPane;

public class Student {
///D�claration des variables d'instance///	
	private String name;
	private String surname;
	private int number;
	private float results[] = new float [5];

///D�claration des constructeurs///
	public Student() {	}
	public Student(String name, String surname, int number) {
		this.name = name;
		this.surname = surname;
		this.number = number;
	}

///M�thodes///
	
	///M�thode qui permet d'encoder les r�sultats (entre 0-20)
	public void grades() {
		String tmpStr;
		for(int i=0;i<5;i++) {
			do {
				tmpStr = JOptionPane.showInputDialog("Enter "+this.surname+"'s grade no."+(i+1)+" :" );
				results[i] = Integer.parseInt(tmpStr);
			} while (results[i] < 0 || results[i] > 20);
		}
	}
	
	///M�thode qui calcule la moyenne d'un etudiant
	public void avgGrades() {
		double avg = 0;
		
		for(int i=0;i<5;i++) {
			avg = avg + results[i];
		}
		avg = avg / 5;
		JOptionPane.showMessageDialog(null, name+" "+surname+"'s grades average : "+avg,"Student.java",1);
	}
	
///D�claration des "setters"	
	public void setName() {
		this.name = name;
	}
	public void setSurname() {
		this.surname = surname;
	}
	public void setNumber() {
		this.number = number;
	}
///D�claration des "getters"	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public int getNumber() {
		return number;
	}
	
///M�thode principale "main"	
	public static void main(String[] args) {
		Student julien = new Student();
		Student giovanni = new Student("Chiva","Giovanni",12);
		
		julien.name = "Castiaux";
		julien.surname = "Julien";
		julien.number = 42;
		
		julien.grades();
		julien.avgGrades();
		giovanni.grades();
		giovanni.avgGrades();
	}
}
