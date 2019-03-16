package cours06;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class JFrameSwap extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField jTextField1;
	private JTextField jTextField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameSwap frame = new JFrameSwap();
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
	public JFrameSwap() {
		setTitle("Swap");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 441, 171);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel jPanelBas = new JPanel();
		contentPane.add(jPanelBas, BorderLayout.SOUTH);
		
		JButton jButtonSwap = new JButton("Swap");
		jButtonSwap.addActionListener(this);
		
		JButton jButtonCancel = new JButton("Cancel");
		jButtonCancel.addActionListener(this);
		
		jPanelBas.add(jButtonCancel);
		jPanelBas.add(jButtonSwap);
		
		JPanel jPanelCentre = new JPanel();
		contentPane.add(jPanelCentre, BorderLayout.CENTER);
		GridBagLayout gbl_jPanelCentre = new GridBagLayout();
		gbl_jPanelCentre.columnWidths = new int[]{0, 0, 0};
		gbl_jPanelCentre.rowHeights = new int[]{0, 0, 0};
		gbl_jPanelCentre.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_jPanelCentre.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		jPanelCentre.setLayout(gbl_jPanelCentre);
		
		JLabel jLabel1 = new JLabel("1er champ :");
		GridBagConstraints gbc_jLabel1 = new GridBagConstraints();
		gbc_jLabel1.anchor = GridBagConstraints.EAST;
		gbc_jLabel1.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel1.gridx = 0;
		gbc_jLabel1.gridy = 0;
		jPanelCentre.add(jLabel1, gbc_jLabel1);
		
		jTextField1 = new JTextField();
		jTextField1.setText("");
		GridBagConstraints gbc_jTextField1 = new GridBagConstraints();
		gbc_jTextField1.insets = new Insets(0, 0, 5, 0);
		gbc_jTextField1.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextField1.gridx = 1;
		gbc_jTextField1.gridy = 0;
		jPanelCentre.add(jTextField1, gbc_jTextField1);
		jTextField1.setColumns(10);
		
		JLabel jLabel2 = new JLabel("2\u00E8me champ :");
		GridBagConstraints gbc_jLabel2 = new GridBagConstraints();
		gbc_jLabel2.anchor = GridBagConstraints.EAST;
		gbc_jLabel2.insets = new Insets(0, 0, 0, 5);
		gbc_jLabel2.gridx = 0;
		gbc_jLabel2.gridy = 1;
		jPanelCentre.add(jLabel2, gbc_jLabel2);
		
		jTextField2 = new JTextField();
		jTextField2.setText("");
		GridBagConstraints gbc_jTextField2 = new GridBagConstraints();
		gbc_jTextField2.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextField2.gridx = 1;
		gbc_jTextField2.gridy = 1;
		jPanelCentre.add(jTextField2, gbc_jTextField2);
		jTextField2.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		switch (actionEvent.getActionCommand()) {
		case "Cancel":
			jTextField1.setText("");
			jTextField2.setText("");
			break;
		case "Swap":
			String s = jTextField1.getText();
			jTextField1.setText(jTextField2.getText());
			jTextField2.setText(s);
			break;
		}
		
	}

}
