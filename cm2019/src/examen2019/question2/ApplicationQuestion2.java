package examen2019.question2;

import java.util.Arrays;

//�	Baratheon Tommen n� le 12/12/1989 est une personne � mobilit� r�duite, 
//�	Mervault Davos n� le 15/3/1991 est une personne qui est sourde,
//�	Frey Walder n� le 1/1/1993 est une personne aveugle,
//�	Lannister Tyrion n� le 2/2/1980 est un accompagnateur, son num�ro de GSM est le 0488/10.10.47.

public class ApplicationQuestion2 {
	public static void main(String[] args) {
		Personne tabPersonnes[] = new Personne[4];
		tabPersonnes[0] = new PersonneEnSituationDeHandicap("Baratheon", "Tommen", new Date("12/1/1989"), "mobilit� r�duite");
		tabPersonnes[1] = new PersonneEnSituationDeHandicap("Mervault", "Davos", new Date("15/3/1991"), "sourde");
		tabPersonnes[2] = new PersonneEnSituationDeHandicap("Frey", "Walder", new Date("1/1/1993"), "aveugle");
		tabPersonnes[3] = new Accompagnateur("Lannister", "Tyrion", new Date("2/2/1980"), "0488/10.10.47");
		
		Arrays.sort(tabPersonnes);
		for (int i = 0; i < tabPersonnes.length; i++) {
			System.out.println(tabPersonnes[i]);
		}
	}

}
