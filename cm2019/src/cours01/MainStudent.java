package cours01;


import javax.swing.JOptionPane;

public class MainStudent {

	public static void main(String[] args) {
		///Création d'instance
		Student student1 = new Student("Chiva","Giovanni",10);
		
		///Méthodes
		student1.grades();
		student1.avgGrades();
	}
}
