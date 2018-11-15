package interfaceApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrescriptionPatient {

	private JFrame frmPrescription;
	private JTextField DiagnosisPatient;
	private JTextField MedicinesPatient;
	private JTextField CommentsPatient;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrescriptionPatient window = new PrescriptionPatient();
					window.frmPrescription.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrescriptionPatient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrescription = new JFrame();
		frmPrescription.setTitle("Prescription");
		frmPrescription.setBounds(100, 100, 480, 360);
		frmPrescription.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrescription.getContentPane().setLayout(null);
		
		JLabel lblDiagnosis = new JLabel("Diagnosis");
		lblDiagnosis.setBounds(45, 53, 46, 14);
		frmPrescription.getContentPane().add(lblDiagnosis);
		
		DiagnosisPatient = new JTextField();
		DiagnosisPatient.setEditable(false);
		DiagnosisPatient.setBounds(160, 50, 240, 20);
		frmPrescription.getContentPane().add(DiagnosisPatient);
		DiagnosisPatient.setColumns(10);
		
		JLabel lblMedicines = new JLabel("Medicines");
		lblMedicines.setBounds(45, 103, 46, 14);
		frmPrescription.getContentPane().add(lblMedicines);
		
		MedicinesPatient = new JTextField();
		MedicinesPatient.setEditable(false);
		MedicinesPatient.setBounds(160, 100, 240, 77);
		frmPrescription.getContentPane().add(MedicinesPatient);
		MedicinesPatient.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("(Name, Mg, Dose, Day)");
		lblNewLabel.setBounds(10, 142, 125, 14);
		frmPrescription.getContentPane().add(lblNewLabel);
		
		JLabel lblComments = new JLabel("Comments");
		lblComments.setBounds(45, 224, 58, 14);
		frmPrescription.getContentPane().add(lblComments);
		
		CommentsPatient = new JTextField();
		CommentsPatient.setEditable(false);
		CommentsPatient.setBounds(160, 216, 240, 30);
		frmPrescription.getContentPane().add(CommentsPatient);
		CommentsPatient.setColumns(10);
	}

}
