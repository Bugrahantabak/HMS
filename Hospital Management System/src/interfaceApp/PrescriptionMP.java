package interfaceApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PrescriptionMP {

	private JFrame PrescriptionMP;
	private JTextField diagnosis;
	private JTextField medicines;
	private JTextField comments;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrescriptionMP window = new PrescriptionMP();
					window.PrescriptionMP.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrescriptionMP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		PrescriptionMP = new JFrame();
		PrescriptionMP.setTitle("Prescription MP");
		PrescriptionMP.setBounds(100, 100, 480, 360);
		PrescriptionMP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PrescriptionMP.getContentPane().setLayout(null);
		
		JLabel lblDiagnosis = new JLabel("Diagnosis");
		lblDiagnosis.setBounds(40, 53, 46, 14);
		PrescriptionMP.getContentPane().add(lblDiagnosis);
		
		diagnosis = new JTextField();
		diagnosis.setBounds(160, 50, 238, 20);
		PrescriptionMP.getContentPane().add(diagnosis);
		diagnosis.setColumns(10);
		
		JLabel lblMedicines = new JLabel("Medicines");
		lblMedicines.setBounds(40, 101, 46, 20);
		PrescriptionMP.getContentPane().add(lblMedicines);
		
		medicines = new JTextField();
		medicines.setBounds(160, 97, 238, 85);
		PrescriptionMP.getContentPane().add(medicines);
		medicines.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("(Name, Mg, Dose, Day)");
		lblNewLabel.setBounds(10, 132, 127, 14);
		PrescriptionMP.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Comments");
		lblNewLabel_1.setBounds(40, 210, 59, 14);
		PrescriptionMP.getContentPane().add(lblNewLabel_1);
		
		comments = new JTextField();
		comments.setBounds(160, 207, 238, 28);
		PrescriptionMP.getContentPane().add(comments);
		comments.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(183, 290, 89, 23);
		PrescriptionMP.getContentPane().add(btnSubmit);
	}
}
