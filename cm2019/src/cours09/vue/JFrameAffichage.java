package cours09.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cours09.modele.Date;

import java.awt.FlowLayout;
import javax.swing.JLabel;

public class JFrameAffichage extends JFrame {

	private JPanel contentPane;
	private JLabel jLabelDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameAffichage frame = new JFrameAffichage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameAffichage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		this.setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblLaProchaineRunion = new JLabel("La prochaine r\u00E9union aura lieu le :");
		contentPane.add(lblLaProchaineRunion);
		
		jLabelDate = new JLabel("30/12/2019");
		contentPane.add(jLabelDate);
		
		this.pack();
	}
	public void modifieDate(Date date) {
		jLabelDate.setText(date.toString());
	}
}
