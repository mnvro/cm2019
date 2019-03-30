package cours09.controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cours09.modele.Joueur;
import cours09.vue.JFrameJoueur;

public class ApplicationJoueur implements ActionListener {
	private JFrameJoueur jFrameJoueur;
	private Joueur joueur;
	
	public ApplicationJoueur() {
		jFrameJoueur = new JFrameJoueur();
		jFrameJoueur.addActionJBUtton(this);
	}
	
	public static void main(String[] args) {
		ApplicationJoueur applicationJoueur = new ApplicationJoueur();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nom = jFrameJoueur.getNom();
		String prenom = jFrameJoueur.getPrenom();
		joueur = new Joueur(nom, prenom);
		jFrameJoueur.afficheDansJTexteArea(Joueur.getListeJoueurs().toString());		
	}

}
