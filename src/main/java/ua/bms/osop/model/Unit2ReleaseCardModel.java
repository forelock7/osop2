package ua.bms.osop.model;

import java.util.Random;

/*
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * 4 - "The release from custody"("Звільнення з-під варти");
 */
public class Unit2ReleaseCardModel {
	
	private String registrationNumber;
	private String proceedingNumber;
	private String finalDecisionDate;
	private String caseNumber;
	
	private String someNewText;
	
	public Unit2ReleaseCardModel(String caseNumber, String finalDecisionDate) {
		this.registrationNumber = null;
		this.proceedingNumber = createProceedingNumber();
		this.finalDecisionDate = finalDecisionDate;
		this.caseNumber = caseNumber;
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
	
	public String getFinalDecisionDate() {
		return finalDecisionDate;
	}
	
	public String getCaseNumber() {
		return caseNumber;
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
