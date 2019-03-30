package cours05;

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
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;

public class JFramePing extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField jTextFieldIP;
	private JLabel jLabelResultat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFramePing frame = new JFramePing();
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
	public JFramePing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblAdresseIp = new JLabel("Adresse IP :");
		GridBagConstraints gbc_lblAdresseIp = new GridBagConstraints();
		gbc_lblAdresseIp.anchor = GridBagConstraints.EAST;
		gbc_lblAdresseIp.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresseIp.gridx = 1;
		gbc_lblAdresseIp.gridy = 1;
		contentPane.add(lblAdresseIp, gbc_lblAdresseIp);
		
		jTextFieldIP = new JTextField();
		jTextFieldIP.setText("127.0.0.1");
		GridBagConstraints gbc_jTextFieldIP = new GridBagConstraints();
		gbc_jTextFieldIP.insets = new Insets(0, 0, 5, 0);
		gbc_jTextFieldIP.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldIP.gridx = 2;
		gbc_jTextFieldIP.gridy = 1;
		contentPane.add(jTextFieldIP, gbc_jTextFieldIP);
		jTextFieldIP.setColumns(10);
		
		JButton btnPing = new JButton("Ping");
		btnPing.addActionListener(this);
		GridBagConstraints gbc_btnPing = new GridBagConstraints();
		gbc_btnPing.insets = new Insets(0, 0, 5, 0);
		gbc_btnPing.gridx = 2;
		gbc_btnPing.gridy = 2;
		contentPane.add(btnPing, gbc_btnPing);
		
		jLabelResultat = new JLabel("R\u00E9sultat :");
		GridBagConstraints gbc_jLabelResultat = new GridBagConstraints();
		gbc_jLabelResultat.gridx = 2;
		gbc_jLabelResultat.gridy = 3;
		contentPane.add(jLabelResultat, gbc_jLabelResultat);
	}
	public void actionPerformed(ActionEvent e) {
		try {
			InetAddress ia = InetAddress.getByName(jTextFieldIP.getText());
			if (ia.isReachable(10))
				jLabelResultat.setText("Ping success !");
			else
				jLabelResultat.setText("Ping failed ! ");
				
		} catch (UnknownHostException e1) {
			jLabelResultat.setText("unknown host");
//			e1.printStackTrace();
		} catch (IOException e1) {
			jLabelResultat.setText("IO Error");
//			e1.printStackTrace();
		}
		
	}

}
