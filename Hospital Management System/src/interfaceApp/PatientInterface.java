package interfaceApp;

import java.awt.EventQueue;

import javax.swing.JFrame;

import controller.Simulation;
import controller.User;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class PatientInterface {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args, Simulation simulation) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientInterface window = new PatientInterface(simulation);
					window.frmPatient.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private Simulation simulation;
	private JFrame frmPatient;

	private User activeUser;
	private JTextField textField;
	private JTextField Name;
	private JTextField weight;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable diagnosis;

	/**
	 * Create the application.
	 */
	public PatientInterface(Simulation simulation) {
		this.simulation = simulation;
		this.activeUser = simulation.getActiveUser();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPatient = new JFrame();
		frmPatient.setTitle("Patient");
		frmPatient.setBounds(100, 100, 717, 486);
		frmPatient.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmPatient.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID Number");
		lblNewLabel.setBounds(25, 30, 98, 19);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(135, 26, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(25, 60, 46, 19);
		panel.add(lblName);
		
		Name = new JTextField();
		Name.setBounds(135, 56, 86, 20);
		panel.add(Name);
		Name.setColumns(10);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setBounds(25, 90, 46, 19);
		panel.add(lblWeight);
		
		weight = new JTextField();
		weight.setBounds(135, 86, 86, 20);
		panel.add(weight);
		weight.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Height");
		lblNewLabel_1.setBounds(25, 120, 46, 19);
		panel.add(lblNewLabel_1);
		
		JLabel lblSex = new JLabel("Sex");
		lblSex.setBounds(25, 150, 46, 15);
		panel.add(lblSex);
		
		textField_1 = new JTextField();
		textField_1.setBounds(135, 116, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(135, 146, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		diagnosis = new JTable();
		diagnosis.setBounds(264, 26, 411, 374);
		panel.add(diagnosis);
	}
}
