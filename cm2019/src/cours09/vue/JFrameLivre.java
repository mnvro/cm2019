package cours09.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cours09.modele.Livre;

import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class JFrameLivre extends JFrame {

	private JPanel contentPane;
	private JTextField jTextFieldTitre;
	private JTextField jTextFieldNbPages;
	private JTextField jTextFieldAuteur;
	private JTextArea jTextArea;
	private JButton jButtonAjouterLivre;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameLivre frame = new JFrameLivre();
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
	public JFrameLivre() {
		setTitle("Ajouter des livres");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 300);
		this.setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
//		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblTitre = new JLabel("Titre:");
		GridBagConstraints gbc_lblTitre = new GridBagConstraints();
		gbc_lblTitre.anchor = GridBagConstraints.EAST;
		gbc_lblTitre.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitre.gridx = 0;
		gbc_lblTitre.gridy = 0;
		contentPane.add(lblTitre, gbc_lblTitre);
		
		jTextFieldTitre = new JTextField();
		GridBagConstraints gbc_jTextFieldTitre = new GridBagConstraints();
		gbc_jTextFieldTitre.insets = new Insets(0, 0, 5, 0);
		gbc_jTextFieldTitre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldTitre.gridx = 1;
		gbc_jTextFieldTitre.gridy = 0;
		contentPane.add(jTextFieldTitre, gbc_jTextFieldTitre);
		jTextFieldTitre.setColumns(10);
		
		JLabel lblAuteur = new JLabel("Auteur:");
		GridBagConstraints gbc_lblAuteur = new GridBagConstraints();
		gbc_lblAuteur.anchor = GridBagConstraints.EAST;
		gbc_lblAuteur.insets = new Insets(0, 0, 5, 5);
		gbc_lblAuteur.gridx = 0;
		gbc_lblAuteur.gridy = 1;
		contentPane.add(lblAuteur, gbc_lblAuteur);
		
		jTextFieldAuteur = new JTextField();
		GridBagConstraints gbc_jTextFieldAuteur = new GridBagConstraints();
		gbc_jTextFieldAuteur.insets = new Insets(0, 0, 5, 0);
		gbc_jTextFieldAuteur.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldAuteur.gridx = 1;
		gbc_jTextFieldAuteur.gridy = 1;
		contentPane.add(jTextFieldAuteur, gbc_jTextFieldAuteur);
		jTextFieldAuteur.setColumns(10);
		
		JLabel lblNombreDePages = new JLabel("Nombre de pages:");
		GridBagConstraints gbc_lblNombreDePages = new GridBagConstraints();
		gbc_lblNombreDePages.anchor = GridBagConstraints.EAST;
		gbc_lblNombreDePages.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreDePages.gridx = 0;
		gbc_lblNombreDePages.gridy = 2;
		contentPane.add(lblNombreDePages, gbc_lblNombreDePages);
		
		JButton btnNewButton = new JButton("Annuler");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTextFieldNbPages.setText("");
				jTextFieldTitre.setText("");
				jTextFieldAuteur.setText("");
			}
		});
		
		jTextFieldNbPages = new JTextField();
		jTextFieldNbPages.setText("");
		GridBagConstraints gbc_jTextFieldNbPages = new GridBagConstraints();
		gbc_jTextFieldNbPages.insets = new Insets(0, 0, 5, 0);
		gbc_jTextFieldNbPages.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldNbPages.gridx = 1;
		gbc_jTextFieldNbPages.gridy = 2;
		contentPane.add(jTextFieldNbPages, gbc_jTextFieldNbPages);
		jTextFieldNbPages.setColumns(10);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 3;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		jButtonAjouterLivre = new JButton("Ajouter Livre");
		GridBagConstraints gbc_jButtonAjouterLivre = new GridBagConstraints();
		gbc_jButtonAjouterLivre.insets = new Insets(0, 0, 5, 0);
		gbc_jButtonAjouterLivre.gridx = 1;
		gbc_jButtonAjouterLivre.gridy = 3;
		contentPane.add(jButtonAjouterLivre, gbc_jButtonAjouterLivre);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 4;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		jTextArea = new JTextArea();
		scrollPane.setViewportView(jTextArea);
		this.setVisible(true);
	}
	
	public void afficheTousLesLivres() {
		jTextArea.setText(Livre.getListeLivres().toString());
	}
	
	public void addActionJbutton(ActionListener al) {
		jButtonAjouterLivre.addActionListener(al);
	}
	
	public String getAuteur() {
		return jTextFieldAuteur.getText();
	}
	public String getTitre() {
		return jTextFieldTitre.getText();
	}
	public int getNbPages() {
		return Integer.parseInt(jTextFieldNbPages.getText());
	}

}
