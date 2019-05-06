package examen2019.question1.view;

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
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class JFrameBMI extends JFrame {

	private JPanel contentPane;
	private JTextField jTextFieldMass;
	private JTextField jTextFiedlHeight;
	private JLabel jLabelResultBMI;
	private JButton jButtonGetBmi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameBMI frame = new JFrameBMI();
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
	public JFrameBMI() {
		setTitle("BMI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 176);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblMass = new JLabel("Mass (in kg):");
		GridBagConstraints gbc_lblMass = new GridBagConstraints();
		gbc_lblMass.anchor = GridBagConstraints.EAST;
		gbc_lblMass.insets = new Insets(0, 0, 5, 5);
		gbc_lblMass.gridx = 0;
		gbc_lblMass.gridy = 0;
		contentPane.add(lblMass, gbc_lblMass);
		
		jTextFieldMass = new JTextField();
		GridBagConstraints gbc_txtMass = new GridBagConstraints();
		gbc_txtMass.insets = new Insets(0, 0, 5, 0);
		gbc_txtMass.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMass.gridx = 1;
		gbc_txtMass.gridy = 0;
		contentPane.add(jTextFieldMass, gbc_txtMass);
		jTextFieldMass.setColumns(10);
		
		JLabel lblHeight = new JLabel("Height (in m):");
		GridBagConstraints gbc_lblHeight = new GridBagConstraints();
		gbc_lblHeight.anchor = GridBagConstraints.EAST;
		gbc_lblHeight.insets = new Insets(0, 0, 5, 5);
		gbc_lblHeight.gridx = 0;
		gbc_lblHeight.gridy = 1;
		contentPane.add(lblHeight, gbc_lblHeight);
		
		jTextFiedlHeight = new JTextField();
		GridBagConstraints gbc_txtHeight = new GridBagConstraints();
		gbc_txtHeight.insets = new Insets(0, 0, 5, 0);
		gbc_txtHeight.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHeight.gridx = 1;
		gbc_txtHeight.gridy = 1;
		contentPane.add(jTextFiedlHeight, gbc_txtHeight);
		jTextFiedlHeight.setColumns(10);
		
		jButtonGetBmi = new JButton("Get BMI");
		GridBagConstraints gbc_btnGetBmi = new GridBagConstraints();
		gbc_btnGetBmi.gridwidth = 2;
		gbc_btnGetBmi.insets = new Insets(0, 0, 5, 0);
		gbc_btnGetBmi.gridx = 0;
		gbc_btnGetBmi.gridy = 2;
		contentPane.add(jButtonGetBmi, gbc_btnGetBmi);
		
		jLabelResultBMI = new JLabel("BMI =");
		GridBagConstraints gbc_lblBmi = new GridBagConstraints();
		gbc_lblBmi.gridwidth = 2;
		gbc_lblBmi.gridx = 0;
		gbc_lblBmi.gridy = 3;
		contentPane.add(jLabelResultBMI, gbc_lblBmi);
		this.setVisible(true);
	}
	
	public double getMass() {
		return Double.parseDouble(jTextFieldMass.getText());
	}
	
	public double getHeight_() {
		return Double.parseDouble(jTextFiedlHeight.getText());
	}
	
	public void setResult(Double resultat) {
		jLabelResultBMI.setText("BMI = "+resultat);
	}
	
	public void addAction(ActionListener al) {
		jButtonGetBmi.addActionListener(al);
	}
	
}
