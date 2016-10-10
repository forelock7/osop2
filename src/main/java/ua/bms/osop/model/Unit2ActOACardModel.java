package ua.bms.osop.model;

import java.util.Random;

/*
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * Implements model of 5 - "Acts of supervision over Operational Activities"("Акти нагляду за ОРД");
 */
public class Unit2ActOACardModel {
	
	private String registrationNumber;
	private String decisionDate;
	private String amountOfChecked; 
	
	private String someNewText;
	
	public Unit2ActOACardModel(String decisionDate) {
		this.registrationNumber = null;
		this.decisionDate = decisionDate;
		this.amountOfChecked = createAmountOfCheked();

		this.someNewText = creatNewText();
	}
	
	/*Generation of random number of Proceeding*/
	private String createAmountOfCheked() {
		Random rnd = new Random();
		return Integer.toString(rnd.nextInt(99999));
	}
	
	/*Generation of random new text for editing some Text Field*/
	private String creatNewText() {
		Random rnd = new Random();
		return Integer.toString(rnd.nextInt(999999));
	}
	
	/*---Get Methods---*/
	
	public String getDecisionDate() {
		return decisionDate;
	}
	
	public String getAmountOfChecked() {
		return amountOfChecked;
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
