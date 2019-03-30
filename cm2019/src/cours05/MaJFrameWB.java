package cours05;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MaJFrameWB extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField jTextFielNom;
	private JLabel jLabelNom;
	private JButton jButtonOK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaJFrameWB frame = new MaJFrameWB();
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
	public MaJFrameWB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		jLabelNom = new JLabel("Nom :");
		GridBagConstraints gbc_jLabelNom = new GridBagConstraints();
		gbc_jLabelNom.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelNom.anchor = GridBagConstraints.EAST;
		gbc_jLabelNom.gridx = 1;
		gbc_jLabelNom.gridy = 1;
		contentPane.add(jLabelNom, gbc_jLabelNom);
		
		jTextFielNom = new JTextField();
		GridBagConstraints gbc_jTextFielNom = new GridBagConstraints();
		gbc_jTextFielNom.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFielNom.insets = new Insets(0, 0, 5, 0);
		gbc_jTextFielNom.gridx = 2;
		gbc_jTextFielNom.gridy = 1;
		contentPane.add(jTextFielNom, gbc_jTextFielNom);
		jTextFielNom.setColumns(10);
		
		jButtonOK = new JButton("OK");
		jButtonOK.addActionListener(this);
		GridBagConstraints gbc_jButtonOK = new GridBagConstraints();
		gbc_jButtonOK.gridx = 2;
		gbc_jButtonOK.gridy = 2;
		contentPane.add(jButtonOK, gbc_jButtonOK);
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("Bonjour "+jTextFielNom.getText());
	}

}
