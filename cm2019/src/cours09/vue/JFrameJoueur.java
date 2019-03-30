package cours09.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cours09.modele.Joueur;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class JFrameJoueur extends JFrame {

	private JPanel contentPane;
	private JTextField jTextFieldNom;
	private JTextField jTextFieldPrenom;
	private JButton jButtonInscription;
	private JTextArea jTextArea;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameJoueur frame = new JFrameJoueur();
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
	public JFrameJoueur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNom = new JLabel("Nom:");
		GridBagConstraints gbc_lblNom = new GridBagConstraints();
		gbc_lblNom.insets = new Insets(0, 0, 5, 5);
		gbc_lblNom.anchor = GridBagConstraints.EAST;
		gbc_lblNom.gridx = 0;
		gbc_lblNom.gridy = 0;
		contentPane.add(lblNom, gbc_lblNom);
		
		jTextFieldNom = new JTextField();
		jTextFieldNom.setText("Nom");
		GridBagConstraints gbc_jTextFieldNom = new GridBagConstraints();
		gbc_jTextFieldNom.insets = new Insets(0, 0, 5, 0);
		gbc_jTextFieldNom.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldNom.gridx = 1;
		gbc_jTextFieldNom.gridy = 0;
		contentPane.add(jTextFieldNom, gbc_jTextFieldNom);
		jTextFieldNom.setColumns(10);
		
		JLabel lblPrnom = new JLabel("Pr\u00E9nom:");
		GridBagConstraints gbc_lblPrnom = new GridBagConstraints();
		gbc_lblPrnom.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrnom.anchor = GridBagConstraints.EAST;
		gbc_lblPrnom.gridx = 0;
		gbc_lblPrnom.gridy = 1;
		contentPane.add(lblPrnom, gbc_lblPrnom);
		
		jTextFieldPrenom = new JTextField();
		jTextFieldPrenom.setText("Pr\u00E9nom");
		GridBagConstraints gbc_jTextFieldPrenom = new GridBagConstraints();
		gbc_jTextFieldPrenom.insets = new Insets(0, 0, 5, 0);
		gbc_jTextFieldPrenom.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldPrenom.gridx = 1;
		gbc_jTextFieldPrenom.gridy = 1;
		contentPane.add(jTextFieldPrenom, gbc_jTextFieldPrenom);
		jTextFieldPrenom.setColumns(10);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTextFieldNom.setText("");
				jTextFieldPrenom.setText("");
			}
		});
		GridBagConstraints gbc_btnAnnuler = new GridBagConstraints();
		gbc_btnAnnuler.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnnuler.gridx = 0;
		gbc_btnAnnuler.gridy = 2;
		contentPane.add(btnAnnuler, gbc_btnAnnuler);
		
		jButtonInscription = new JButton("Insciption");
		GridBagConstraints gbc_btnInsciption = new GridBagConstraints();
		gbc_btnInsciption.insets = new Insets(0, 0, 5, 0);
		gbc_btnInsciption.gridx = 1;
		gbc_btnInsciption.gridy = 2;
		contentPane.add(jButtonInscription, gbc_btnInsciption);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 3;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		jTextArea = new JTextArea();
		scrollPane.setViewportView(jTextArea);
		this.setVisible(true);
	}
	
	public void addActionJBUtton(ActionListener al) {
		jButtonInscription.addActionListener(al);
	}
	
	public String getNom() {
		return jTextFieldNom.getText();
	}
	public String getPrenom() {
		return jTextFieldPrenom.getText();
	}
	public void afficheDansJTexteArea(String s) {
		jTextArea.setText(s);
	}
}
