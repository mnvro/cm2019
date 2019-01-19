package cours01;

import javax.swing.JOptionPane;

public class StudentCalcul {
	private String lastName;
	private String firstName;
	private int answerNbr = 0;
	private int goodAnswerNbr;
	
	public double moyenne() {
		return (double)goodAnswerNbr / answerNbr;
		
	}


	public void calcul() {
		int a, b, i, answer;
		
		for(i=0; i<3; i++) {
			a = (int)(Math.random() *10);
			b =(int)(Math.random() *10);
			String titre;
			titre = "Pour l'instant : "+goodAnswerNbr+"/"+i;
			answer = Integer.parseInt(JOptionPane.showInputDialog(null,"Quelle est la valeur de" + " " + a + "+" + b + "?",titre,3));
			if (answer == a + b) {
				goodAnswerNbr ++;
			}
		}
		answerNbr = i;
		JOptionPane.showMessageDialog(null, "M." + " "+ lastName + " " + firstName + " " +  "vous avez obtenu"+ " " + goodAnswerNbr + "/" + i ,"title", 1);
	}

	@Override
	public String toString() {
		return "StudentCalcul [lastName=" + lastName + ", firstName=" + firstName + ", answerNbr=" + answerNbr
				+ ", goodAnswerNbr=" + goodAnswerNbr + ", moyenne()=" + moyenne() + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub


		StudentCalcul sc1 = new StudentCalcul();
		sc1.lastName = "Einstein";
		sc1.firstName = "Albert";
		
		sc1.goodAnswerNbr=0;

		sc1.calcul();
		System.out.println(sc1);

		StudentCalcul sc2 = new StudentCalcul();
		sc2.lastName = "Syszlak";
		sc2.firstName = "Moe";
		
		sc2.goodAnswerNbr = 0;



		sc2.calcul();








	}

}
