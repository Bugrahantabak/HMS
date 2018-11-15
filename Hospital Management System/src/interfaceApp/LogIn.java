package interfaceApp;

import controller.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;
import java.awt.event.ActionEvent;

public class LogIn {

	private JFrame frame;
	private JTextField userPW;
	private JTextField userName;
	private JLabel lblUserPw;
	private Simulation simulation;

	public static void main(String[] args, Simulation simulation) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn(simulation);
					window.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LogIn(Simulation simulation) {
		this.simulation = simulation;
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		userPW = new JTextField();
		userPW.setBounds(166, 99, 86, 20);
		panel.add(userPW);
		userPW.setColumns(10);

		userName = new JTextField();
		userName.setBounds(166, 68, 86, 20);
		panel.add(userName);
		userName.setColumns(10);

		JLabel nameLabel = new JLabel("User Name:");
		nameLabel.setBounds(88, 71, 68, 14);
		panel.add(nameLabel);

		lblUserPw = new JLabel("User Pw:");
		lblUserPw.setBounds(88, 102, 56, 14);
		panel.add(lblUserPw);

		JButton btnLogn = new JButton("LogIn");
		btnLogn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (simulation.logIn(userName.getText(), userPW.getText())) {
					// Yeni pencere aç
				}else {
					// Uyarı çıkart
				}

			}
		});
		btnLogn.setBounds(163, 151, 89, 23);
		panel.add(btnLogn);
	}
}
