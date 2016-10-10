package ua.bms.osop.model;

import java.util.Random;


/*
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * Implements model of 1 - "Acts of supervision over pre-trial investigation" Card("Акти нагляду за ДР");
 */
public class Unit2ActPICardModel {

	private String registrationNumber;
	private String proceedingNumber;
	private String offenseQualification; 
	private String investigationBeginDate;
	private String content;
	
	
	private String someNewText;
	
	public Unit2ActPICardModel(String offenseQualification, String investigationBeginDate, String content) {
		this.registrationNumber = null;
		this.proceedingNumber = createProceedingNumber();
		this.offenseQualification = offenseQualification;
		this.investigationBeginDate = investigationBeginDate;
		this.content = content;
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
	
	public String getProceedingNumber() {
		return proceedingNumber;
	}
	
	public String getInvestigationBeginDate() {
		return investigationBeginDate;
	}
	
	public String getOffenseQualification() {
		return offenseQualification;
	}
	
	public String getContent() {
		return content;
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
