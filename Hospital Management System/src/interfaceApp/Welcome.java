package interfaceApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import javax.swing.JButton;

public class Welcome {

	private JFrame frmMedyteHms;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
					window.frmMedyteHms.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMedyteHms = new JFrame();
		frmMedyteHms.setTitle("MEDIYTE HMS");
		frmMedyteHms.setBounds(100, 100, 450, 300);
		frmMedyteHms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMedyteHms.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("               Welcome to MEDIYTE HMS ");
		lblNewLabel.setForeground(new Color(153, 0, 102));
		lblNewLabel.setFont(new Font("Ebrima", Font.BOLD, 15));
		lblNewLabel.setBounds(58, 28, 307, 44);
		frmMedyteHms.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("        If you have an account please LOGIN or REGISTER ");
		lblNewLabel_1.setForeground(new Color(153, 0, 102));
		lblNewLabel_1.setFont(new Font("Ebrima", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(58, 83, 307, 44);
		frmMedyteHms.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Continue");
		btnNewButton.setFont(new Font("Ebrima", Font.PLAIN, 11));
		btnNewButton.setBounds(142, 164, 157, 23);
		frmMedyteHms.getContentPane().add(btnNewButton);
	}
}
