package cours01;

import javax.swing.JOptionPane;

public class ExerciceQCM {
	private static int difficultyLvl=0;//Niveau de difficulté compris entre 1 et 5
	private static String exEnonce;//Chaîne de caractères contenant l'énoncé de l'exercice
	private static String[] propTab;//Tableau des propositions
	private int indicBonneReponse;
	
	

	public ExerciceQCM() {
	}



	public ExerciceQCM(int difficultyLvl, String exEnonce, String[]propTab, int indicBonneReponse) {
		this.difficultyLvl = difficultyLvl;
		this.exEnonce = exEnonce;
		this.propTab = propTab;
		this.indicBonneReponse = indicBonneReponse;

//		for (int j=0; difficultyLvl<1||difficultyLvl>5;j++) {
//			difficultyLvl = Integer.parseInt(JOptionPane.showInputDialog("Veuillez choisir votre niveau de difficulte entre 1 et 5. 5 etant le niveau le plus difficile"));
//		}
//		if(difficultyLvl==1) {
//			exEnonce=("Entrez la valeur de la bonne reponse a la question suivante\nQuelle est la capitale de la Belgique?");
//			JOptionPane.showMessageDialog(null, exEnonce,"title", 3);
//			propTab = new String[3];
//			propTab [0] = ("Bruxelles");
//			propTab [1] = ("Liege");
//			propTab [2] = ("Charleroi");
//
//			indicBonneReponse = 0;
//		}
	}



	public static void main(String[] args) {

		ExerciceQCM exerciceQcm1 = new ExerciceQCM();
		exerciceQcm1.difficultyLvl = 0;
		exerciceQcm1.exEnonce = ("Entrez la valeur de la bonne reponse a la question suivante\\nQuelle est la capitale de la Belgique?");
		String [] propTab = new String [3];
		propTab [0] = ("Bruxelles");
		propTab [1] = ("Liege");
		propTab [2] = ("Charleroi");
		exerciceQcm1.propTab = propTab;
		exerciceQcm1.indicBonneReponse = 0;
		
		exerciceQcm1 = new ExerciceQCM(0,"Entrez la valeur de la bonne reponse a la question suivante\\nQuelle est la capitale de la Belgique?",propTab,0);
		

	}
}


