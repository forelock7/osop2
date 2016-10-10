package ua.bms.osop.model;

import java.util.Random;

/*
 * Implements model of 3 - "Started Crime Proceedings"("Розпочато кримінальних проваджень") Card(Unit 1)
 */
public class Unit1CriminalCardModel {
	
	private String registrationNumber;
	private String criminalProceedingNumber;
	private String registrationDate;
	private String section;
	private String theory;
	
	private String someNewText;
	
	/*Constructor of Unit 6 Model Object*/
	public Unit1CriminalCardModel(String registrationDate, String section, String theory) {
		this.registrationNumber = null;
		this.criminalProceedingNumber = createCriminalProceedingNumber();
		
		this.registrationDate = registrationDate;
		this.section = section;
		this.theory = theory;
		
		this.someNewText = creatNewText();
	}

	/*Generation of random number of Claim*/
	private String createCriminalProceedingNumber() {
		Random rnd = new Random();
		return Integer.toString(rnd.nextInt(99999999));
	}
	
	/*Generation of random new text for editing some Text Field*/
	private String creatNewText() {
		Random rnd = new Random();
		return "Some NEW teXt U6!@##$$%&*^&*(&)" + Integer.toString(rnd.nextInt(999999999));
	}
	
	/*---Get Methods---*/
	
	public String getCriminalProceedingNumber() {
		return criminalProceedingNumber;
	}
	
	public String getRegistrationDate() {
		return registrationDate;
	}
	
	public String getSection() {
		return section;
	}

	public String getTheory() {
		return theory;
	}
	
	public String getSomeNewText() {
		return someNewText;
	}
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	/*---Set Methods---*/
	
	public void setRegistrationNumber (String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
}
