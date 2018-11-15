package fileRead;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import controller.Diagnosis;
import controller.Simulation;
import controller.User;

public class FileRW {
	private final String fileNameUser = "Users.txt";
	private final String fileNameDiagnosis = "Diagnosis";
	private Simulation simulation;

	public FileRW() {
	}

	public FileRW(Simulation simulation) {
		this.simulation = simulation;
	}

	public void readFromFileDiagnosis() {

		String line = null;

		try {
			FileReader fileReader = new FileReader(fileNameDiagnosis);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file " + fileNameDiagnosis);
		} catch (IOException ex) {
			System.out.println("Error reading file " + fileNameDiagnosis);

		}

	}

	public void readFromFileUsers() {

		String line = null;

		try {
			FileReader fileReader = new FileReader(fileNameUser);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				

				
				
			}
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file " + fileNameUser);
		} catch (IOException ex) {
			System.out.println("Error reading file " + fileNameUser);

		}

	}

	public void writeFileDiagnosis() {

		try {
			FileWriter fileWriter = new FileWriter(fileNameDiagnosis);

			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			for (Diagnosis diagnosis : simulation.getHospital().getDiagnosisList()) {
				bufferedWriter.write(diagnosis.toString());
				bufferedWriter.newLine();
			}

			System.out.println("Write to File Successfull");
			bufferedWriter.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file" + fileNameDiagnosis);
		}
	}

	public void writeFileUsers() {

		try {
			FileWriter fileWriter = new FileWriter(fileNameUser);

			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			for (User user : simulation.getHospital().getUserList()) {
				bufferedWriter.write(user.toString());
				bufferedWriter.newLine();
			}
			System.out.println("Write to File Successfull");
			bufferedWriter.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file" + fileNameUser);
		}
	}

}
