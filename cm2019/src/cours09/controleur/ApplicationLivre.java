package cours09.controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cours09.modele.Livre;
import cours09.vue.JFrameLivre;

public class ApplicationLivre implements ActionListener {
	private JFrameLivre jFrameLivre;
	private Livre livre;
	
	public ApplicationLivre() {
		jFrameLivre = new JFrameLivre();
		jFrameLivre.addActionJbutton(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String auteur = jFrameLivre.getAuteur();
		int nbPages = jFrameLivre.getNbPages();
		String titre = jFrameLivre.getTitre();
		livre = new Livre(titre, auteur, nbPages);
		jFrameLivre.afficheTousLesLivres();
	}

	public static void main(String[] args) {
		ApplicationLivre applicationLivre = new ApplicationLivre();
	}
}
