package cours09.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cours09.modele.Date;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JFrameNouvelleDate extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnModifierDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameNouvelleDate frame = new JFrameNouvelleDate();
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
	public JFrameNouvelleDate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 150, 200);
		this.setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNouvelleDatePour = new JLabel("Nouvelle date pour la prochaine r\u00E9union:");
		contentPane.add(lblNouvelleDatePour);
		
		textField = new JTextField();
		textField.setText("30/12/2019");
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnModifierDate = new JButton("Modifier Date");
		contentPane.add(btnModifierDate);
		
		
		this.pack();
	}
	public String getDate() {
		return textField.getText();
	}
	public void addActionAuJButton(ActionListener actionListener) {
		btnModifierDate.addActionListener(actionListener);
	}

	

}
