package interfaceApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.Sex;
import controller.Simulation;
import fileRead.FileRW;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class RegisterInterface {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args, Simulation simulation) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterInterface window = new RegisterInterface(simulation);
					window.frmRegister.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private Simulation simulation;
	private JFrame frmRegister;
	private JTextField txtName;
	private JTextField textId;
	private JTextField textPw;
	private JTextField textWeight;
	private JTextField textHeight;

	private JTextField BirthYear;

	/**
	 * Create the application.
	 */
	public RegisterInterface(Simulation simulation) {
		this.simulation = simulation;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
		frmRegister = new JFrame();
		frmRegister.setTitle("Register");
		frmRegister.setBounds(100, 100, 477, 385);
		frmRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frmRegister.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(77, 45, 52, 14);
		panel.add(lblNewLabel);

		txtName = new JTextField();
		txtName.setBounds(136, 41, 86, 20);
		panel.add(txtName);
		txtName.setColumns(10);

		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(77, 95, 46, 14);
		panel.add(lblId);

		textId = new JTextField();
		textId.setBounds(136, 91, 86, 20);
		panel.add(textId);
		textId.setColumns(10);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(77, 70, 52, 14);
		panel.add(lblPassword);

		textPw = new JTextField();
		textPw.setBounds(136, 66, 86, 20);
		panel.add(textPw);
		textPw.setColumns(10);

		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setBounds(77, 120, 46, 14);
		panel.add(lblWeight);

		textWeight = new JTextField();
		textWeight.setBounds(136, 116, 86, 20);
		panel.add(textWeight);
		textWeight.setColumns(10);

		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setBounds(77, 145, 46, 14);
		panel.add(lblHeight);

		textHeight = new JTextField();
		textHeight.setBounds(136, 141, 86, 20);
		panel.add(textHeight);
		textHeight.setColumns(10);

		JComboBox comboBoxSex = new JComboBox();
		comboBoxSex.setBounds(136, 191, 86, 20);
		panel.add(comboBoxSex);
		comboBoxSex.addItem(String.valueOf(Sex.MALE));
		comboBoxSex.addItem(String.valueOf(Sex.FEMALE));

		JLabel lblNewLabel_1 = new JLabel("Sex:");
		lblNewLabel_1.setBounds(77, 195, 46, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Birth Year:");
		lblNewLabel_2.setBounds(77, 170, 62, 14);
		panel.add(lblNewLabel_2);

		BirthYear = new JTextField();
		BirthYear.setBounds(136, 166, 86, 20);
		panel.add(BirthYear);
		BirthYear.setColumns(10);

		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				simulation.addPatient(txtName.getText(), textPw.getText(), Integer.valueOf(textId.getText()),
						Double.valueOf(textWeight.getText()), Double.valueOf(textHeight.getText()),
						Sex.valueOf((String) comboBoxSex.getSelectedItem()), Integer.valueOf(BirthYear.getText()));
				frmRegister.setVisible(false);
				System.out.println("New user" + txtName.getText());
				FileRW fileRW = new FileRW(simulation);
				fileRW.writeFileUsers();
				fileRW.readFromFileUsers();
			}
		});

		btnRegister.setBounds(284, 42, 97, 170);
		panel.add(btnRegister);
	}
}
