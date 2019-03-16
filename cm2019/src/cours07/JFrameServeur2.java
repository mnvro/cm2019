package cours07;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class JFrameServeur2 extends JFrame {

	private JPanel contentPane;
	private JTextField jTextField;
	private JLabel lblAuteurDuLivre;
	private JTextField textField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameServeur2 frame = new JFrameServeur2();
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
	public JFrameServeur2() {
		setTitle("Le serveur");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblMessageEnvoyer = new JLabel("Titre du livre");
		GridBagConstraints gbc_lblMessageEnvoyer = new GridBagConstraints();
		gbc_lblMessageEnvoyer.anchor = GridBagConstraints.EAST;
		gbc_lblMessageEnvoyer.insets = new Insets(0, 0, 5, 5);
		gbc_lblMessageEnvoyer.gridx = 0;
		gbc_lblMessageEnvoyer.gridy = 0;
		contentPane.add(lblMessageEnvoyer, gbc_lblMessageEnvoyer);
		
		jTextField = new JTextField();
		GridBagConstraints gbc_jTextField = new GridBagConstraints();
		gbc_jTextField.insets = new Insets(0, 0, 5, 0);
		gbc_jTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextField.gridx = 1;
		gbc_jTextField.gridy = 0;
		contentPane.add(jTextField, gbc_jTextField);
		jTextField.setColumns(10);
		
		lblAuteurDuLivre = new JLabel("Auteur du livre");
		GridBagConstraints gbc_lblAuteurDuLivre = new GridBagConstraints();
		gbc_lblAuteurDuLivre.anchor = GridBagConstraints.EAST;
		gbc_lblAuteurDuLivre.insets = new Insets(0, 0, 5, 5);
		gbc_lblAuteurDuLivre.gridx = 0;
		gbc_lblAuteurDuLivre.gridy = 1;
		contentPane.add(lblAuteurDuLivre, gbc_lblAuteurDuLivre);
		
		textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		
		JButton btnEnvoyer = new JButton("Envoyer");
		GridBagConstraints gbc_btnEnvoyer = new GridBagConstraints();
		gbc_btnEnvoyer.insets = new Insets(0, 0, 5, 0);
		gbc_btnEnvoyer.gridwidth = 3;
		gbc_btnEnvoyer.gridx = 0;
		gbc_btnEnvoyer.gridy = 2;
		contentPane.add(btnEnvoyer, gbc_btnEnvoyer);
		
		textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 2;
		gbc_textArea.insets = new Insets(0, 0, 0, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 3;
		
		contentPane.add(textArea, gbc_textArea);
	}

}
