package interfaceApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;

public class Admin {

	private JFrame frmAdministrator;
	private JTextField NameMP;
	private JTextField PasswordMP;
	private JTextField IDNumberMP;
	private JTextField IDRemove;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
					window.frmAdministrator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdministrator = new JFrame();
		frmAdministrator.setTitle("Administrator");
		frmAdministrator.setBounds(100, 100, 480, 360);
		frmAdministrator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdministrator.getContentPane().setLayout(null);
		
		JLabel lblMpRegister = new JLabel("MP Register");
		lblMpRegister.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMpRegister.setBounds(80, 66, 78, 22);
		frmAdministrator.getContentPane().add(lblMpRegister);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 113, 46, 14);
		frmAdministrator.getContentPane().add(lblName);
		
		NameMP = new JTextField();
		NameMP.setBounds(72, 110, 86, 20);
		frmAdministrator.getContentPane().add(NameMP);
		NameMP.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 168, 46, 14);
		frmAdministrator.getContentPane().add(lblPassword);
		
		PasswordMP = new JTextField();
		PasswordMP.setBounds(72, 164, 86, 20);
		frmAdministrator.getContentPane().add(PasswordMP);
		PasswordMP.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID Number");
		lblNewLabel.setBounds(10, 223, 59, 14);
		frmAdministrator.getContentPane().add(lblNewLabel);
		
		IDNumberMP = new JTextField();
		IDNumberMP.setBounds(72, 220, 86, 20);
		frmAdministrator.getContentPane().add(IDNumberMP);
		IDNumberMP.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(40, 271, 89, 23);
		frmAdministrator.getContentPane().add(btnRegister);
		
		JLabel lblRemoveUser = new JLabel("Remove User");
		lblRemoveUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRemoveUser.setBounds(295, 66, 89, 22);
		frmAdministrator.getContentPane().add(lblRemoveUser);
		
		JLabel lblIdNumber = new JLabel("ID Number");
		lblIdNumber.setBounds(222, 113, 59, 14);
		frmAdministrator.getContentPane().add(lblIdNumber);
		
		IDRemove = new JTextField();
		IDRemove.setBounds(295, 110, 89, 20);
		frmAdministrator.getContentPane().add(IDRemove);
		IDRemove.setColumns(10);
		
		JButton btnNewButton = new JButton("Remove");
		btnNewButton.setBounds(284, 271, 89, 23);
		frmAdministrator.getContentPane().add(btnNewButton);
	}

}
