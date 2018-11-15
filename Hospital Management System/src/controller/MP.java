package controller;

public class MP extends User {
	private int roomNumber;

	public MP(String userName, String userPw, int identityNumber) {
		super();
		Setter(userName, userPw, identityNumber);
	}

	public void Setter(String userName, String userPw, int identityNumber) {
		this.userName = userName;
		this.userPw = userPw;
		this.identityNumber = identityNumber;
	}

	public String toString() {
		return ("MP " + userName + " " + userPw + " " + identityNumber);

	}
}
