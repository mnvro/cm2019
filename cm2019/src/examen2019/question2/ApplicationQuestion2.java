package examen2019.question2;

import java.util.Arrays;

//•	Baratheon Tommen né le 12/12/1989 est une personne à mobilité réduite, 
//•	Mervault Davos né le 15/3/1991 est une personne qui est sourde,
//•	Frey Walder né le 1/1/1993 est une personne aveugle,
//•	Lannister Tyrion né le 2/2/1980 est un accompagnateur, son numéro de GSM est le 0488/10.10.47.

public class ApplicationQuestion2 {
	public static void main(String[] args) {
		Personne tabPersonnes[] = new Personne[4];
		tabPersonnes[0] = new PersonneEnSituationDeHandicap("Baratheon", "Tommen", new Date("12/1/1989"), "mobilité réduite");
		tabPersonnes[1] = new PersonneEnSituationDeHandicap("Mervault", "Davos", new Date("15/3/1991"), "sourde");
		tabPersonnes[2] = new PersonneEnSituationDeHandicap("Frey", "Walder", new Date("1/1/1993"), "aveugle");
		tabPersonnes[3] = new Accompagnateur("Lannister", "Tyrion", new Date("2/2/1980"), "0488/10.10.47");
		
		Arrays.sort(tabPersonnes);
		for (int i = 0; i < tabPersonnes.length; i++) {
			System.out.println(tabPersonnes[i]);
		}
	}

}
