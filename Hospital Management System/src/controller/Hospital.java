package controller;

import java.util.ArrayList;

public class Hospital {
	private ArrayList<User> userList;
	private ArrayList<Diagnosis> diagnosisList;

	public Hospital() {
		setUserList(new ArrayList<User>());

	}

	public ArrayList<Diagnosis> getDiagnosisList() {
		return diagnosisList;
	}

	public ArrayList<User> getUserList() {
		return userList;
	}

	public void setDiagnosisList(ArrayList<Diagnosis> diagnosisList) {
		this.diagnosisList = diagnosisList;
	}

	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}

}
