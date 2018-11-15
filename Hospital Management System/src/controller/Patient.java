package controller;

import java.util.ArrayList;

public class Patient extends User {

	private ArrayList labReportList;
	private ArrayList medicalHist;

	public Patient(String userName, String userPw, int identityNumber, Double userWeight, Double userHeight,
			Sex userSex, int userBirthYear) {
		super();
		Setter(userName, userPw, identityNumber, userWeight, userHeight, userSex, userBirthYear);
	}

	public void Setter(String userName, String userPw, int identityNumber, Double userWeight, Double userHeight,
			Sex userSex, int userBirthYear) {
		this.userName = userName;
		this.userPw = userPw;
		this.userWeight = userWeight;
		this.userHeight = userHeight;
		this.userSex = userSex;
		this.userBirthYear = userBirthYear;
		this.identityNumber = identityNumber;
	}

	public String toString() {
		return ("Patient " + userName + " " + userPw + " " + userHeight + " " + userWeight + " " + userSex + " "
				+ userBirthYear + " " + identityNumber);

	}

}