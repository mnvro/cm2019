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

public class JFrameServeur extends JFrame {

	private JPanel contentPane;
	private JTextField jTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameServeur frame = new JFrameServeur();
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
	public JFrameServeur() {
		setTitle("Le serveur");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblMessageEnvoyer = new JLabel("Message \u00E0 envoyer au client :");
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
		
		JButton btnEnvoyer = new JButton("Envoyer");
		GridBagConstraints gbc_btnEnvoyer = new GridBagConstraints();
		gbc_btnEnvoyer.gridwidth = 2;
		gbc_btnEnvoyer.insets = new Insets(0, 0, 0, 5);
		gbc_btnEnvoyer.gridx = 0;
		gbc_btnEnvoyer.gridy = 1;
		contentPane.add(btnEnvoyer, gbc_btnEnvoyer);
	}

}
