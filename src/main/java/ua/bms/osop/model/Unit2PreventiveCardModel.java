package ua.bms.osop.model;

import java.util.Random;

/*
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * Implements model of 3 - "The Preventive Action"("Запобіжні заходи");
 */
public class Unit2PreventiveCardModel {
	
	private String registrationNumber;
	private String proceedingNumber;
	private String offenseQualification;
	private String investigationBeginDate;
	private String lastName;
	private String firstName;
	private String birthday;
	
	private String someNewText;

	public Unit2PreventiveCardModel(String offenseQualification, String investigationBeginDate, String lastName, String firstName, String birthday) {
		this.registrationNumber = null;
		this.proceedingNumber = createProceedingNumber();
		this.offenseQualification = offenseQualification;
		this.investigationBeginDate = investigationBeginDate;
		this.lastName = lastName;
		this.firstName = firstName;
		this.birthday = birthday;
		this.someNewText = creatNewText();
	}
	
	/*Generation of random number of Proceeding*/
	private String createProceedingNumber() {
		Random rnd = new Random();
		return Integer.toString(rnd.nextInt(999999999));
	}
	
	/*Generation of random new text for editing some Text Field*/
	private String creatNewText() {
		Random rnd = new Random();
		return "Some NEW teXt U2@##dddghfhds$$%&*^&*(&)" + Integer.toString(rnd.nextInt(999999999));
	}
	
	/*---Get Methods---*/
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	public String getProceedingNumber() {
		return proceedingNumber;
	}
	
	public String getInvestigationBeginDate() {
		return investigationBeginDate;
	}
	
	public String getOffenseQualification() {
		return offenseQualification;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public String getSomeNewText() {
		return someNewText;
	}
	
	/*---Set Methods---*/
	
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}


}
