package cours09.controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cours09.modele.Date;
import cours09.vue.JFrameAffichage;
import cours09.vue.JFrameNouvelleDate;

public class Application implements ActionListener {
	private Date date;
	private JFrameAffichage jFrameAffichage;
	private JFrameNouvelleDate jFrameNouvelleDate;
	
	public Application() {
		jFrameAffichage = new JFrameAffichage();
		jFrameNouvelleDate = new JFrameNouvelleDate();
		jFrameNouvelleDate.addActionAuJButton(this);
	}
	public static void main(String[] args) {
		Application application = new Application();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Date date = new Date(jFrameNouvelleDate.getDate());
		jFrameAffichage.modifieDate(date);
	}
}
