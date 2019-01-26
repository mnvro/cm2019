package cours03;

import javax.swing.JOptionPane;

public class Student3 {
	private static int nbStudents=0;
	private static int latin=0;
	private static int math=0;
	private static int french=0;

	private String name;
	private String surname;
	private int id;
	private int results[] = new int [3];

	public Student3() {
		nbStudents++;
	}
	public Student3(String name, String surname, int id) {
		this();
		this.name = name;
		this.surname = surname;
		this.id = id;
	}
	public static void getClassAvg() {
		JOptionPane.showMessageDialog(null, "Latin average result: "+(latin/nbStudents)+"/20\nMath average result: "+(math/nbStudents)+"/20\nFrench average result: "+(french/nbStudents)+"/20");
		//	JOptionPane.showMessageDialog(null, "Math average : "+(math/nbStudents));
		//JOptionPane.showMessageDialog(null, "Latin average : "+(french/nbStudents));
	}
	public void setResults() {
		String tmpString;

		for(int i=0;i<3;i++) {
			do {	
				tmpString = JOptionPane.showInputDialog("Enter "+this.surname+"'s result no. "+(i+1)+": ");
				results[i] = Integer.parseInt(tmpString);
			}while (results[i] < 0 || results[i] > 20);
		}
		latin += this.results[0];
		math += this.results[1];
		french += this.results[2];
	}
	public double avgResults() {
		int i;
		double avgresult = 0;

		for(i=0;i<3;i++) {
			avgresult += results[i];
		}
		return avgresult;
	}
	public static int compare(Student3 firststudent,Student3 secondstudent) {
		//		if(firststudent.avgResults() > secondstudent.avgResults()) {
		//			JOptionPane.showMessageDialog(null, firststudent.surname+"'s average result is bigger than "+secondstudent.surname);
		//		}else {
		//			JOptionPane.showMessageDialog(null, secondstudent.surname+"'s average result is bigger than "+firststudent.surname);
		//		}
		return (int)(firststudent.avgResults() - secondstudent.avgResults());
	}
	public int compare(Student3 secondstudent) {

		return (int)(this.avgResults() - secondstudent.avgResults());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 gio = new Student3("Chiva","Giovanni",1);
		Student3 youssef = new Student3("Naji","Youssef",2);
		Student3 rexhep = new Student3("Cala","Rexhep",3);

		gio.setResults();
		gio.avgResults();
		youssef.setResults();
		youssef.avgResults();
		rexhep.setResults();
		rexhep.avgResults();

		Student3.getClassAvg();
		if(gio.compare(youssef)>0) {
			JOptionPane.showMessageDialog(null, gio.surname+"'s average result is bigger than "+youssef.surname);
		}else {
			JOptionPane.showMessageDialog(null, youssef.surname+"'s average result is bigger than "+gio.surname);
		}
		
	}

}
