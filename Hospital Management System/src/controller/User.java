package controller;

public class User {

	private String userName;
	private String userPw;
	private Double userWeight;
	private Double userHeight;
	private Sex userSex;
	private int userBirthYear;

	public User() {

	}

	public User(String userName, String userPw) {
		this.userName = userName;
		this.userPw = userPw;
	}

	public User(String userName, String userPw, Double userWeight, Double userHeight, Sex userSex, int userBirthYear) {
		this.userName = userName;
		this.userPw = userPw;
		this.userWeight = userWeight;
		this.userHeight = userHeight;
		this.userSex = userSex;
		this.userBirthYear = userBirthYear;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public Double getUserWeight() {
		return userWeight;
	}

	public void setUserWeight(Double userWeight) {
		this.userWeight = userWeight;
	}

	public Double getUserHeight() {
		return userHeight;
	}

	public void setUserHeight(Double userHeight) {
		this.userHeight = userHeight;
	}

	public Sex getUserSex() {
		return userSex;
	}

	public void setUserSex(Sex userSex) {
		this.userSex = userSex;
	}

	public int getUserBirthYear() {
		return userBirthYear;
	}

	public void setUserBirthYear(int userBirthYear) {
		this.userBirthYear = userBirthYear;
	}

}
