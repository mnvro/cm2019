package cours01;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "message type 0","Titre",JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "message type 1","Titre",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "message type 2","Titre",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "message type 3","Titre",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showConfirmDialog(null, "message", "title", JOptionPane.YES_NO_OPTION);
//		JOptionPane.showConfirmDialog(null, "message", "title", 1);
//		JOptionPane.showConfirmDialog(null, "message", "title", 2);
		String nom = JOptionPane.showInputDialog("Nom ? ");
		JOptionPane.showMessageDialog(null, "Bonjour "+nom);
	}

}
