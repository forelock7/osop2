package ua.bms.osop.model;

import java.util.Random;

/*
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * Implements model of   2 - "The appeals on the pre-trial investigation"("Апеляційні скарги з питань ДР");
 */
public class Unit2AppealCardModel {
	
	private String registrationNumber;
	private String proceedingNumber;
	private String offenseQualification;
	private String suspectedName;
	private String groundsForAppeal;
	
	private String someNewText;
	
	public Unit2AppealCardModel(String offenseQualification, String suspectedName, String groundsForAppeal) {
		this.registrationNumber = null;
		this.proceedingNumber = createProceedingNumber();
		this.offenseQualification = offenseQualification;
		this.suspectedName = suspectedName;
		this.groundsForAppeal = groundsForAppeal;
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
		return "Some NEW teXt U2(2)@##ds%&*^&*(&)" + Integer.toString(rnd.nextInt(999999999));
	}
	
	/*---Get Methods---*/
	
	public String getProceedingNumber() {
		return proceedingNumber;
	}
	
	public String getSuspectedName() {
		return suspectedName;
	}
	
	public String getOffenseQualification() {
		return offenseQualification;
	}
	
	public String getGroundsForAppeal() {
		return groundsForAppeal;
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
