package cours05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Exemple de l'utilisation de la classe JFrame et en OO
 * @author mnv
 *
 */
public class MaJFrame extends JFrame implements MouseListener, ActionListener {
	private JButton jButtonOK;
	private JButton jButtonCancel;
	public MaJFrame() {
		this.setVisible(true);
//		this.setSize(600,400);
		this.setBounds(100, 50, 400, 200);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("Titre");
		this.addMouseListener(this);
		this.getContentPane().setLayout(new FlowLayout());
		jButtonOK = new JButton("OK");
		jButtonOK.addActionListener(this);
		this.getContentPane().add(jButtonOK);
		jButtonCancel = new JButton("Cancel");
		this.getContentPane().add(jButtonCancel);
	}

	public static void main(String[] args) {
		MaJFrame jFrame = new MaJFrame();	
	}
	public void mouseClicked(MouseEvent mouseEvent) {
		System.out.println("On a cliqué en (" + mouseEvent.getX() + "," + mouseEvent.getY() + ")");
		
	}
	public void mouseEntered(MouseEvent arg0) {
//		System.out.println("On est entré");
	}
	public void mouseExited(MouseEvent arg0) {
//		System.out.println("On est sorti");	
	}
	public void mousePressed(MouseEvent arg0) {
//		System.out.println("on a appuyé");	
	}


	public void mouseReleased(MouseEvent arg0) {
//		System.out.println("on a relâché");
	}

	public void actionPerformed(ActionEvent arg0) {
		System.out.println("on a cliqué sur le JButton");
	}

}
