package controller;

import interfaceApp.*;
import java.util.ArrayList;

public class Simulation {

	private Hospital hospital;
	private LogIn logIn;
	private User activeUser;

	public Simulation() {
		start();
	}

	public void start() {
		hospital = new Hospital();
		LogIn.main(null, this);
	}

	public boolean logIn(String userName, String userPw) {

		for (User user : hospital.getUserList()) {
			if (user.getUserName().equals(userName)) {
				if (user.getUserPw().equals(userPw)) {
					activeUser = user;
					System.out.println("Login Success");
					return true;
				}
			}
		}
		System.out.println("Login Fail");
		return false;
	}

	public void addUser(int userID, String userName, String userPw) {
		hospital.getUserList().add(new User(userName, userPw));
	}

	public void addUser(String userName, String userPw, Double userWeight, Double userHeight, Sex userSex,
			int userBirthYear) {
		hospital.getUserList().add(new User(userName, userPw, userWeight, userHeight, userSex, userBirthYear));
	}

	public Simulation getThis() {
		return this;
	}

}
