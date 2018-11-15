package controller;

import interfaceApp.*;

public class Simulation {

	private Hospital hospital;
	private LogInInterface logIn;
	private User activeUser;

	public Simulation() {
		start();
	}

	public void addMp(int userID, String userName, String userPw, int identityNumber) {
		hospital.getUserList().add(new MP(userName, userPw, identityNumber));
		System.out.println("New Mp: " + userName);
	}

	public void addPatient(String userName, String userPw, int identityNumber, Double userWeight, Double userHeight,
			Sex userSex, int userBirthYear) {
		hospital.getUserList()
				.add(new Patient(userName, userPw, identityNumber, userWeight, userHeight, userSex, userBirthYear));
	}

	public void addUser(String userName, String userPw, int identityNumber, Double userWeight, Double userHeight,
			Sex userSex, int userBirthYear) {
		hospital.getUserList()
				.add(new Patient(userName, userPw, identityNumber, userWeight, userHeight, userSex, userBirthYear));
		System.out.println("New user: " + userName);
	}

	public User getActiveUser() {
		return activeUser;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public LogInInterface getLogIn() {
		return logIn;
	}

	public Simulation getThis() {
		return this;
	}

	public boolean logIn(String userName, String userPw) {

		for (User user : hospital.getUserList()) {
			if (user instanceof MP) {
				if (user.getUserName().equals(userName)) {
					if (user.getUserPw().equals(userPw)) {
						setActiveUser(user);
						System.out.println("Login Success");
						return true;
					}
				}
			}
		}
		System.out.println("Login Fail");
		return false;
	}

	public User searchUser(String id) {

		for (User user : hospital.getUserList()) {
			if (user.getIdentityNumber() == Integer.valueOf(id)) {
				return user;
			}
		}
		System.out.println("Search Fail");
		return null;
	}

	public void setActiveUser(User activeUser) {
		this.activeUser = activeUser;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public void setLogIn(LogInInterface logIn) {
		this.logIn = logIn;
	}

	public void start() {

		hospital = new Hospital();
		addMp(1, "a", "a", 11);
		System.out.println(hospital.getUserList().toString());
		LogInInterface.main(null, this);
	}

}
