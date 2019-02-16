package cours05;

import javax.swing.JFrame;

/**
 * Exemple de l'utilisation de la classe JFrame mais ce n'est pas OO
 * @author mnv
 *
 */
public class MainJFrame {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		jFrame.setVisible(true);
//		jFrame.setSize(600,400);
		jFrame.setBounds(100, 50, 400, 200);
		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jFrame.setTitle("Titre");
	}

}
