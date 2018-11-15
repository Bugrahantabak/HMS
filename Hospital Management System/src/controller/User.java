package controller;

public class User {

	protected String userName;
	protected String userPw;
	protected int identityNumber;
	protected Double userWeight;
	protected Double userHeight;
	protected Sex userSex;
	protected int userBirthYear;
	protected String bloodType;

	public User() {

	}

	public User(String userName, String userPw, int identityNumber) {
		this.userName = userName;
		this.userPw = userPw;
		this.setIdentityNumber(identityNumber);
	}

	public int getIdentityNumber() {
		return identityNumber;
	}

	public int getUserBirthYear() {
		return userBirthYear;
	}

	public Double getUserHeight() {
		return userHeight;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserPw() {
		return userPw;
	}

	public Sex getUserSex() {
		return userSex;
	}

	public Double getUserWeight() {
		return userWeight;
	}

	public void setIdentityNumber(int identityNumber) {
		this.identityNumber = identityNumber;
	}

	public void setUserBirthYear(int userBirthYear) {
		this.userBirthYear = userBirthYear;
	}

	public void setUserHeight(Double userHeight) {
		this.userHeight = userHeight;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public void setUserSex(Sex userSex) {
		this.userSex = userSex;
	}

	public void setUserWeight(Double userWeight) {
		this.userWeight = userWeight;
	}

}
