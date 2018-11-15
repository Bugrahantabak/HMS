package controller;

import java.util.ArrayList;

public class Hospital {
	private ArrayList<User> userList;

	public Hospital() {
		setUserList(new ArrayList<User>());

	}

	public ArrayList<User> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}

}
