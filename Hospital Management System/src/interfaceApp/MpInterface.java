package interfaceApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.Simulation;
import controller.User;

import javax.swing.JTextArea;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MpInterface {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, Simulation simulation) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MpInterface window = new MpInterface(simulation);
					window.frmMpInterface.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JFrame frmMpInterface;
	private JTextField txtAsd;
	private JTable table;
	private JTextField txtName;
	private Simulation simulation;
	private JTextField textWeight;
	private JTextField textHeight;
	private JTextField textSex;

	private JTextField textuserBirthYear;
	private JTextField BloodType;

	/**
	 * Create the application.
	 */
	public MpInterface(Simulation simulation) {
		this.simulation = simulation;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMpInterface = new JFrame();
		frmMpInterface.setTitle("Medical Personnel");
		frmMpInterface.setBounds(100, 100, 714, 495);
		frmMpInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frmMpInterface.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("ID Number");
		lblNewLabel.setBounds(26, 44, 86, 14);
		panel.add(lblNewLabel);

		txtAsd = new JTextField();
		txtAsd.setBounds(134, 41, 86, 20);
		panel.add(txtAsd);
		txtAsd.setColumns(10);

		table = new JTable();
		table.setBounds(424, 44, 240, 385);
		panel.add(table);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(51, 87, 46, 14);
		panel.add(lblName);

		JLabel lblNewLabel_1 = new JLabel("Weight");
		lblNewLabel_1.setBounds(51, 112, 46, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Height");
		lblNewLabel_2.setBounds(51, 137, 46, 14);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Birth Year");
		lblNewLabel_3.setBounds(51, 187, 61, 14);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Sex");
		lblNewLabel_4.setBounds(51, 162, 46, 14);
		panel.add(lblNewLabel_4);

		txtName = new JTextField();
		txtName.setEditable(false);

		txtName.setBounds(134, 84, 86, 20);
		panel.add(txtName);
		txtName.setColumns(10);

		JButton btnAdsad = new JButton("Search");
		btnAdsad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				User patient = simulation.searchUser(txtAsd.getText());
				if (patient != null) {
			txtName.setText(patient.getUserName());
					textHeight.setText(String.valueOf(patient.getUserHeight()));
					textWeight.setText(String.valueOf(patient.getUserWeight()));
					textSex.setText(String.valueOf(patient.getUserSex()));
					textuserBirthYear.setText(String.valueOf(patient.getUserBirthYear()));
			
				}
			}
		});
		btnAdsad.setBounds(260, 40, 89, 23);
		panel.add(btnAdsad);

		textWeight = new JTextField();
		textWeight.setEditable(false);
		textWeight.setBounds(134, 109, 86, 20);
		panel.add(textWeight);
		textWeight.setColumns(10);

		textHeight = new JTextField();
		textHeight.setEditable(false);
		textHeight.setBounds(134, 134, 86, 20);
		panel.add(textHeight);
		textHeight.setColumns(10);

		textSex = new JTextField();
		textSex.setEditable(false);
		textSex.setBounds(134, 159, 86, 20);
		panel.add(textSex);
		textSex.setColumns(10);

		textuserBirthYear = new JTextField();
		textuserBirthYear.setEditable(false);
		textuserBirthYear.setBounds(134, 184, 86, 20);
		panel.add(textuserBirthYear);
		textuserBirthYear.setColumns(10);
		
		JButton btnNewButton = new JButton("Add Diagnosis");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(94, 267, 126, 23);
		panel.add(btnNewButton);
		
		JLabel lblBloodType = new JLabel("Blood Type");
		lblBloodType.setBounds(51, 212, 61, 14);
		panel.add(lblBloodType);
		
		BloodType = new JTextField();
		BloodType.setBounds(134, 208, 86, 20);
		panel.add(BloodType);
		BloodType.setColumns(10);
	}
}
