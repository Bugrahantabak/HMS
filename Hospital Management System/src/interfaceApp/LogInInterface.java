package interfaceApp;

import controller.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import com.sun.java.swing.plaf.windows.resources.windows;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.border.LineBorder;
import javax.swing.JTree;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JList;

public class LogInInterface {

	public static void main(String[] args, Simulation simulation) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInInterface window = new LogInInterface(simulation);
					window.frmLognMedyte.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JFrame frmLognMedyte;
	private JTextField userPW;
	private JTextField userName;
	private JLabel lblUserPw;
	private Simulation simulation;

	private JButton btnRegister;

	public LogInInterface(Simulation simulation) {
		this.simulation = simulation;
		initialize();
	}

	private void initialize() {
		frmLognMedyte = new JFrame();
		frmLognMedyte.setTitle("LogIn MEDIYTE");
		frmLognMedyte.setBounds(100, 100, 482, 326);
		frmLognMedyte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		frmLognMedyte.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		userPW = new JTextField();
		userPW.setBounds(215, 99, 86, 20);
		panel.add(userPW);
		userPW.setColumns(10);

		userName = new JTextField();
		userName.setBounds(215, 68, 86, 20);
		panel.add(userName);
		userName.setColumns(10);

		JLabel nameLabel = new JLabel("User Name");
		nameLabel.setBounds(54, 71, 68, 14);
		panel.add(nameLabel);

		lblUserPw = new JLabel("User Password");
		lblUserPw.setBounds(54, 99, 86, 20);
		panel.add(lblUserPw);

		JButton btnLogn = new JButton("Log In");
		btnLogn.setBackground(Color.WHITE);
		btnLogn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (simulation.logIn(userName.getText(), userPW.getText())) {
					if (simulation.getActiveUser() instanceof MP) {
						MpInterface.main(null, simulation);
						frmLognMedyte.setVisible(false);
					}
				} else {
					// Uyarı çıkart
				}

			}
		});
		btnLogn.setBounds(212, 150, 89, 23);
		panel.add(btnLogn);

		btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegisterInterface.main(null, simulation);
			}
		});
		btnRegister.setBounds(212, 187, 89, 23);
		panel.add(btnRegister);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, -21, 486, 325);
		panel.add(lblNewLabel);
	}
}
