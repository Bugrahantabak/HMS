package interfaceApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.Simulation;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Register {
	private Simulation simulation;
	private JFrame frame;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, Simulation simulation) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register(simulation);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Register( Simulation simulation) {
		this.simulation=simulation;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
	
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(77, 44, 52, 14);
		panel.add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.setBounds(136, 41, 86, 20);
		panel.add(txtName);
		txtName.setColumns(10);
	}
}
