package cours06;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class JFrameAjoutJLabel extends JFrame implements ActionListener {

	private JPanel contentPane;
	private ArrayList<JLabel> listeJLabel = new ArrayList<JLabel>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
					JFrameAjoutJLabel frame = new JFrameAjoutJLabel();
					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameAjoutJLabel() {
		setTitle("Ajoute de JLabel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnAjoutUnJlabel = new JButton("Ajout un jLabel");
		btnAjoutUnJlabel.addActionListener(this);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPane.add(btnAjoutUnJlabel);
		this.setSize(this.getWidth(), this.getHeight()+1);
		//this.setSize(this.getWidth(), this.getHeight()-1);
	}
	public void actionPerformed(ActionEvent e) {
//		System.out.println("on a cliqué");
		JLabel jLabel = new JLabel("Label " + listeJLabel.size());
		listeJLabel.add(jLabel);
		contentPane.add(jLabel);
		this.setVisible(false);this.setVisible(true);
		//this.pack();
	}

}
