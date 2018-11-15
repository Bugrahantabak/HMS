package controller;

public class Diagnosis {
	private User activeUser;
	private String diagnosisSum;
	private String medication;

	public Diagnosis(User activeUser, String diagnosisSum, String medication) {
		this.activeUser = activeUser;
		this.diagnosisSum = diagnosisSum;
		this.medication = medication;
	}

}
